package ex04;

import java.util.StringTokenizer;

public class StringTokenMain {

	public static void main(String[] args) {
		String data = "홍길동&성춘향,이몽롱";
		System.out.println(data);
		
		// split() : 문자열 구분자로 구분하여 배열에 저장
		String[] strs = data.split("&|,");
		for(String str : strs)
			System.out.println(str);
		
		System.out.println("---------------");
		
		String data2 = "홍길동&성춘향,이몽롱";
		
		StringTokenizer st = new StringTokenizer(data2, "&,");
		while(st.hasMoreElements()) {
			String str = st.nextToken();
			System.out.println(str);
		}
	}

}
