package review;

// public class ClassA extends Object{
public class ClassA {
	String name;
	int age;
	
	public ClassA() {}
	
	public ClassA(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
		
	@Override
	// 오버라이딩 하면 접근 가능
	public String toString() {
		return "ClassA [name=" + name + ", age=" + age + "]";
	}

	void func() {
		System.out.println("classA");
	}
	
	
}
