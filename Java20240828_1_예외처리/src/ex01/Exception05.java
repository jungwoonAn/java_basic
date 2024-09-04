package ex01;

public class Exception05 {

	public static void main(String[] args) {
		String[] arrs = {"1","1oo",null,"2","200"};		
		
		// 예외 종류에 따른 처리
		for(int i=0; i<arrs.length + 1; i++) {
			try {   
				int value = Integer.parseInt(arrs[i]);
				System.out.println("arrs[" + i +"]:" + value );
		
			} catch(ArrayIndexOutOfBoundsException e) {  
				// 배열의 범위를 벗어난 경우
				e.printStackTrace();
				System.out.println("---------------");
				System.out.println(e.getMessage());
			} catch(NullPointerException | NumberFormatException e) {
				// null을 참조한 경우
				e.printStackTrace();
				System.out.println("---------------");
				System.out.println(e.getMessage());
			} catch(Exception e) {  // 상위클래스는 아래에서 처리해야 함!!
				// 위에서 처리 못한 예외들 처리
				e.printStackTrace();
				System.out.println("---------------");
				System.out.println(e.getMessage());
			}
		}
				
	}

}
