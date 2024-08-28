package ex01;

public class Exception04 {

	public static void main(String[] args) {
		int[] arrs = {1,2,3,4,5};		
		int sum = 0;
		
	    // java.lang.ArrayIndexOutOfBoundsException
		try {   
			for(int i=0; i<arrs.length + 1; i++) {
				sum += arrs[i];
			}
		} catch(Exception e) {  
			e.printStackTrace();
			System.out.println("---------------");
			System.out.println(e.getMessage());
		}
		
		System.out.println("합계 : " + sum);
		
	}

}
