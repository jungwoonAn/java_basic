package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyFirstStream05 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("alice","bob","charlie");
		
		// 대문자로 출력
		list.stream()
			.map(str -> str.toUpperCase())  // 대문자로 변환
			.forEach(str -> System.out.println(str));
		
		// 대문자로 변환된 데이터를 리스트로 저장
		List<String> upperCaseNames = list.stream()
										.map(str -> str.toUpperCase())
//										.collect(Collectors.toList());
										.toList();  //java 16 부터
		
		System.out.println(upperCaseNames);
		System.out.println(list);
		System.out.println("-----------------------");
		
		// 배열을 리스트에 담기
		int[] arr = {1,2,3,4,5,6,7,8};
		
		List<Integer> list2 = Arrays.stream(arr)
								.boxed()  // int -> Integer 박싱
								.toList();
		
//		list2.add(10);  // toList() 수정불가
		System.out.println(list2);
			
		List<Integer> list3 = Arrays.stream(arr)
								.boxed()  // int -> Integer 박싱
								.collect(Collectors.toList());
		
		list3.add(10);  // collect(Collectors.toList()) 수정가능
		System.out.println(list3);
	}

}
