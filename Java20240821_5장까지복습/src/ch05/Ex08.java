package ch05;

// 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해 보세요(중첩 for문 이용)
public class Ex08 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double age = 0;
		int lengths = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			}
			lengths += array[i].length;
		}
				
		age = (double)sum / lengths;
		
		System.out.printf("합계 : %d, 평균 : %.2f", sum, age);
	}

}
