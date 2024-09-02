package ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet01 {

	public static void main(String[] args) {
		// Set 컬렉션 - 중복 안됨, 순서 없음
		Set<String> set = new HashSet<String>();
		
		set.add("kor");
		set.add("eng");
		set.add("math");
		set.add("com");
		set.add("kor");
		
		for(String str : set)
			System.out.print(str + " ");
		
		System.out.println("\n----------------");
				
		// 반복자 획득
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
					
	}

}
