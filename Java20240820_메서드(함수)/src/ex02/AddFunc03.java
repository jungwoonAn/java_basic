package ex02;

public class AddFunc03 {

	public static void main(String[] args) {
		double result = func(100);
		System.out.println(result);
	}
	
	// 정수 값 10 넘겨주면 1~10까지 합을 구해서 평균을 리턴시키는 함수
	static double func(int n) {
		int sum = 0;
		
		for(int i=0; i<=n; i++) {
			sum += i;
		}
		
		return (double)sum/n;
	}

}
