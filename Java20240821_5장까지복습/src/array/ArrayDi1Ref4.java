package array;

public class ArrayDi1Ref4 {

	public static void main(String[] args) {
		// 4x5 2차원 배열
		int[][] arr = new int[4][5];  //행(row), 열(column)
		
		int value = 1;
		// 순서대로 1씩 증가하는 값을 입력한다.
		for(int row=0; row<arr.length; row++) 
			for(int column=0; column<arr[row].length; column++)
				arr[row][column] = value ++;  // 0행, 0열
		
		// 2차원 배열의 길이를 활용하여 출력
		for(int row=0; row<arr.length; row++) {
			for(int column=0; column<arr[row].length; column++)
				System.out.printf("%02d ", arr[row][column]);
			System.out.println();				
		}
	}

}
