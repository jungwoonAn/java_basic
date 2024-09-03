package ex07;

//매개변수 있고, 반환타입 없는 경우
interface MaxInterface {
	void max(int num1, int num2);
	
	public static void func() {}
	default void func2() {}
}

public class Lambda7 {

	public static void main(String[] args) {
		// 익명 클래스
		MaxInterface maxValue = new MaxInterface() {			
			@Override
			public void max(int num1, int num2) {
				int max = (num1 > num2) ? num1 : num2;
				System.out.println("최대값 : " + max);
			}
		};
		
		// 람다
		MaxInterface maxValue2 = (num1, num2) -> {
			int max = (num1 > num2) ? num1 : num2;
			System.out.println("최대값 : " + max);
		};
		
		maxValue.max(5, 1);
		maxValue2.max(5, 11);
	}

}
