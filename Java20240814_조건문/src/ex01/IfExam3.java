package ex01;

import java.util.Scanner;

/*
	문제3. 주차 요금 계산
	주차장을 이용한 시간에 따라 주차 요금을 계산하는 프로그램을 작성하세요.
	주차 요금은 다음과 같습니다.
	
	0시간부터 1시간이하 : 1000원
	1시간초과 2시간이하 : 2000원
	2시간초과 3시간이하 : 3000원
	3시간초과 : 5000원
	
	출력예)
	주차 시간을 입력하세요(시간단위) : 2.5
	주차요금은 3000원입니다.
 */
public class IfExam3 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주차 시간을 입력하세요(시간단위) : ");
		double parking = sc.nextDouble();
		
		int fee = 0;
		
		if(parking>3) {
			fee = 5000;
		}else if(parking>2) {
			fee = 3000;
		}else if(parking>1) {
			fee = 2000;
		}else {
			fee = 1000;
		}	
			
		System.out.printf("주차시간은 %.1f시간, 주차요금은 %d원입니다. \n", parking, fee);
		sc.close();
	}

}
