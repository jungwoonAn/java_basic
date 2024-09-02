package ex01;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		// 타입 제한  -> String
		ArrayList<String> list = new ArrayList<String>();
		
//		list.add(10);  // 오토박싱 됨
//		list.add(new Integer(20));
		list.add("kor");
		list.add("eng");
		list.add("math");
		list.add("com");
				
		for(Object obj : list)
			System.out.print(obj + ", ");
	}

}
