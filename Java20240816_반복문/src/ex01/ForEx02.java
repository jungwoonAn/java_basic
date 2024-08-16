package ex01;

import java.util.Scanner;

/*
문제1.
양의 정수 N을 입력받아서
1부터 N까지 홀수 합을 구한다
 */

public class ForEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수를 입력하세요 >> ");
		int N = sc.nextInt();
		int sum = 0;
		// 1부터 N까지 홀수 합
		for(int i=1; i<=N; i++) {
			if(i%2 != 0) {
				sum += i;
			}
		}
		
		System.out.printf("1부터 %d까지 홀수 합은 %d입니다.", N, sum);
		sc.close();
	}

}
