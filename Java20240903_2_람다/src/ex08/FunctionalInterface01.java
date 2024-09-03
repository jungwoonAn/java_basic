package ex08;

import java.util.function.Function;

@FunctionalInterface  // 추상 메서드 1개만 정의된 인터페이스를 통칭
interface AAA {
	int doubleFunc(int num);
}

public class FunctionalInterface01 {

	public static void main(String[] args) {

		AAA a = num -> num * num;		
		System.out.println(a.doubleFunc(5));
		
		// 함수형 인터페이스
//		Function<Integer, Integer> function = new Function<Integer, Integer>() {			
//			@Override
//			public Integer apply(Integer t) {
//				return t*t;
//			}
//		};
		
		// 함수형 인터페이스 람다식
		Function<Integer, Integer> function = t -> t*t;
		System.out.println(function.apply(5));
		
	}

}
