package ex01;

import java.util.Random;

public class Lotto02 {

	public static void main(String[] args) {
		// 1~45숫자 중 6개 숫자 -> 5개 구입
		
		int[] lotto = new int[45];
		
		Random random = new Random();
		for(int i=0; i<45; i++) {  // 1~45를 순서대로 배열에 넣어줌(중복없음)
			lotto[i] = i+1;
		}
		for(int i=0; i<5; i++) {  // 5게임
			for(int j=0; j<45; j++) {  // 45개의 숫자 섞기
				int index = random.nextInt(45);
				int tmp = lotto[j];
				lotto[j] = lotto[index];
				lotto[index] = tmp;
			}			
			
			for(int j=0; j<6; j++)  // 6개의 숫자 출력
				System.out.printf("%02d ", lotto[j]);
			System.out.println();
			
		}
		
	}

}
