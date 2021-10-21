package quiz;

import java.util.Random;
import java.util.Scanner;

/*
게임설명 : 야구게임을 메소드를 이용하여 구현한다.
1. 중복되지 않는 3개의 정수를 생성한다.(1~9)
2. 사용자는 3개의 숫자를 입력한다.
3. 생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
4. 숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
5. 숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
6. 숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
7. 3 strike 가 되면 게임은 종료된다.
8. 시도한 횟수를 표시한다.
9. 계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

위 문제의 변수들은 아래와 같이 생성하여 구현해본다.
   int com1, com2, com3;
   int user1, user2, user3;
아니면 
   int[] com = new int[3];
   int[] user = new int[3];
와 같이 배열을 사용해도 된다. 
 */
public class QuBaseballGame {
	public static void main(String[] args) {
	
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		//게임에서 사용할 변수
		int com1, com2, com3;
		int user1, user2, user3;
		int randomCnt = 0; //난수생성 카운트
		int gameCount = 0; //게임 카운트
		int strikeCnt = 0, ballCnt= 0; //스트라이크, 볼 카운트
	}
}