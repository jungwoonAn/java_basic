package ex05;

interface Printable {
	void print();
}

class Papers {
	private String message;
	
	public Papers(String message) {
		this.message = message;
	}
	
	// 반환타입:Printable -> Printable 구현한 클래스만 반환한다.
	public Printable getPrinter() {
		return new Printer();
	}
	
	private class Printer implements Printable {  // 인스턴스 멤버 클래스
	// 접근권한 private로 Papers클래스 안에서만 사용 가능한 클래스
  		@Override
		public void print() {
			System.out.println(message);
		}	
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		Papers paper = new Papers("이 문장을 출력해주세요~!");
		Printable p = paper.getPrinter();
		p.print();
	}

}
