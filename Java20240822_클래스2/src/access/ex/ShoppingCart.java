package access.ex;

public class ShoppingCart {
	private Item[] items = new Item[10];
	private int count;
	
	void addItem(Item item) {
		if(count >= items.length) {
			System.out.println("장바구니가 가득 찼습니다.");
			return;
		}
		items[count] = item;
		count++;
	}
	
	void displayItems() {
		System.out.println("장바구니 상품 출력");
		int totalPrice = 0;
		for(int i=0; i<count; i++) {
			int sum = items[i].getPrice() * items[i].getQuantity();
			totalPrice += sum;
			System.out.println("상품명 : " + items[i].getName() + ", 합계 : " + sum);
		}
		System.out.println("전체 가격 합 : " + totalPrice);
	}
}
