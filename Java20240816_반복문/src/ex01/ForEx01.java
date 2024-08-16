package ex01;

public class ForEx01 {

	public static void main(String[] args) {
		int sum = 0;
		
		//시작값에서 끝까지 반복한다.
		//  초기값        끝값  증가값(감소값)
		// 초기값 -> 조건(끝값) -> 실행문 -> 증가
//		for(int i=0; i<=5; i++) {
//			sum += i;
//		}
		
		// 1~10까지 합
//		for(int i=0; i<=10; i++) {
//			sum += i;
//		}
		
		// 1~10까지 짝수 합
		for(int i=0; i<=10; i+=2) {
			sum += i;
		}
		
		System.out.println("sum = " + sum);
	}

}
