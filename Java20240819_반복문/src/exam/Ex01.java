package exam;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int account = 0;
		boolean flag = true;
		
		while(flag) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			
			System.out.print("선택> ");
			int choice = Integer.parseInt(sc.nextLine());  // 문자를 정수로
			
			switch(choice) {
				case 1:
					System.out.print("예금액> ");
					int income = Integer.parseInt(sc.nextLine());
					account += income;
					break;
				case 2:
					System.out.print("출금액> ");
					int outcome = Integer.parseInt(sc.nextLine());
					account -= outcome;
					break;
				case 3:
					System.out.println("잔고> " + account);
					break;
				case 4:
					System.out.println("프로그램 종료");
					flag = false;
					break;
				default:
					System.out.println("1~4까지 입력하세요");
			}			
			
		}		
		sc.close();
	}

}
