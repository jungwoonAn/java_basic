package extends3.super2;

public class ClassB extends ClassA {
	private int b;
	
	public ClassB(int a, int b) {
		super(a);
	    this.b = b;
	}
	
	void info() {
		super.info();
		System.out.print(b + " ");
	}
}
