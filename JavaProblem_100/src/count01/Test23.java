package count01;

public class Test23 {

	public static void main(String[] args) {
		// 타입변환과 오버플로우
		int i = 130;
		byte b = (byte)i;  // -128~127
				
		System.out.println(b);
	}

}
