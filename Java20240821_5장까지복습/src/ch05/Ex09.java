package ch05;

// 키보드로부터 학생 수와 각 학생들의 점수를 입력받고,
// while문과 Scanner의 nextLine()메서드를 이용해서
// 최고 점수 및 평균 점수를 출력하는 코드를 작성해 보세요.
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int choice;

		int stuNum = 0;
		int[] scores = null;
				
		while(flag) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			
			System.out.print("선택 >> ");
			choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:
				System.out.print("학생수 >> ");
				stuNum = Integer.parseInt(sc.nextLine());
				scores = new int[stuNum];
				break;
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] >> ", i);
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				break;
			case 3:
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] >> %d \n", i, scores[i]);
				}
				break;
			case 4:
				int max = scores[0];
				int sum = 0;
				double avg = 0;	
				
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];					
				}
				avg = (double)sum /scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				break;
			case 5:
				flag = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("1~5사이 정수만 입력하세요.");
			}
		}
		
		sc.close();
	}

}
