package ex03;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		// 2차원 배열
		int[][] kor = {
				{80,81,82,83,84},
				{90,91,92,93,94},
				{78,79,80,81,82}
		};
		
		// 2차원 배열 출력
		for(int i=0; i<kor.length; i++) {
			for(int j=0; j<kor[0].length; j++) {
				System.out.print(kor[i][j] + " ");
			}
			System.out.println();
		}
	}

}
