package ex06;

//매개변수 있고, 반환타입 있는 경우
interface MaxInterface {
	int max(int num1, int num2);
}

public class Lambda6 {

	public static void main(String[] args) {

		// 익명 클래스
		MaxInterface max1 = new MaxInterface() {			
			@Override
			public int max(int num1, int num2) {
				return (num1 > num2) ? num1 : num2;
			}
		};
		
		// 람다
		// 중괄호 생략시 return 생략!!
		MaxInterface max2 = (num1, num2) -> (num1 > num2) ? num1 : num2;
		
		System.out.println(max1.max(5, 1));
		System.out.println(max2.max(5, 11));
	}

}
