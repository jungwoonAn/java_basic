package ex01;

public class Operator3 {

	public static void main(String[] args) {
		// 증감 연산자 => 전위연산자, 후위연산자
		
		int num = 10;
		
		int a = 0;
		
		a = --num; 
		/*
		 * num = num - 1;
		 * a = num;		
		 */
		System.out.println("a : " + a);
		System.out.println("num : " + num);
		System.out.println("-------------");
		
		int b = 0;
		
		b = num--;
		/*
		 * b = num;
		 * num = num - 1;
		 */
		System.out.println("b : " + b);
		System.out.println("num : " + num);

	}

}
