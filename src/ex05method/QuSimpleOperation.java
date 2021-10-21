package ex05method;

import java.util.Scanner;

/*
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 
작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타(인자)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
메소드명 : arithmetic() 
 */
public class QuSimpleOperation {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 숫자를 입력하세요.(모두 0 이상의 양의 정수이다.)");
		System.out.print("첫번째숫자:");
		int s = scanner.nextInt();
		System.out.print("두번째숫자:");
		int e = scanner.nextInt();
		arithmetic(s, e);
	}
	//반환값은 없고, 매개변수만 있는 메소드
	static void arithmetic(int num1, int num2) {
		int a = num1 ;
		int b = num2 ;
		System.out.println("덧셈결과 -> "+ (a+b));
		System.out.println("뺄셈결과 -> "+ (a-b));
		System.out.println("곱셈결과 -> "+ (a*b));
		System.out.println("나눗셈 몫 -> "+ (a/b));
		System.out.println("나눗셈 나머지 -> "+ (a%b));
	}
	//%기호를 콘솔에 출력하기 위해서 이스케이프 시퀀스를
	//사용함. %%
}
