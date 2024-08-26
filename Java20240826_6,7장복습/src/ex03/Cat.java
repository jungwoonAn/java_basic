package ex03;

public class Cat extends Animal {
	int age;
	
	public Cat() {
		super("고양이");
	}
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	void speak() {
		System.out.println("야옹~");
	}
	
	@Override
	void info() {
		super.info();
		System.out.println(age + "살 입니다.");
	}
}
