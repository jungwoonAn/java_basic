package ex08;

import java.util.function.BiFunction;

// 숫자 3개 전달하면 문자열 결합하여 반환
@FunctionalInterface
interface TriFunction<T,U,V,R>{
	public R apply(T n1, U n2, V n3);
}

public class FunctionalInterface06 {

	public static void main(String[] args) {
		
		// 함수형 인터페이스 람다식
		TriFunction<Integer, Integer, Integer, String> trifunction = (n1, n2, n3) -> String.valueOf(""+n1+n2+n3);
		
		String str = trifunction.apply(10, 20,30);
		System.out.println(str);
		
	}

}
