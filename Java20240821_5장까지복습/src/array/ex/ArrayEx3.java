package array.ex;

import java.util.Scanner;

/*
 * 사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력하자
 * 출력시 포맷은 5,4,3,2,1과 같이 ,쉼표를 샤용해서 구분하고,
 * 마지막에는 쉼표를 넣지 않아야 한다.
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		System.out.println("5개의 정수를 입력하세요 : ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println("출력");
		for(int i=nums.length-1; i>=0; i--) {
			System.out.print(nums[i]);
			if(i != 0)
				System.out.print(", ");
		}
		
		sc.close();
	}

}
