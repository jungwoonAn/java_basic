package ex03;

public class TypeConversion1 {
	public static void main(String[] args) {
		
		int num1 = 10;  // 10은 메모리공간에 int형으로 저장됨
//		int num2 = 10.2;  //10.2는 메모리공간에 double로 저장되어 int형은 error
		double d1 = 10;
		
		// 작은 자료형은 큰 자료형에 자동으로 형변환 되어 저장됨
		long l1 = 100;
		float f1 = l1; // f1 = 100.0f;
	}
}
