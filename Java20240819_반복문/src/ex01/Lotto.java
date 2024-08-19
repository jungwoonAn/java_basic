package ex01;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// 1~45숫자 중 6개 숫자 -> 5개 구입
		
		int[] nums = new int[6];
		Random random = new Random();
		
		for(int k=0; k<5; k++) {
			for(int i=0; i<nums.length; i++) {
//				nums[i] = (int)((Math.random()*45)+1);		
				nums[i] = random.nextInt(45)+1;	
			
				// 중복 제거(다시 뽑기)				
				for(int j=0; j<i; j++) {
					if(nums[i] == nums[j]) {
						i--;
					}
				}
			}
			
			// 출력
			for(int i=0; i<nums.length; i++) {
				System.out.printf("%02d ", nums[i]);
			}
			System.out.println();
		}
		
	}

}
