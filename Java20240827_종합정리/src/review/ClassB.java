package review;

public class ClassB extends ClassA {
	String gender;
	
	public ClassB() {}	
	
	public ClassB(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	@Override
	void func() {
		System.out.println("classB");
	}
}
