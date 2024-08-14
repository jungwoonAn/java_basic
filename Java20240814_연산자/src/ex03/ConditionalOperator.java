package ex03;

public class ConditionalOperator {
	public static void main(String[] args) {
		// 국어점수가 70이상이면 합격, 아니면 불합격
		int kor = 65;
		
		String result = (kor >= 70) ? "합격" : "불합격";
		
		System.out.println(result);
	}
}
