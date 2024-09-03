package ex08;

interface Printable {
	void print();
}

class Papers {
	private String message;
	
	public Papers(String message) {
		this.message = message;
	}
	
	public Printable getPrinter() {
		// 람다식		
		return () -> System.out.println(message);
	}
	
}

public class AnonymousClass {

	public static void main(String[] args) {
		Papers paper = new Papers("이 문장을 출력해주세요~!");
		Printable p = paper.getPrinter();
		p.print();
	}

}
