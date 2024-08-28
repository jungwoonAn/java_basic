package oop_exam3;

public class RentalTV extends TV implements Rentable {
	private int price;
	
	public RentalTV() {}
		
	public RentalTV(String model, int size, int channel, int price) {
		super(model, size, channel);
		this.price = price;
	}
	
	public void play() {
		System.out.printf("대여 TV 채널 %d번의 프로를 플레이 합니다. \n", getChannel());
	}

	@Override
	public void rent() {
		System.out.printf("%s 모델의 상품을 대여합니다. %,d원을 지불해 주세요. \n", getModel(), price);
	}

	@Override
	public String toString() {
		return "판매상품정보 : 모델명(" + getModel() + "), 가격(" + String.format("%,d", price)
		+ "원), 크기(" + getSize() + ")";
	}
	
}
