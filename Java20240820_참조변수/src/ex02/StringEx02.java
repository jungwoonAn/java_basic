package ex02;

public class StringEx02 {

	public static void main(String[] args) {
				
		// 문자열 비교
		String str3 = "com";
		String str4 = "com";
		System.out.println(str3 == str4);
		
		String str5 = new String("com");
		String str6 = new String("com");
		System.out.println(str5 == str6);
		
		// 문자열이 같은지 검사 : equals()
		boolean bool = str3.equals(str4);
		System.out.println(bool);  

		boolean bool2 = str5.equals(str6);
		System.out.println(bool2);  
		
		// 특정 문자열로 시작하는지 확인 : startsWith(), 끝나는지 확인 : endsWith()
		String oldStr = "java programming";
		boolean bool3 = oldStr.startsWith("java");
		System.out.println(bool3);
		
		// 문자열 공백 제거 : trim()
		String str7 = "   Java Spring    ";
		System.out.println(str7.length());
		System.out.println(str7);
		
		String str8 = str7.trim();
		System.out.println(str8);
		
		// 문자열 대문자로 : toUpperCase(), 소문자로 : toLowerCase()
		System.out.println(str8.toUpperCase());
		System.out.println(str8.toLowerCase());
	}

}
