package ex01;

public class Operator1 {

	public static void main(String[] args) {
		// 증감 연산자 => 전위연산자, 후위연산자
		
		int num = 0;
		
		// num = num + 1;  // num = 1 + num;
		++num;  // 전위
		num++;  // 후위
		
		System.out.println(num);

	}

}
