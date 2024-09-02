package ex08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);  // 키가 "홍길동"이 같기 때문에 덮어씀
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();
		
		// 키로 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		// 향상된 for문으로 출력
		for(String strkey : keySet)
			System.out.println(strkey + " : " + map.get(strkey));
		System.out.println();
		
		// 키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
			
	}

}
