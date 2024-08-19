package ex01;

public class Coutinue01 {

	public static void main(String[] args) {
		// 1~10 홀수 합 구하기
		int sum = 0;
		for(int i=1; i<=10; i+=2) 
			sum+= i;
		
		System.out.println(sum);
		
		// 1~10 짝수 합 구하기
		sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) continue;  // 홀수이면 continue 다음 실행문 실행하지 않고 반복문 돌아감 
			sum += i;
		}
		System.out.println(sum);
	}

}
