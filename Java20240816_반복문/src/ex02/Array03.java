package ex02;

import java.util.Scanner;

/*
문제2.
5명 학생의 com 점수를 키보드로 입력받아서 출력하기
1) 입력할때도 반복문
2) 출력시에도 반복문
 */
public class Array03 {

	public static void main(String[] args) {
		int[] comScores = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		// com점수 입력
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "번째 학생의 com점수 입력 >> ");
			comScores[i] = sc.nextInt();
		}
		
		System.out.println("------------------");
		
		// com점수 출력
		for(int i=0; i<5; i++) {
			System.out.print(comScores[i] + ", ");
		}
		sc.close();
		
		System.out.println("\n------------------");
		
		// 최댓값 계산
		int max = comScores[0];
		
		for(int i=0; i<5; i++) {
			if(max < comScores[i]) {
				max = comScores[i];
			}
		}
		System.out.println("1등의 점수는 " + max + "점입니다.");
		
		// 최솟값 계산
		int min = comScores[0];
		
		for(int i=0; i<5; i++) {
			if(min > comScores[i]) {
				min = comScores[i];
			}
		}
		System.out.println("꼴등의 점수는 " + min + "점입니다.");
		
		// 총점과 평균구하기
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<5; i++) {
			sum += comScores[i];
		}
		
		avg = (double)sum / comScores.length;
		
		System.out.println("학생들의 총점은 " + sum + "점이고, 평균은 " + avg + "점입니다.");
	}

}
