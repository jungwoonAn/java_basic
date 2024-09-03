package exam01;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

interface ArrSum {
	int sumArr(int[] arr);
}

public class LambdaExam01 {

	public static void main(String[] args) {

		// max()
		BiFunction<Integer, Integer, Integer> max = (a,b) -> a>b ? a : b;
		System.out.println("최댓값 : " + max.apply(55, 21));
		
		//printVar()
		BiConsumer<String, Integer> printVar = (name, i) -> System.out.println(name + " = " + i);
		printVar.accept("홍길동", 22);
		
		//square()
		Function<Integer, Integer> square = x -> x*x;
		System.out.println("사각형 넓이 :" + square.apply(10));
		
		// roll()
		Supplier<Integer> roll = () -> (int)(Math.random()*6);
		System.out.println("랜덤 숫자 : " + roll.get());
		
		// sumArr()
		int[] arrs = {1,2,3,4,5};
		ArrSum asum = (int[] arr) -> {
			int sum=0;
			for(int i : arr)
				sum += i;
			return sum;
		};
		
		System.out.println("배열의 합 : " + asum.sumArr(arrs));
	}

}
