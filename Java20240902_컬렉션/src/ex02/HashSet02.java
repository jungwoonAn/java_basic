package ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet02 {

	public static void main(String[] args) {
		// Set 컬렉션 - 중복 안됨, 순서 없음
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);  // 중복된것 입력 안됨
		
		for(Integer i : set)
			System.out.print(i + " ");
		
		System.out.println("\n----------------");
				
		// 반복자 획득
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
					
	}

}
