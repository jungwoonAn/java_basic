package ex06;

public class Cow extends Animal {

	@Override  // 추상클래스 상속받으면 추상메서드 재정의 강제!
	void speak() {
		System.out.println("음메~");
	}

}
