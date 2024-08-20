package ex02;

public class AddFunc01 {
	
	public static void main(String[] args) {
		int sum = add(10,20);
		System.out.println("sum : " + sum);
	}
	
	static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;		
	}
	
}
