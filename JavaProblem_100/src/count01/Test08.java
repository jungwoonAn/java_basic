package count01;

import java.util.function.Function;

public class Test08 {

	public static void main(String[] args) {
		// 람다 표현식
		Function<Integer, Integer> square = x -> x*x;
		
		System.out.println("사각형 넓이 : " + square.apply(5));
	}

}
