package ex01;

import java.util.Arrays;

public class MyFirstStream02 {

	public static void main(String[] args) {
		
		String[] arr = {"AA","BBB","CCCC","DDDDD","EEEEEE"};
		
		// 문자열 길이값 출력
		// 향상된 for문
		for(String str : arr) {
			System.out.print(str.length() + " ");
		}
		System.out.println();
		
		// stream - map(), forEach()
		Arrays.stream(arr)
			.map(str -> str.length())
			.forEach(n -> System.out.print(n + " "));
		
		// 문자열 길이값의 합 - mapToInt(), sum()
		int total = Arrays.stream(arr).mapToInt(n -> n.length()).sum();
		System.out.println("\n" + total);
	}

}
