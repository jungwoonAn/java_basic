package ex03;
/*
  정수 연산 정수 => 정수
  정수 연산 실수 => 실수
  정수or실수 연산 문자 => 문자
 */
public class TypeConversion3 {

	public static void main(String[] args) {
		double d2 = 10 + 10.2;  //10.0 + 10.2 = 20.2
		
		String str1 = 10 + "20";  // "10" + "20" = "1020"
		
		System.out.println(d2);
		System.out.println(str1);
 	}

}
