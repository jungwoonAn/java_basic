package exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HahsMapLab2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		
		
		while(map.size() < 5) {
			System.out.println("나라이름을 입력하세요 : ");
			String nation = sc.nextLine();
			System.out.println("인구 수를 입력하세요 : ");
			Integer population = Integer.parseInt(sc.nextLine());
			
			if(map.containsKey(nation)) {
				System.out.println("*나라명 " + nation + "은(는) 이미 저장되었습니다.*");
				continue;
			}else {		
				map.put(nation, population);
				System.out.println("*저장되었습니다.*");
			}			
			
		}
		System.out.println("5개가 모두 입력되었습니다.");
		sc.close();
		
		// map 전체 출력
		Set<String> key = map.keySet();
		System.out.print("입력된 데이터 : ");
		for(String k : key)
			System.out.printf(k + "(" + map.get(k) + "), ");
		
	}

}
