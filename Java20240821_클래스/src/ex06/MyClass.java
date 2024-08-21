package ex06;

public class MyClass {
	// 클래스 변수(정적 변수)
	static String classVariable = "This is a class variable";

	// 인스턴스 변수
	String instanceVariable;
	
	// 생성자
	MyClass(String instanceVariable){
		this.instanceVariable = instanceVariable;
	}
	
	// 인스턴스 메서드
	void instanceMethod() {
		System.out.println("This is an instance method");
		System.out.println("Instance variable : " + instanceVariable);
		System.out.println("Class variable : " + classVariable);  // 클래스 변수 접근 가능
	
		// 클래스 메서드 호출 가능
		MyClass.classMethod();
	}
	
	// 클래스 메서드(정적 메서드)
	static void classMethod() {
		System.out.println("This is an class method");
		System.out.println("Class variable : " + classVariable);
	
		// 인스턴스 변수, 인스턴스 메서드에 접근 불가
//		System.out.println("Instance variable : " + instanceVariable);
		
		// 단, 인스턴스 생성 후 인스턴스 메서드 호출할 수 있음
		MyClass myInstance = new MyClass("Instance variable from class method");
		myInstance.instanceMethod();
	}
}
