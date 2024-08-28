package ex01;

class A {
	int age = 100;
	String name = "홍길동";
	
	// toString() 오버라이딩
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}

public class ToStringMain {

	public static void main(String[] args) {
		Object obj = new A();
		// 클래스A에서 toString() 재정의 전  // ex01.A@4517d9a3
		System.out.println(obj.toString());  
		System.out.println(obj); 		
		// 클래스A에서 toString()오버라이딩 후  // 이름 : 홍길동, 나이 : 100
	}

}
