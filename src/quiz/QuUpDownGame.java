package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
게임설명 : 업다운게임을 메소드를 이용해 구현한다.
1. 컴퓨터는 1~100사이의 숫자 하나를 생성한다.
2. 총 시도횟수는 7번을 부여한다.
3. 사용자는 7번의 시도안에 숫자를 맞춰야 한다.
4. 사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
5. 7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
6. 성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 
	종료한다. 
7.	함수를 사용하여 구현한다.
8. 무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 
	Enter키를 제거해주도록 하자.

업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오
클래스명 : NumberRangeException
게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오.
 */

class NumberRangeException extends Exception {

	public NumberRangeException() {
		super("제대로하세요;;\n");

	}
}

public class QuUpDownGame {

	
	public static int random() {
		Random r = new Random();
		return(r.nextInt(100)+1);
		

	
	 
	
	}

	public static int user() throws NumberRangeException {
		
		Scanner user = new Scanner(System.in);
		int choice = 0;
		
		try {
			choice = user.nextInt(); 
		}
		catch(InputMismatchException e) {}
		
		if(choice>100 || choice<1) {
			NumberRangeException ex = new NumberRangeException();
			throw ex; 
		}
		
	
		return choice;
	}

	
	public static void game() {
	
		int count = 0;
		int computer = random();
		
		System.out.println("컴퓨터: "+ computer );
		
		while(true) {
			
			int choice=0;
			
			try {
				System.out.print("숫자를 입력하세영 :");
				choice = user();
			}
			catch(NumberRangeException e){
				System.out.println(e.getMessage());
				continue;
			}
			if(count<7 && choice==computer) {
				System.out.println("성공ㅇㅅㅇ!");
			}
			else if (choice < computer) {
				System.out.println("UP!");
				count++;
			}
			else {
				System.out.println("DOWN!");
				count++;
			}
			if(count==7) {
				System.out.println("실패ㅠㅅㅠ");
				System.out.println("정답은~ "+ computer);
				System.out.print("7번의 게임이 끝났습니다. 게임을"
						+ " 계속하시겠습니까? 재시작(1), 종료(0) : ");
				
				Scanner scan = new Scanner(System.in);
				choice = scan.nextInt();
				
				while (choice != 1 && choice != 0) {
					System.out.println("잘못입력 하셨습니다.");
					System.out.print("재시작(1), 종료(0) :");
					
					choice = scan.nextInt();
				}
				if(choice == 1) {
					count = 0;
					System.out.println("게임 재시작");
					continue;
				}
				else if(choice == 0) {
					System.out.println("게임 종료");
					return;	
				}
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("UP DOWN GAME~!");
		System.out.println("1 ~ 100까지 컴퓨터의 숫자를 맞추세요!");
		game();
	}
}
