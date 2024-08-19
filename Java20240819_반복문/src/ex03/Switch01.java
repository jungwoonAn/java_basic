package ex03;

public class Switch01 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*7);  // 0~7
		
		System.out.print("랜덤숫자 : " + n + ", ");
		
		switch(n) {
			case 0:
				System.out.println("영");
				break;
			case 1:
				System.out.println("일");
				break;
			case 2:
				System.out.println("이");
				break;
			case 3:
				System.out.println("삼");
				break;
			case 4:
				System.out.println("사");
				break;
			default:
				System.out.println("0~4값이 아닙니다.");
		}
	}

}
