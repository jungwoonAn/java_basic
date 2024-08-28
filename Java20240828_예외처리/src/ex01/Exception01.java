package ex01;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("두 정수를 입력하세요 >>");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// 1. 예외처리 없는 코드
		double result = 0;
		result = num1 / num2;
				
		System.out.println("나누기 결과 : " + result);
		
		sc.close();
	}

}
