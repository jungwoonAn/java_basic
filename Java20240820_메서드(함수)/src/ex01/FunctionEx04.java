package ex01;

public class FunctionEx04 {

	public static void main(String[] args) {
		int result = func4();  // 함수 호출	
		
		if(result == 0) {
			System.out.println("입력값은 짝수!");
		}else {
			System.out.println("입력값은 홀수!");			
		}
	}
	
	// 반환타입 O, 입력값(매개변수) X
	static int func4() {
		int num = 10;
		if(num%2 == 0) {
			return 0;  // 짝수
		}else {
			return 1;  // 홀수			
		}
	}

}
