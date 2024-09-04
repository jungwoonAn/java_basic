package ex01;

import java.util.Scanner;

public class Exception03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("두 정수를 입력하세요 >>");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
	    // 3. try ~ catch
		// java.lang.ArithmeticException: / by zero
		double result = 0;
		
		try {  // try -> 예외 발생 가능 코드 작성	 			
			result = num1 / num2;			
		} catch(Exception e) {  // catch -> 예외 처리
			e.printStackTrace();
			System.out.println("---------------");
			System.out.println(e.getMessage());
		}
		
		System.out.println("나누기 결과 : " + result);
		
		sc.close();
	}

}
