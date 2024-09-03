package ex08;

import java.util.function.Consumer;

// 숫자 전달하면 출력
public class MethodReference01 {

	public static void main(String[] args) {
		
		// 함수형 인터페이스 람다식
		Consumer<Integer> consumer = num -> System.out.println(num);
		
		// 메서드 참조
		Consumer<Integer> consumer2 = System.out::println;

		
		consumer.accept(190);
		consumer2.accept(299);
				
	}

}
