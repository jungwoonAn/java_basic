package extends3.super2;

public class ClassC extends ClassB {
	private int c;
	
	public ClassC(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}

	void info() {
		super.info();
		System.out.print(c + " ");
	}
	
}
