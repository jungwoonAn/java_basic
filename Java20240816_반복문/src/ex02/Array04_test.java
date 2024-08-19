package ex02;

import java.util.Scanner;

/*
문제2.
5명 학생의 com 점수를 키보드로 입력받아서 출력하기
1) 입력할때도 반복문
2) 출력시에도 반복문
3) 최댓값, 최솟값
4) 총합과 평균 구하기
 */
public class Array04_test {

	public static void main(String[] args) {
		int[] coms = new int[5];
		
		Scanner sc = new Scanner(System.in);
		// 점수 입력받기
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "번 학생 점수 입력 >> ");
			coms[i] = sc.nextInt();
		}		
		System.out.println("----------------");
		
		// 점수 출력하기
		for(int i=0; i<5; i++) {
			System.out.print(coms[i] + ", ");			
		}		
		System.out.println("\n----------------");	
		
		// 역순으로 출력
		for(int i=0; i<5; i++) {			
			System.out.print(coms[4-i] + ", ");
		}		
		System.out.println("\n----------------");
		
		// 최댓값, 최솟값
		int max = coms[0];
		for(int i=0; i<5; i++) {
			if(max < coms[i]) {
				max = coms[i];
			}
		}
		
		int min = coms[0];
		for(int i=0; i<5; i++) {
			if(min > coms[i]) {
				min = coms[i];
			}
		}
		System.out.printf("최댓값 : %d, 최솟값: %d", max, min);
		System.out.println("\n----------------");
		
		// 총점과 평균 구하기
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<5; i++) {
			sum += coms[i];
		}
		
		avg = (double)sum / coms.length;
		System.out.printf("총점 : %d, 평균 : %.2f", sum, avg);
		
		// 버블정렬(이중for문 후에)
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				if(coms[j] > coms[j+1]) {
					int tmp = coms[j];
					coms[j] = coms[j+1];
					coms[j+1] = tmp;
				}
			}
		}
		
		// 정렬 후 출력
		System.out.println("\n--- 정렬 후 출력 ---");
		for(int i=0; i<5; i++) {
			System.out.print(coms[i] + ", ");			
		}		
		System.out.println("\n----------------");
		sc.close();
	}

}
