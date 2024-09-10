package count01;

import java.util.Arrays;

public class Test32 {

	public static void main(String[] args) {
		// 타입변환과 배열 초기화
		double[] array = {1.5, 2.5, 3.5};
		int[] intArray = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			intArray[i] = (int)array[i];
		}
		
		System.out.println(Arrays.toString(intArray));
	}

}
