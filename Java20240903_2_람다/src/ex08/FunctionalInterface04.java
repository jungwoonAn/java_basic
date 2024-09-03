package ex08;

import java.util.function.Supplier;

// 랜덤 숫자 하나 뽑기
public class FunctionalInterface04 {

	public static void main(String[] args) {
		
		// 함수형 인터페이스 람다식
		Supplier<Integer> supplier = () -> (int)(Math.random()*100);
		
		int result = supplier.get();
		
		System.out.println(result);
		
	}

}
