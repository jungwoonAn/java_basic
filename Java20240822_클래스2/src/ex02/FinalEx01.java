package ex02;

public final class FinalEx01 {  // final class -> class 상속 불가
	// 인스턴스 final 필드 선언
	final int MAX;
	
	// 생성자 선언
	FinalEx01(int n){
		MAX = n;  // 생성자를 통해 초기화
	}

	public static void main(String[] args) {
		// 상수 선언 및 초기화
		final double PI = 3.141592;  // 상수는 변수명을 대문자로
		
//		pi = 4.1; // final로 선언된 변수(상수)는 변경 불가
	}
	
	public final void func() {  // final 메서드 -> 오버라이딩 불가
		
	}

}
