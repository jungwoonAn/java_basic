package construct.ex;

public class Book {
	private String title;
	private String author;
	private int page;
	
	// 기본생성자
	Book (){}
	
	// 생성자 오버로딩
	Book(String title, String author){
		this(title, author, 0);
	}
	
	Book(String title, String author, int page){
		this.title = title;
		this.author = author;
		this.page = page;
	}	
	
	// 출력 메서드
	void displayInfo() {
		System.out.println("제목 : " + title + ", 저자 : " + author + ", 페이지 : " + page);
	}
}
