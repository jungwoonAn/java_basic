package ex03;

public class ConditionalOperator2 {
	public static void main(String[] args) {
		// 국어점수가 80이상이면 우수, 60이상 보통, 60이하 분발
		int kor = 55;
				
		String result = (kor >= 80) ? "우수" : (kor >= 60) ? "보통" : "분발";		
		System.out.println(result);		
			
	}
}
