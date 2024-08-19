package ex02;

public class WhileEx01 {

	public static void main(String[] args) {
		// 1~100까지 합
		int sum=0;
		int i=1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
	}

}
