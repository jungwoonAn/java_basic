package ex07;

interface Printable {
	void print();
}

class Papers {
	private String message;
	
	public Papers(String message) {
		this.message = message;
	}
	
	public Printable getPrinter() {
		// 로컬 클래스
//		class Printer implements Printable {  
//	  		@Override
//			public void print() {
//				System.out.println(message);
//			}	
//		}
		
//		Printable p = 이 자리에 올 수 있는 대상은? -> Printable을 구현한 클래스
//		Printable p = new Printer();
	
		// 익명 클래스
		Printable p = new Printable() {  // Printable을 구현한 이름 없는 클래스
			@Override
			public void print() {
				System.out.println(message);
			}
		};
		
		return p;

		// 다음 단계.. 변수 p대신 바로 Printable 구현 객체 return
//		return new Printable() {  
//			@Override
//			public void print() {
//				System.out.println(message);
//			}
//		};
	}
	
}

public class AnonymousClass {

	public static void main(String[] args) {
		Papers paper = new Papers("이 문장을 출력해주세요~!");
		Printable p = paper.getPrinter();
		p.print();
	}

}
