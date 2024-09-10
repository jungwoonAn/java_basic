package count01;

public class Test03 {

	public static void main(String[] args) {
		// 다중 catch 블럭
		try {
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException caught");
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
	}

}
