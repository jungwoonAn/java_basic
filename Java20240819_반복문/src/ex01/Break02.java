package ex01;

public class Break02 {

	public static void main(String[] args) {
		// 구구단 출력
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {				
				System.out.printf("%d * %d = %d\n", i, j, i*j);	
				if(i == j) break;
			}
			System.out.println("-----------");
		}
		
	}

}
