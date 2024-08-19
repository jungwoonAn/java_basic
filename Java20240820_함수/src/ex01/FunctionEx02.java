package ex01;

import java.util.Scanner;

public class FunctionEx02 {

	public static void main(String[] args) {
		func2(11);  // 함수 호출		
		
	}
	
	// 반환타입 X, 입력값(매개변수) O
	static void func2(int num) {
		if(num%2 == 0) {
			System.out.println("입력값은 짝수!");
		}else {
			System.out.println("입력값은 홀수!");			
		}
	}

}
