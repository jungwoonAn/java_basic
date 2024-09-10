package count01;

public class Test12 {
	// 클래스와 인스턴스 초기화 블럭
	static {
		System.out.println("Static block");
	}
	
	{
		System.out.println("Instance block");
	}
	
	public Test12() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		new Test12();
	}
}
