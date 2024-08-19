package ex01;

public class Exercise01 {

	public static void main(String[] args) {
		
		// int형 배열 참조변수 nArr설정
		int[] nArr = new int[5];
		
		// 배열 초기화 -> 값의 범위 1~100 => 랜덤함수 이용해서
		for(int i=0; i<nArr.length; i++) {
			nArr[i] = (int)((Math.random()*100)+1);
		}
		// 배열 출력
		for(int i=0; i<nArr.length; i++) {			
			System.out.print(nArr[i] + ", ");
		}
		
		// 최댓값 & 최솟값 구하기
		int max = nArr[0];
		int min = nArr[0];
		
		for(int i=0; i<nArr.length; i++) {
			if(max < nArr[i]) max = nArr[i];						
			if(min > nArr[i]) min = nArr[i];			
		}
		
		System.out.printf("\n최댓값 : %d, 최솟값 : %d", max, min);
		
		// 합계 & 평균 구하기
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<nArr.length; i++) 
			sum += nArr[i];		
		
		avg = (double)sum / nArr.length;
		
		System.out.printf("\n합계 : %d, 평균 : %.2f", sum, avg);
		
		System.out.println("\n-----배열 정렬-----");
		
		// 배열값 순차정렬(이중for문)
		for(int i=0; i<nArr.length; i++) {  // 1~5회선
			for(int j=0; j<nArr.length-1-i; j++) { // 앞,뒤 비교해서 큰 값은 뒤로 이동
				if(nArr[j] > nArr[j+1]) {
					int tmp = nArr[j];
					nArr[j] = nArr[j+1];
					nArr[j+1] = tmp;
				}				
			}
		}
		
		// 정렬후 출력
		for(int i=0; i<nArr.length; i++) 			
			System.out.print(nArr[i] + ", ");
		
	}

}
