package array.ex;

import java.util.Scanner;

/*
 * 사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자
 * 출력시 출력 포맷은 1,2,3,4,5와 같이 ,쉼표를 사용해서 구분하고,
 * 마지막에는 쉼표를 넣지 않아야 한다.
 */
public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		System.out.println("5개의 정수를 입력하세요 : ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println("출력");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]);
			if(i < nums.length-1)
				System.out.print(", ");		
		}
		
		sc.close();
	}

}
