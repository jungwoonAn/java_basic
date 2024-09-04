package ex01;

public class Exception06 {
	public static void main(String[] args) {
		try {
			int num = 6/0;
			System.out.println("Exception 발생했니?");  // 예외 발생 이후 코드는 실행 안함
		} catch(Exception e) {  // 상위클래스는 하위클래스를 참조할 수 있음
			e.printStackTrace();
			System.out.println("---------------");
			System.out.println(e.getMessage());
		} finally {  // 필요한 경우에 작성
			System.out.println("예외가 발생하든 발생하지 않든 무조건 처리하는 블럭");
		}
	}
}
