package array.ex;

import java.util.Scanner;

/*
 * 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아
 * 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자(2차원 배열을 사용)
 */
public class ArrayEx7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] scores = new int[4][3];
		
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
