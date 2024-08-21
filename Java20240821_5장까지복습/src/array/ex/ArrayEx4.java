package array.ex;

import java.util.Scanner;

/*
 * 사용자에게 5개의 정수를 입력받아서
 * 이들 정수의 합계와 평균을 계산하는 프로그래램을 작성하자.
 */
public class ArrayEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		System.out.println("5개의 정수를 입력하세요 : ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];		
		}
		
		avg = (double)sum / nums.length;
		
		System.out.println("입력한 정수의 합계 : " + sum);
		System.out.println("입력한 정수의 평균 : " + avg);
		
		sc.close();
	}

}
