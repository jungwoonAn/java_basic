package ex01;

public class BasicType3 {

	public static void main(String[] args) {
		// float은 정밀도가 떨어짐 -> double로 사용할 것
		float sum = 0;
		for(int i=0; i<30; i++)
			sum += 0.1;
		System.out.println(sum);
		System.out.println("------------");
		
		float f1 = 2147483647.0f;
	    float f2 = 2147483637.0f;
	    float f3 = 2147483657.0f;
	     
	    System.out.printf("%f\n", f1);
	    System.out.printf("%f\n", f2);
	    System.out.printf("%f\n", f3);
	    System.out.println("------------");
	      
	    double d1 = 2147483647.0;
	    double d2 = 2147483637.0;
	    double d3 = 2147483657.0;
	     
	    System.out.printf("%f\n", d1);
	    System.out.printf("%f\n", d2);
	    System.out.printf("%f\n", d3);

	}

}
