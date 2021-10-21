package ex10accessmodifier.sub;


class DefaultClass1{
	
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc()메소드 호출");

	}
}	
public class E01AccessModifier2 {

	private int privateVar;
	int defaultvar;
	public int publicVar; 
	
	private void privateMethod() {
		privateVar = 400;
		System.out.println("privateMethod() 메소드 호출");
	}
	void defaultMathod() {
		privateVar = 500;
		System.out.println("defaultMathod() 메소드 호출");
	}
	public void publicMethod() {
		privateVar = 600;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}
}
