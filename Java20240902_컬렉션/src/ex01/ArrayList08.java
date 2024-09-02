package ex01;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.List;
import java.util.Set;

public class ArrayList08 {

	public static void main(String[] args) {
		// Set 컬렉션 - 중복 안됨, 순서 없음
//		List<String> list = new ArrayList<>();
		Set<String> list = new HashSet<String>();
		
		list.add("kor");
		list.add("eng");
		list.add("math");
		list.add("com");
		list.add("kor");
		
		for(String str : list)
			System.out.print(str + " ");
				
		// 반복자 획득
//		Iterator<String> itr = list.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.print(itr.next() + " ");
//		}
					
	}

}
