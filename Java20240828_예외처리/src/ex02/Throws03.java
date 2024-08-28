package ex02;

public class Throws03 {

	public static void main(String[] args) throws Exception { // JVM에게 예외 던지기
		func(5,0);
		
	}
	
	// throws : 예외 던지기
	static void func(int n1, int n2) throws Exception {// 상위클래스로 throws 가능
		// 메서드에서 예외 발생하면 내부에서 처리하지 않음
		int result = 0;
		result = n1 / n2;
		System.out.println("result = " + result);	
	}

}
