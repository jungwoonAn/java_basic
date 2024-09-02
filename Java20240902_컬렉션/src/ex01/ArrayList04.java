package ex01;

import java.util.LinkedList;

public class ArrayList04 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("kor");
		list.add("eng");
		list.add("math");
		list.add("com");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\n----------------------");
		
		list.remove(0);
		
		for(String str : list)
			System.out.print(str + ", ");
	}

}
