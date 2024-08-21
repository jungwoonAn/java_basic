package array.ex;

import java.util.Scanner;

/*
 * 이전 문제에서 입력받은 숫자의 개수를 입력받도록 개선하자.
 */
public class ArrayEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
		int input = sc.nextInt();
		
		int[] nums = new int[input];
		
		System.out.println(input + "개의 정수를 입력하세요 : ");
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
