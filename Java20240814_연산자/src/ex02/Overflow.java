package ex02;

public class Overflow {

	public static void main(String[] args) {
		// byte -128~127
		byte b = 127;
		++b;
		System.out.println(b);
		++b;
		System.out.println(b);
		
		b = -128;
		--b;
		System.out.println(b);
		--b;
		System.out.println(b);		

	}

}
