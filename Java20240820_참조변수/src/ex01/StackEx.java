package ex01;

import java.util.Scanner;

public class StackEx {

	public static void main(String[] args) {
		Scanner sc2 = func();
		
		int n = sc2.nextInt();
		System.out.println(n);
	}
	
	static Scanner func() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}

}
