package ex04;

interface Printable {
	void print(String msg, int count);  // 추상 메서드
}

// 매개변수가 두 개이상인 경우 소괄호 생략 불가
public class Lambda4 {

	public static void main(String[] args) {
		
		Printable p = (msg, count) -> System.out.println(msg + ", " + count);				
					
		p.print("이 문장 출력 요망!!", 5);
	}

}
