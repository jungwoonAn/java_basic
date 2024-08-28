package ex01;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("두 정수를 입력하세요 >>");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// 2. Excpetion : / by zero
		double result = 0;
				
		if(num2 != 0) {
			result = num1 / num2;			
		}
		
		System.out.println("나누기 결과 : " + result);
		
		sc.close();
	}

}
