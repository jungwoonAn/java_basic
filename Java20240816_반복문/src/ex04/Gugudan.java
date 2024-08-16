package ex04;

public class Gugudan {

	public static void main(String[] args) {
		
//		for(int i=1; i<10; i++) {
//			System.out.printf("2 * %d = %d \n", i, 2*i);
//		}
//		System.out.println("------------");
//		
//		for(int i=1; i<10; i++) {
//			System.out.printf("3 * %d = %d \n", i, 3*i);
//		}
//		System.out.println("------------");
//		
//		for(int i=1; i<10; i++) {
//			System.out.printf("4 * %d = %d \n", i, 4*i);
//		}
//		System.out.println("------------");
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i*j);
			}
			System.out.println("------------");
		}
	}

}
