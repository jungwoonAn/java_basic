package ex08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap02 {

	public static void main(String[] args) {
		
		// key : 중복 X, value : 중복 O
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(11, "kim");
		map.put(21, "park");
		map.put(31, "hong");
		map.put(41, "Lee");
		map.put(41, "cho");  // 덮어씀
		map.put(31, "han");	// 덮어씀
		map.put(51, "han");			
						
		// 순차 출력(반복문, iterator)
		Set<Integer> key = map.keySet();  // key값만 리스트에 저장
		for(Integer i : key)
			System.out.print(i + " ");
		System.out.println();
		
		for(Integer i : key)  // 향상된 for문이 편함
			System.out.println(map.get(i));
		System.out.println("---------");
		
		Iterator<Integer> itr = key.iterator();  // 반복자를 얻음
		while(itr.hasNext())
			System.out.println(map.get(itr.next()));
	}

}
