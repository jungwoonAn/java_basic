package ex01;

import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("kor");
		list.add("eng");
		list.add("math");
		list.add("com");
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\n----------------------");
		
		list.remove(0);
		
		for(String str : list)
			System.out.print(str + ", ");
	}

}
