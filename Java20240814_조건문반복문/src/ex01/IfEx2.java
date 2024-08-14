package ex01;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 >> ");
		int score = sc.nextInt();
		
		// 삼항 연산자로 합격 불합격 판단
//		String result = (score >= 60) ? "합격" : "불합격";
	
		String result = "";
		
		if(score>=60) {
			result = "합격";
		}
		
		if(score<60) {
			result = "불합격";			
		}
		
		System.out.println(result);
		sc.close();
	}

}
