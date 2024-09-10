package count01;

public class Test25 {

	public static void main(String[] args) {
		// 타입변환
		String str = "abc";
		
		try {
			int i = Integer.parseInt(str);  // 문자열은 숫자타입으로 변환 불가
			System.out.println(i);
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException caught");
		}
	}

}
