package ex01;

import java.util.Arrays;

public class MyFirstStream01 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		// 1. filter(IntPredicate)
		// 홀수만 필터해서 합을 구하는 stream
		int oddtotal = Arrays.stream(arr).filter(n -> n%2==1).sum();
		System.out.println(oddtotal);
		
		// 짝수만 필터해서 합을 구하는 stream
		int eventotal = Arrays.stream(arr).filter(n -> n%2==0).sum();
		System.out.println(eventotal);
		
		// 3의 배수의 갯수
		long count = Arrays.stream(arr).filter(i -> i%3 == 0).count();
		System.out.println(count);
		
		// 2. forEach(IntConsumer)
		// 배열 반복 출력
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
	}

}
