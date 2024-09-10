package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstStream03 {

	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<String>();
//		list.add("AA");
//		list.add("BBB");
//		list.add("CCCC");
//		list.add("DDDDD");
//		list.add("EEEEEE");
//		
//		list.remove(0);
//		list.add("FF");
		                    // 수정 불가
		List<String> list = Arrays.asList("AA","BBB","CCCC","DDDDD","EEEEEE");
		// 수정하려면 ArrayList에 다시 담아야 함.
		list = new ArrayList<>(list);
		
		list.add("FF");
		list.remove(0);
		
		for(String str : list)
			System.out.print(str + " ");
		System.out.println("\n-----------------");
		
		list.stream()
			.map(str -> str.length())
			.forEach(n -> System.out.print(n + " "));
		
		int count = list.stream().mapToInt(n -> n.length()).sum();
		System.out.println("\n" + count);
		
	}

}
