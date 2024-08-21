package array.ex;

import java.util.Scanner;

/*
 * 이전 문제에 학생수를 입력받도록 개선하자.
 */
public class ArrayEx8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int[][] scores = new int[num][3];
		
		for(int i=0; i<scores.length; i++) {
			System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");
			System.out.print("국어 점수 : ");
			scores[i][0] = sc.nextInt();
			System.out.print("영어 점수 : ");
			scores[i][1] = sc.nextInt();
			System.out.print("수학 점수 : ");
			scores[i][2] = sc.nextInt();			
		}
		
		
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			double avg = 0;
			
			for(int j=0; j<scores[i].length; j++) {				
				sum += scores[i][j];
			}
			avg = (double)sum / scores[i].length;
			System.out.printf("%d번 학생의 총점 : %d, 평균 : %.2f \n", i+1, sum, avg);
		}
		
		sc.close();
	}

}
