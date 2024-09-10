package count01;

// 다형성
class Animal {
	void sound() {
		System.out.println("Animal sound");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

public class Test14 {

	public static void main(String[] args) {
		// 다형성 - 재정의하면 생성된 클래스 메서드 호출
		Animal a = new Cat();
		a.sound();
	}

}
