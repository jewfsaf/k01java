package ex13abstractinterface;
/*
추상클래스
-상속을 목적으로 제작되므로 객체생성을 허용하지 않는다.
-추상클래스는 대부분 추상메서드를 포함하고 있으므로, 이를
	상속받는 클래스는 반다스 추상메서드를 오버라이딩 해야한다.
-클래스의 상속관계에서 일종의 서롂도 역할을 한다.
-객체생성은 할 수 없으나 그외 참조변수, 상속등의 모든기능을
	할수있다.
	
추상메서드
-오버라이딩의 목적으로 제작된다.
-메서드의 실행부가 없기때문에 중괄호{} 대신에 ; 을 붙여준다.
 */

//프로젝트 전체에서 기준을 역할을 하는 추상클래스
abstract class PersonalNumberStorageAbs {
		public abstract void addPersonalInfo(String JuminNum, String name);
		public abstract String searchPersonalInfo(String juminNum);
}

/*
DTO(Data Transfer Object) : 데이터를 저장하고 전송하기 위한 용도의
	객체를 말한다. VO(Value Object)로 표현하기도 한다.
	해당 프로그램에서는 한 사람의 정보를 저장하기 위한 용도로 정의한다.
 */
class PersonalInfoDTO {
	private String name;
	private String juminNum;

	public PersonalInfoDTO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	
	String getName() {return name;}
	String getJuminNum() {return juminNum;}
}
/*
제공된 추상클래스를 상속하여 사람의 정보를 저장하는 기능과 
검색의 기능을 구현한 클래스
 */
class PersonalNumberStorageExt extends PersonalNumberStorageAbs {
	
	PersonalInfoDTO[] personalArr;//정보저장용 객체배열
	int numofPerInfo;//입력정보 카운트
	//생성자
	public PersonalNumberStorageExt(int arrSize) {
		personalArr = new PersonalInfoDTO[arrSize];
		numofPerInfo = 0;
	}
	
	/*
	상속을 통해 추상메서드를 포함하게 되었으므로 반드시 아래와 같이
	오버라이딩 해야한다. 필수사항이며 하지 않을경우 에러가 발생한다.
	 */
	
	//전달받은 인자를 통해 DTO객체를 생성한 후 객체 배열을 추가한다.
	@Override
	public void addPersonalInfo(String JuminNum, String name) {
		personalArr[numofPerInfo] =
				new PersonalInfoDTO(name, JuminNum);
		numofPerInfo++;
	}
	
	//주민번호를 인자로 객체배열을 검색한 후 정보를 반환한다.
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i=0 ; i<numofPerInfo ; i++) {
			/*
			멤버변수를 private으로 선언했으므로 외부에서는 접근할수 없다.
			이럴때 getter메소드를 통해 접근하여 값을 얻어올 수 있다.
			 */
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0) {
				return personalArr[i].getName();
			}
		}
		return null;
	}
}
	


public class E02AbstractToInterface1 {

	public static void main(String[] args) {
		//10명의 정보를 저장할수있는 객체배열 생성
		PersonalNumberStorageExt storage = new PersonalNumberStorageExt(10);
	
		//정보 추가
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
		//정보 검색
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}
}