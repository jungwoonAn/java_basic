package ex04;

public class StringBuilderMain {

	public static void main(String[] args) {
//		StringBuilder str = new StringBuilder();
		StringBuffer str = new StringBuffer();
		
		// 문자열을 끝에 추가
		str.append("DEF");
		System.out.println(str);
		
		// 문자열을 index 0에 추가
		str.insert(0, "ABC");
		System.out.println(str);
		
		// 문자열을 index 1에 추가
		str.insert(1, "K");
		System.out.println(str);
		
		// 문자열을 1<=index<2 삭제
		str.delete(1, 2);
		System.out.println(str);
		
		// 문자열을 1<=index<2 대체
		str.replace(1, 2, "XYZ");
		System.out.println(str);
		
	}

}
