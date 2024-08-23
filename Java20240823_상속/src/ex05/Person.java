package ex05;

public class Person {
	String name;
	int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// public final void introduce() -> 하위 클래스에서 메서드 오버라이딩 불가
	public void introduce() {
		System.out.printf("안녕하세요! 제 이름은 %s이고, 나이는 %d살 입니다. \n", name, age);
	}
	
	public void walk() {
		System.out.println(name + "이(가) 걷고 있습니다.");
	}
}
