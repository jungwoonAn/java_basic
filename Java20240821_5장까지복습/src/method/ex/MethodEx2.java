package method.ex;

// 메서드를 사용해서 리펙토링하기
public class MethodEx2 {

	public static void main(String[] args) {
//		String message = "Hello, Java!";
//		
//		for(int i=0; i<3; i++) {
//			System.out.println(message);
//		}
//		
//		for(int i=0; i<5; i++) {
//			System.out.println(message);
//		}
//		
//		for(int i=0; i<7; i++) {
//			System.out.println(message);
//		}
		
		loop("Hello, Java!", 3);
		loop("Hello, Spring!", 5);
		loop("Hello, Java!", 7);
	}
	
	public static void loop(String message, int num) {
		for(int i=0; i<num; i++) {
			System.out.println(message);
		}
	}

}
