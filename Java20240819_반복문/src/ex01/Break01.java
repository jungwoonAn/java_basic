package ex01;

public class Break01 {

	public static void main(String[] args) {
		// 1~100까지의 합  -> 100변 연산 후 5050
		int sum=0;
		for(int i=1; i<=100; i++) 
			sum += i;

		System.out.println("sum : " + sum);
		
		// 1~10000회전 -> 연산결과가 5,000이 넘는 연산 횟수
		int i=0, sum2=0;
		for(; i<10000;) {
			if(sum2> 5000) break;
			sum2 += i;
			i++;
		}
		
		System.out.println((i-1) + "회전하면 sum값은 1,000,000이 넘는다. 이때 sum값은 " + sum2);
		
	}

}
