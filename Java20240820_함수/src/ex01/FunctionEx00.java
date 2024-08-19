package ex01;

import java.util.Scanner;

public class FunctionEx00 {

	public static void main(String[] args) {
		func();
		func();
		func();
	}
	
	static void func() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 >> ");
		String name = sc.nextLine();
		System.out.print("나이 >> ");
		int age = sc.nextInt();
		System.out.println(name);
		System.out.println(age);
	}

}
