package ex08;

import java.util.function.BiFunction;

// 숫자 2개 전달하면 문자열 결합하여 반환
public class FunctionalInterface05 {

	public static void main(String[] args) {
		
		// 함수형 인터페이스 람다식
		BiFunction<Integer, Integer, String> bifunction = (n1, n2) -> String.valueOf(""+n1+n2);
		
		String str = bifunction.apply(10, 20);
		System.out.println(str);
		
	}

}
