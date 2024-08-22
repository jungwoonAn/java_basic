package access.ex;

public class Item {
	private String name;
	private int price;
	private int quantity;
	
	Item(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
		
	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
