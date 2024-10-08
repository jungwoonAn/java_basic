package ex03;

/* 
수동 타입 변환 or 강제 타입 변환
큰 자료형 -> 작은 자료형 대입한다.
*/

public class TypeConversion2 {

	public static void main(String[] args) {
		short s1;
		int num1 = 50000;
		
		// 강제 타입 변환 int -> short 즉 50000을 short(32767) 공간에 넣겠다.
		s1 = (short)num1;  // 강제 타입변환시 허용범위 밖이면 오버플로우발생		 
		System.out.println(s1);
		
		int num2 = 32766;
		s1 = (short)num2;  // 강제 타입변환시 허용범위 이내이면 값이 유지됨
		System.out.println(s1);
		
		double d1 = 10.2;
		int num3 = (int)d1;
		
		System.out.println(num3);
	}

}
