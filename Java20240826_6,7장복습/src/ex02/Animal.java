package ex02;

public class Animal {
	private String name;  // 멤버변수, 인스턴스 변수 -> 생성된 객체들이 개별적으로 가지고 있음
	private static int count;  //정적변수, 클래스 변수 -> 공유자원

	public Animal() {
		this("동물");  // 다른 생성자 호출
	}
	
	public Animal(String name) {
		this.name = name;  // 
	}

	void speak() {}
	
	void info() {  // 메서드, 인스턴스 메서드
		System.out.println(name + "입니다.");
		count++;  // 인스턴스메서드에서 클래스변수 접근 가능
		staticInfo();  // 인스턴스메서드에서 클래스 메서드 접근 가능
	}
	
	static void staticInfo() {  //정적메서드, 클래스 메서드
		// 인스턴스변수, 인스턴스메서드 접근 불가
		// 클래스 변수, 클래스 메서드 접근 가능
	}
}
