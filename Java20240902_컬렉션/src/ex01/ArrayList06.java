package ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		// 출력 -> Iterator()
		List<String> list = new ArrayList<>();
		
		list.add("kor");
		list.add("eng");
		list.add("math");
		list.add("com");
				
		// 반복자 획득
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
					
	}

}
