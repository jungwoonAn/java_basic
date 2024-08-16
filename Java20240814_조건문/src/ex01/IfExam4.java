package ex01;

import java.util.Scanner;

/*
	문제4. 체질량지수
	사용자의 키와 몸무게를 입력받아, BMI(체질량지수)를 계산하고
	그 결과에 따라 메시지를 출력하는 프로그램을 작성하세요.
	
	BMI = 몸무게(kg) / (키(m) * 키(m))
	BMI 18.5 미만 : "저체중입니다."
	BMI 18.5 이상 24.9이하 : "정상 체중입니다."
	BMI 25 이상 29.9이하 : "과체중입니다."
	BMI 30이상 : "비만입니다."
 */
public class IfExam4 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력해주세요(단위:cm) >> ");
		double height = sc.nextDouble();
		height /= 100;  // cm -> m로 변경
		
		System.out.println("몸무게를 입력해주세요(단위:kg) >> ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height*height);
		String result = "";
		
		if(bmi>=30) {
			result = "비만입니다.";
		}else if(bmi>=25) {
			result = "과체중입니다.";
		}else if(bmi>=18.5) {
			result = "정상 체중입니다.";
		}else {
			result = "저체중입니다.";
		}
		
		System.out.printf("키 : %.2f(m), 몸무게 : %.1f(kg) \n", height, weight);
		System.out.printf("BMI : %.1f, 당신은 %s \n", bmi, result);
		sc.close();
	}

}
