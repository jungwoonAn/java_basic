package ex05;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet02 {
	public static void main(String[] args) {
		// TreeSet -> 자동 정렬(대문자, 소문자순으로 오름차순)
		Set<String> set = new TreeSet<>();
		
		set.add("kor");
		set.add("eng");
		set.add("KOR");
		set.add("ENG");
		set.add("Math");
		set.add("math");		
		set.add("abc");		
		
		Iterator<String> itr = set.iterator();

		while(itr.hasNext())
			System.out.println(itr.next());
				
	}
}
