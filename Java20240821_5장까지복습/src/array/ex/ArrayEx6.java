package array.ex;

import java.util.Scanner;

/*
 * 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후,
 * 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자.
 */
public class ArrayEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
		int input = sc.nextInt();
		
		int[] nums = new int[input];
		
		System.out.println(input + "개의 정수를 입력하세요 : ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		int min = nums[0];
		int max = nums[0];
		
		for(int i=0; i<nums.length; i++) {
			if(min > nums[i])
				min = nums[i];
			if(max < nums[i])
				max = nums[i];
		}
				
		System.out.println("가장 작은 정수 : " + min);
		System.out.println("가장 큰 정수 : " + max);
		
		sc.close();
	}

}
