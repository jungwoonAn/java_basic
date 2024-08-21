package ch05;

// 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해 보세요(for문 이용)
public class Ex07 {

	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		
		int max = array[0];
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i])
				max = array[i];
		}
		
		System.out.println("최대값 : " + max);
	}

}
