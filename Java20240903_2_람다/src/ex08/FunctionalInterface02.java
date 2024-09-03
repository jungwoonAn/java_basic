package ex08;

import java.util.function.Predicate;

// 짝수 홀수 판별
public class FunctionalInterface02 {

	public static void main(String[] args) {
				
		// 함수형 인터페이스 람다식
		Predicate<Integer> predicate = num -> num%2==0 ? true : false;
		
		// 익명 클래스로 변환
//		Predicate<Integer> predicate = new Predicate<Integer>() {			
//			@Override
//			public boolean test(Integer t) {
//				return num%2==0 ? true : false;
//			}
//		};
		
		int num = 9;
		
		if(predicate.test(num))
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
	}

}
