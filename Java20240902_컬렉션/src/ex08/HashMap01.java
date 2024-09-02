package ex08;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {

	public static void main(String[] args) {
		
		// key : 중복 X, value : 중복 O
		Map<Integer, String> map = new HashMap<Integer, String>();
				
		map.put(1, "kim");
		map.put(2, "park");
		map.put(3, "hong");
		map.put(4, "Lee");
		map.put(4, "cho");  // 덮어씀
		map.put(3, "han");	// 덮어씀
		map.put(5, "han");			
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		System.out.println(map.get(5));
	}

}
