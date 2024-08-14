package _review;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		// 두 정수 입력받아서 총점, 평균 구하기
//		{
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("1번째 정수 입력 >> ");
//			int num1 = sc.nextInt();
//			
//			System.out.println("2번째 정수 입력 >> ");
//			int num2 = sc.nextInt();
//			
//			int sum = num1 + num2;
//			
//			double avg = sum / 2.0;  // sum / 2 => 정수
//			
//			System.out.println("두 수 합 : " + sum);
//			System.out.println("두 수 평균 : " + avg);
//			sc.close();
//		}
		
		{
			Scanner sc = new Scanner(System.in);
			int count = 0;
			
			System.out.println("1번째 정수 입력 >> ");
			int num1 = sc.nextInt();
			count ++;
			
			System.out.println("2번째 정수 입력 >> ");
			int num2 = sc.nextInt();
			count ++;
			
			int sum = num1 + num2;
			
			double avg = (double)sum / count;  // sum / 2 => 정수, 두 수중 하나를 실수로 강제 타입변환
			
			System.out.println("두 수 합 : " + sum);
			System.out.println("두 수 평균 : " + avg);
			sc.close();
		}
	}

}
