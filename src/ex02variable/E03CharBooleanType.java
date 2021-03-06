package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {
		
		/*
		char형 : 하나의 문자를 저장할수 있는 자료형으로 값을 저장할때
			'(singl3 quotation)으로 감싸서 표현한다.
			만약 "(double quotation)으로 감싸면 문자열로 인식하므로
			String으로 선언해야한다.
		 */
		char ch1 = '가';
		//char chStr = '가나다라'; //에러발생. 문자열이므로 char로 선언불가능
		String chStr = "가나다라"; //String으로 선언해야함.
		System.out.println("ch1="+ ch1);
		System.out.println("chStr="+ chStr);
		
		/*
		아스키코드 :1byte로 표현할수 있는 문자(영어, 숫자)를 십진수로
			정의한것을 말한다.
			Ex) A => 65로 표현됨. a => 97로 표현됨.
		유니코드 : 1byte로 표현할 수 없는 문자(한글, 한자, 일본어 등)를
			2byte로 표현한것을 말한다. 주로 16진수로 표현한다.
		 */
		char ch2 = 'A'; // 65로 저장됨.
		int num1 = 2;
		int num2 = ch2 + num1; // 65 + 2 = 67
		System.out.println("num2="+ num2); // 67출력됨
		System.out.println("(char)num2="+ (char)num2); // 67 = C 출력됨
		
		char ch3 = (char)(ch2+num1); // (char형변환)(char+int=>int) => char로 변환됨 
		System.out.println("ch3(문자출력)=>"+ ch3); //C 출력됨
		System.out.println("ch3(아스키코드출력)=>"+ (int)ch3); //C = 67출력됨
		
		char ch4 = '1'; //숫자가 아니라 문자 1이므로 49로 저장된다.	
						//(싱글쿼테이셔능로 감쌌으므로 문자1이 할당됨)
		char ch4_1 = '1' + 1;
		System.out.println("ch4="+ ch4
				+", ch4_1="+ ch4_1
				+", ch4_1="+ (int)ch4_1);//숫자50, 문자2가 출력됨
		
		/*
		boolean형 : true 혹은 false 두가지의 값만 가질수 있는 자료형으로
			산술연산(+, -)이나 비교연산(<, <=)에서는 사용할 수 없고,
			논리연산에서 사용할 수 있다.
		 */
		
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1="+ bn1 +", bn2="+ bn2);
		
		/*
		&&(논리And) : 엠퍼센트. 양쪽 모두 참일떄만 참을 반환하는
			연산자. 그 외에는 모두 거짓을 반환한다.
		||(논리Or) : 파이프. 둘중 하나만 참이어도 참을 반환하는 연산자.
		 	둘 다 거짓일때만 거짓을 반환한다.
		*/
		boolean bn3 = bn1 && bn2;
		System.out.println("bn3(And)="+ bn3); //false반환
		bn3 = bn1 || bn2;
		System.out.println("bn3(Or)="+ bn3); //true반환
		
		bn3 = '가' > 30000; //가 => 유니코드 44032 이므로 true반환됨 
		System.out.println("bn3="+ bn3);
	}
}
