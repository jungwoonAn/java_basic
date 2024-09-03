package ex08;

import java.util.function.Consumer;

// 숫자 전달하면 출력
public class FunctionalInterface03 {

	public static void main(String[] args) {
		
		// 함수형 인터페이스 람다식
		Consumer<Integer> consumer = num -> System.out.println(num);
		
		consumer.accept(190);
				
	}

}
