package review;

public class ClassC extends ClassB {
	String hobby;
	
	public ClassC() {}
		
	public ClassC(String name, int age, String gender, String hobby) {
		super(name, age, gender);
		this.hobby = hobby;
	}

	@Override
	void func() {
		System.out.println("classC");
	}
	
}
