package ex01;

public class BasicType2 {

	public static void main(String[] args) {
		
		// 문자열 String
		String name="홍길동";
		System.out.println(name);
		
		// char
		char c1 = 65;  // 10진수
		char c2 = 97;
		char c3 = 48;
		char c4 = 0x41;  // 16진수
		char c5 = 0101;  // 8진수
		
		System.out.printf("%c %c %c %n", c1, c2 ,c3);
		System.out.printf("%d %c %n",65, 65);
		System.out.printf("%c %c %c %n", c1, c4, c5);
		
	}

}
