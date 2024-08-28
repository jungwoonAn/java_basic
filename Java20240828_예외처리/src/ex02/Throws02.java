package ex02;

public class Throws02 {

	public static void main(String[] args) {
		
		try {
			func(5,0);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {			
			System.out.println("프로그램 종료");
		}
	}
	
	// throws : 예외 던지기
	// static void func(int n1, int n2) throws Exception {  // 상위클래스로 throws 가능
	static void func(int n1, int n2) throws ArithmeticException {
		// 메서드에서 예외 발생하면 내부에서 처리하지 않음
		int result = 0;
		result = n1 / n2;
		System.out.println("result = " + result);	
	}

}
