package ex03;

public class Dog extends Animal {
	int age;
	
	public Dog() {
		super("강아지");
	}
	
	public Dog(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	void speak() {
		System.out.println("멍멍!");
	}
	
	@Override  // 상위클래스 메서드 재정의
	void info() {
//		System.out.println(getName() + "입니다.");
		super.info();
		System.out.println(age + "살 입니다.");
	}
}
