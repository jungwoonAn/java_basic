package ex01;

/*
	문제2. 버스 요금 계산 프로그램
	나이는 랜덤(1~100)으로 받아보세요.
	기본요금 : 2000원
	1~5세 : 무료
	6~12세 : 50%할인
	13~18세 : 25%할인
	19~64세 : 0%할인
	65세 이상: 무료
	
	예) 25입력
	버스요금 : 2000원
 */
public class IfExam2 {

	public static void main(String[] args) {	
		// 0~1사이 난수 발생
//		System.out.println(Math.random());
		// 1~100사이 난수 발생
//		System.out.println((Math.random()*100)+1);
		
		int age = (int)(Math.random()*100)+1;
		
		int busfee = 2000;
		double rate = 0;
		
//		if(age<=5 || age>=65) {
//			rate = 0;
//		}else if(age>=6 && age <=12) {
//			rate = 0.5;
//		}else if(age>=13 && age <=18) {
//			rate = 0.75;
//		}else if(age>=19 && age <=64) {
//			rate = 1;
//		}
		
		if(age<=5 || age>=65) {
			rate = 0;
		}else if(age>=19) {
			rate = 1;
		}else if(age>=13) {
			rate = 0.75;
		}else if(age>=6) {
			rate = 0.5;
		}
		
		busfee = (int)(busfee * rate);
		
		System.out.printf("나이는 %d살 입니다. \n", age);
		System.out.printf("버스요금은 %d원입니다. \n", busfee);
	}

}
