package ex03;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5];  // 각 방에는 0으로 초기화
		String[] str = new String[5];  // 각 방에는 null로 초기화
		
		int[] arr2 = {10,20,30,40,50};
		
		int[] arr3 = new int[] {10,20,30,40,50};
//		int[] arr3 = new int[5] {10,20,30,40,50};  // (X)첨자는 생략해야 함!
		
		System.out.println(arr2);  // 배열의 주소값이 저장되어 있음
				
	}

}
