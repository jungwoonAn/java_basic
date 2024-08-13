package ex05;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine(); // 아무거나 입력 가능
		System.out.println(line);
		
		int number = sc.nextInt(); // 정수만 입력 가능
		System.out.println(number);
		
		sc.close();
	}

}