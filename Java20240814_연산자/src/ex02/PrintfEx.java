package ex02;

public class PrintfEx {

	public static void main(String[] args) {		
		
		// printf 연습
		int num3 = 12;
		int num4 = 123;
		int num5 = 1234;
		int num6 = 12345;
		
		System.out.println(num3 + " , " + num3);
		System.out.println(num4 + " , " + num4);
		System.out.println(num5 + " , " + num5);
		System.out.println(num6 + " , " + num6);
		System.out.println("-----------------");
		
		System.out.printf("%d, %d \n", num3, num3);
		System.out.printf("%d, %d \n", num4, num4);
		System.out.printf("%d, %d \n", num5, num5);
		System.out.printf("%d, %d \n", num6, num6);
		System.out.println("-----------------");
		
		System.out.printf("%5d, %5d \n", num3, num3);
		System.out.printf("%5d, %5d \n", num4, num4);
		System.out.printf("%5d, %5d \n", num5, num5);
		System.out.printf("%5d, %5d \n", num6, num6);
		System.out.println("-----------------");
		
		System.out.printf("%05d, %05d \n", num3, num3);
		System.out.printf("%05d, %05d \n", num4, num4);
		System.out.printf("%05d, %05d \n", num5, num5);
		System.out.printf("%05d, %05d \n", num6, num6);
		System.out.println("-----------------");
		
		System.out.printf("%-5d, %5d \n", num3, num3);
		System.out.printf("%-5d, %5d \n", num4, num4);
		System.out.printf("%-5d, %5d \n", num5, num5);
		System.out.printf("%-5d, %5d \n", num6, num6);
		System.out.println("-----------------");
				
	}

}
