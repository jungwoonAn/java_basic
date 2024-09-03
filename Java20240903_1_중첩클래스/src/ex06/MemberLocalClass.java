package ex06;

interface Printable {
	void print();
}

class Papers {
	private String message;
	
	public Papers(String message) {
		this.message = message;
	}
	
	public Printable getPrinter() {
		// 로컬 클래스 - 메서드 안에 클래스 선언
		class Printer implements Printable {  
	  		@Override
			public void print() {
				System.out.println(message);
			}	
		}
		
		return new Printer();
	}
	
//	void func() {
//		return new Printer();  // 로컬 클래스는 메서드 밖에서 객체 생성 불가
//	}
	
}

public class MemberLocalClass {

	public static void main(String[] args) {
		Papers paper = new Papers("이 문장을 출력해주세요~!");
		Printable p = paper.getPrinter();
		p.print();
	}

}
