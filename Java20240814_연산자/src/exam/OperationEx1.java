package exam;
/*
	문제1. 클래스 이름은 OperationEx1라고 적어주세요.
	1) num1, num2, num3라는 이름의 세게의 int 변수를 선언하고 각각 12, 20, 35로 초기화 하세요.
	2) 세 변수의 합을 계산하고, 그 결과를 sum이라는 이름의 int변수에 저장하세요.
	3) 세 변수의 평균을 계산하고, 그 결과를 average라는 이름의 double 변수에 저장하세요.
	평균 계산시 소수점 1자리까지 표시하세요.
	4) sum과 average 변수의 값을 출력하세요.
 */
public class OperationEx1 {
	
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 20;
		int num3 = 35;
		
		int sum = num1 + num2 + num3;
		
		double average = sum / 3.0;
		
		System.out.printf("세 수 : %d, %d, %d \n", num1, num2, num3);
		System.out.println("세 수의 합 : " + sum);
		System.out.printf("세 수의 평균 : %.1f \n", average);
	}

}
