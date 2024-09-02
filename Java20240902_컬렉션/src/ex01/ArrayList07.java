package ex01;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayList07 {

	public static void main(String[] args) {
		// Vector
		List<String> list = new Vector<>();
		
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
