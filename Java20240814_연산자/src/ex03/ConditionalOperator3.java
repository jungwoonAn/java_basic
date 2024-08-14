package ex03;

public class ConditionalOperator3 {
	public static void main(String[] args) {
		
		int kor = 85;
		int eng = 65;
		
		// 국어점수가 70이상이고 영어점수가 70이상이면 합격, 아니면 불합격
		String result = (kor >= 70) && (eng >= 70) ? "합격" : "불합격";		
		System.out.println(result);
		
		// 국어점수가 70이상이거나 영어점수가 70이상이면 합격, 아니면 불합격
		String result2 = (kor >= 70) || (eng >= 70) ? "합격" : "불합격";		
		System.out.println(result2);
		
	}
}
