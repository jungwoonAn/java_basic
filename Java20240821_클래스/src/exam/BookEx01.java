package exam;

public class BookEx01 {

	public static void main(String[] args) {
		Book book1 = new Book("톰 소여의 모험", "마크 트웨인", 8000, 100);
		
		book1.info();
		book1.sale(3);
		book1.quantityCount();
		book1.store(1);
		book1.quantityCount();
		book1.saleToalPrice();
		
	}

}

class Book {
	String title;
	String author;
	int price;
	int quantity;
	int saleQuantity;
	
	Book(String title, String author, int price, int quantity){
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	
	void info() {
		System.out.printf("책제목 : %s, 작가 : %s, 가격 : %d, 재고수량 : %d \n", title, author, price, quantity);
	}
	
	void sale(int num) {
		quantity -= num;
		saleQuantity += num;
		System.out.println(num + "권을 판매하였습니다.");
	}
	
	void store(int num) {
		quantity += num;
		System.out.println(num + "권이 입고되었습니다.");		
	}
	
	void quantityCount() {
		System.out.println(quantity + "권이 재고 수량입니다.");
	}
	
	void saleToalPrice() {
		 int totalPrice = saleQuantity * price;
		 System.out.println("총판매급액은 " + totalPrice + "원 입니다.");
	}
}
