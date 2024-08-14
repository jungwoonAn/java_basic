package ex02;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 7;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		double result4 = num1 / (double)num2;
		
		int result5 = num1 % num2;
		
		System.out.println("더하기 : " + result1);
		System.out.println("빼기 : " + result2);
		System.out.println("곱하기 : " + result3);
		System.out.printf("곱하기(정수) : %d \n", result3);
		System.out.printf("곱하기(16진수) : %x \n", result3);
		System.out.printf("곱하기(8진수) : %o \n", result3);
		
		System.out.println("나누기 : " + result4);
		System.out.printf("나누기 : %f \n", result4); // 
		System.out.printf("나누기 : %"
				+ ".2f \n", result4); // 소수점 두째자리까지 출력
		System.out.println("나머지 : " + result5);
		
	}

}
