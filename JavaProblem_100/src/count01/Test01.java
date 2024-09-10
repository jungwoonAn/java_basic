package count01;

public class Test01 {

	public static void main(String[] args) {
		// 예외 처리
		try {
			int result = 10 / 0;
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught");
		}
	}

}
