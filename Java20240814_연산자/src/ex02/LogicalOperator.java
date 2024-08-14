package ex02;

public class LogicalOperator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println((num1 == num2) && (num1 != num2));  // false	&& true -> false	
		System.out.println((num1 == num2) || (num1 != num2));  // false || true -> true		
		
		System.out.println(!((num1 == num2) && (num1 != num2)));  // !(false) -> true	
	}

}
