package ex01;

import java.util.Scanner;

// 나이, 이름을 키보드를 통해서 입력받아서 출력
public class InputNameAge {
	public static void main(String[] args) {
		/*
		   기본 자료형 ->
		   정수형
		     byte, short, int, long
		   실수형
		     float, double
		   논리형
		     boolean
		   문자형
		     char
		 */
		Scanner sc = new Scanner(System.in);  // 키보드 통해서 입력받음
		
		System.out.println("이름을 입력하세요 : ");
		String myname = sc.nextLine();  // String은 기본자료형이 아니므로 참조자로형 문자열입력
				
		System.out.println("나이를 입력하세요 : ");
		int myage = sc.nextInt();
		
		System.out.println("나의 이름은 " + myname + "입니다.");
		System.out.println("나의 나이는 " + myage + "살 입니다.");
		
		System.out.println("프로그램 종료!!");
		sc.close();
	}

}
