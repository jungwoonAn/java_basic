package ex01;

import java.util.Scanner;
/*
	문제1. 월별 계절 확인
	사용자가 월을 입력하면 해당 월이 어느 계절에 해당하는지를 출력하는 프로그램을 작성하세요.
	계절은 다음과 같이 결정됩니다.
	
	12월, 1월, 2월 : 겨울
	3월, 4월, 5월 : 봄
	6월, 7월, 8월 : 여름
	9월, 10월, 11월 : 가을
 */
public class IfExam1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요 >> ");
		int month = sc.nextInt();
		
		String season = "";
		
		if(month==12 || month==1 || month==2) {
			season = "겨울";
//		}else if(month==3 || month==4 || month==5) {
		}else if(month>=3 && month<=5) {
			season = "봄";
		}else if(month==6 || month==7 || month==8) {
			season = "여름";
		}else if(month==9 || month==10 || month==11) {
			season = "가을";
		}else {
			season = "없는 달";
			System.out.println("1~12사이 숫자를 입력해야지!!");			
		}
		
		System.out.printf("%d월은 %s입니다. \n", month, season);
		sc.close();
	}

}
