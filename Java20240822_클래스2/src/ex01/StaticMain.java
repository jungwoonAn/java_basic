package ex01;

class StaticEx{
	int count = 0;  // 인스턴스 변수
	static int cnt = 0;  // 클래스(정적) 변수
	
	void func() {  // 인스턴스 메서드
		// 인스턴스 변수, 클래스 변수 사용가능
		// 인스턴스 메서드, 클래스 메서드 사용가능
	}
	
	static void sfunc() {  // 클래스 메서드
		// 클래스 변수, 클래스 메서드 사용가능
		// 인스턴스 변수, 인스턴스 메서드 사용 불가
	}
}

public class StaticMain {

	public static void main(String[] args) {
		
		StaticEx ex1 = new StaticEx();		
		ex1.count++;
		ex1.cnt++;  // StaticEx.cnt++;
		System.out.println(ex1.count + ", " + ex1.cnt);
		
		StaticEx ex2 = new StaticEx();		
		ex2.count++;
		StaticEx.cnt++;
		System.out.println(ex2.count + ", " + ex2.cnt);
		
		StaticEx ex3 = new StaticEx();		
		ex3.count++;
		StaticEx.cnt++;
		System.out.println(ex3.count + ", " + ex3.cnt);
	}

}
