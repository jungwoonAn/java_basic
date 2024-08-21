package array.ex;

// 문제1. 배열을 사용하여 개선해보자.
public class ArrayEx1 {

	public static void main(String[] args) {
//		int student1 = 90;
//		int student2 = 80;
//		int student3 = 70;
//		int student4 = 60;
//		int student5 = 50;
		
		int[] students = {90,80,70,60,50};
		
//		int total = student1 + student2 + student3 + student4 + student5;
		
		int total = 0;
		for(int student : students) {
			total += student;
		}
		
		double average = (double) total / 5;
		
		System.out.println("점수 총합 : " + total);
		System.out.println("점수 평균 : " + average);
	}

}
