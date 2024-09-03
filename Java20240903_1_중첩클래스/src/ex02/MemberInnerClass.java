package ex02;

class Outer {
	private int num;
	
	class Member {  // 인스턴스 멤버 클래스
		void add(int n) {
			num = n;
		}
		
		int get() {
			return num;
		}
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		Outer outer1 = new Outer();  
		Outer outer2 = new Outer();
		// Outer객체 생성 후
		// 인스턴스 멤버 클래스 생성 가능
		Outer.Member outer1M1 = outer1.new Member();  
		Outer.Member outer2M1 = outer2.new Member();
		
		outer1M1.add(5);
		System.out.println(outer1M1.get());
		
		outer2M1.add(9);
		System.out.println(outer2M1.get());
		
	}

}
