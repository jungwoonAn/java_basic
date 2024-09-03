package ex03;

interface Printable {
	void print(String msg);  // 추상 메서드
//	void print2(String msg);  // 추상 메서드 1개 이상이면 람다는 사용 불가	
	
	public static void print2() {}  // 정적 메서드는 람다하고 상관 없음 
	default void print3() {}  // default 메서드는 람다하고 상관 없음
}
/*
 * 람다
 * 1. 추상메서드가 1개만 존재해야 람다 생성 가능
 * 2. 매개변수 자료형 생략 가능
 * 3. 매개변수 1개면 소괄호 생략 가능
 * 4. 실행문이 1개면 중괄호 생략 가능
 */
public class Lambda3 {

	public static void main(String[] args) {
		
		Printable p = msg -> System.out.println(msg);				
					
		p.print("이 문장 출력 요망!!");
	}

}
