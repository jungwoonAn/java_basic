package ex04;

public class AnimalMain {

	public static void main(String[] args) {
		// 다형성
		// 상위클래스는 하위클래스를 참조할 수 있다.
		// 단, 접근 할 수 있는 영역은 선언한 클래스 또는 상위클래스만 접근 가능
		
		Animal animal = new Animal();
		Animal animal2 = new Dog();  // 자동 타입변환  
		Animal cat = new Cat();  // 자동 타입변환
		Animal animal3 = new Pug();  // 자동 타입변환
		animal3.speak();  // 오버라이딩된 메서드는 생성된 인스턴스에 있는 메서드 실행
		
		Dog dog = new Dog();
		Dog dog2 = new Pug();  // 자동 타입변환
//		Dog dog3 = new Animal(); // error, 상위클래스 참조 불가
//		dog2.wait();  // Dog객체만 접근 가능
		// 강제 타입변환
		Pug dog3 = (Pug)dog2;
		dog3.walk();
		
		Pug pug = new Pug();
//		Pug pug2 = new Animal(); // error
//		Pug pug3 = new Dog();  // error
		pug.walk();
		
	}

}
