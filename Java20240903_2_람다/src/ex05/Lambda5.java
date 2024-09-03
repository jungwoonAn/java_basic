package ex05;

interface Printable {
	void print();  // 추상 메서드
}

// 매개변수가 없는 경우 괄호 생략 불가
// 함수 몸체 안에 문장이 2개 이상이면 중활호 생략 불가
public class Lambda5 {

	public static void main(String[] args) {
		
		Printable p = () -> {
			System.out.println("인자값이 없네-1!!");				
			System.out.println("인자값이 없네-2!!");				
		};
					
		p.print();
	}

}
