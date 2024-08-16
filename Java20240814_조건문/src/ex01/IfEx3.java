package ex01;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 >> ");
		int score = sc.nextInt();
		
		// 삼항 연산자로 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지는 F
//		String result = (score >= 90) ? "A" :
//						(score >= 80) ? "B" :
//						(score >= 70) ? "C" : "F";
	
		String result = "";
		
		if(score>=90) {
			result = "A";
		}else if(score>=80) {
			result = "B";
		}else if(score>=70) {
			result = "C";
		}else {
			result = "F";
		}
		
		System.out.println(result);
		sc.close();
	}

}
