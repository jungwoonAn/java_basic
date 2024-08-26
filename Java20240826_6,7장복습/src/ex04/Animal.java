package ex04;

public class Animal {
	private String name;	

	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}

	void speak() {};
	
	void info() {
		System.out.println(name + "입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
