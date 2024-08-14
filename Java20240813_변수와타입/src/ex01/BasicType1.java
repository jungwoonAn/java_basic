package ex01;

import java.util.Scanner;

public class BasicType1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 변수명은 의미있게 작명
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(a + " : " + b + " : " + c);
		
		int korScore = sc.nextInt();
		int engScore = sc.nextInt();
		int mathScore = sc.nextInt();
		
		System.out.println(korScore + " : " + engScore + " : " + mathScore);
		
		sc.close();
	}

}
