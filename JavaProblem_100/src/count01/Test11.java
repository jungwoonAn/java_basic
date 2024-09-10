package count01;

public class Test11 {
	// 클래스 로딩
	static {  // static 멤버부터 메모리에 올라가고
		System.out.println("Static block");
	}
	
	// main()메서드 호출
	public static void main(String[] args) {
		System.out.println("Main method");
	}
}
