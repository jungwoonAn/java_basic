package ex03;

public abstract class Animal {
	private String name;	

	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}

	abstract void speak();  // 추상화 -> 하위클래스에서 오버라이드 필수
	
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
