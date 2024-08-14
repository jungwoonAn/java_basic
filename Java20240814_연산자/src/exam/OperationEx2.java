package exam;
/*
	문제2. 클래스 이름은 OperationEx2라고 적어주세요.
	num에는 4000을 입력하세요.
	4000을 시 분 초로 출력해주세요.
	출력결과) 1시간 6분 40초
 */
public class OperationEx2 {

	public static void main(String[] args) {
		int num = 4000;
		
//		int hour = num / (60*60);
//		int minute = (num % 3600) / 60;
//		int second = num % 60;
		
		int hour = (num / 60) / 60;
		int minute = (num / 60) % 60;
		int second = num % 60;
		
		System.out.printf("%d시 %d분 %d초",hour, minute, second);
	}

}
