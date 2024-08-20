package ex03;

import java.util.Scanner;

public class ArrayEx00 {

	public static void main(String[] args) {
		/*
		 * 문제1.
		 * -----------------------------
		 * 1.과목등록 | 2.과목목록보기 | 3.종료
		 * -----------------------------
		 * String 배열을 이용해서 작업하기(배열 크기는 최대 10)
		 */
				
		Scanner sc = new Scanner(System.in);
		
		String[] subjects = new String[10]; 
		boolean flag = true;
		int index = 0;
		
		while(flag) {	
			int choice;			
			
			System.out.println("-----------------------------");
			System.out.println("1.과목등록 | 2.과목목록보기 | 3.종료");
			System.out.println("-----------------------------");
			
			System.out.print("선택 >> ");
			
//			choice = sc.nextInt();  // 입력버퍼에서 int만 return하고 엔터키가 남아있음
//			sc.nextLine();  // 입력버퍼에 엔터 return -> 입력버퍼 클리어
			choice = Integer.parseInt(sc.nextLine());	
			
			if(choice == 1) {
				System.out.print("과목 입력 >> ");
				subjects[index++] = sc.nextLine();
//				subjects[index] = sc.nextLine();
//				index++;
			}else if(choice == 2) {
				for(int i=0; i<index; i++) {
					System.out.println(subjects[i]);
				}
			}else if(choice == 3) {
				System.out.println("종료");
				flag = false;
			}else {
				System.out.println("1~3사이 정수만 입력하세요.");
			}
		}
		sc.close();		
		
	}

}
