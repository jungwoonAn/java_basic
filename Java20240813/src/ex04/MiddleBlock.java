package ex04;

public class MiddleBlock {

	public static void main(String[] args) {
		int n = 100;
		n = 200;
		
		int kor;  // 변수 선언
		kor = 100;  // 변수 초기화
		System.out.println(kor);  // 변수 사용
		
		{
			int num = 10;
			// 블럭 안에서 선언한 변수는 블럭 안에서 사용 가능
			System.out.println(num); 
			// 블럭 밖에서 선언한 변수는 블럭 안에서 사용 가능
			System.out.println(kor);  
		}
		// 블럭 안에서 선언한 변수는 블럭 밖에서는 사용 불가
//		System.out.println(num);  
		
		{
			int num2 = 20;
			System.out.println(num2);
			System.out.println(kor);
			
		}
		
		{
			int num3 = 30;
			System.out.println(num3);
			System.out.println(kor);
		}
	}

}
