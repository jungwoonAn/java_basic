package oop_exam3;

public class TVTest {

	public static void main(String[] args) {
		// SaleTV, RentalTV 클래스의 객체를 각각 생성한다.
		SaleTV saletv = new SaleTV("SALETV-1", 40, 1, 300000);
		RentalTV rentaltv = new RentalTV("RENTALTV-10", 42, 1, 100000);
		
		// SaleTV 객체는 채널을 두 개 높인다.
		saletv.channelUp();
		saletv.channelUp();
		
		// RentalTV 객체는 채널을 세 개 내린다.
		rentaltv.channelDown();
		rentaltv.channelDown();
		rentaltv.channelDown();
		
		// 각 객체에 대하여 printAllTV()을 호출한다.
		printAllTV(saletv);
		System.out.println();
		printAllTV(rentaltv);
		
		// Rentable 타입의 객체인 RentalTV 객체는 printRentalTV() 를 호출한다.
		printRentalTV(rentaltv);
	}
	
	static void printAllTV(TV tv) {
		// 아규먼트로 전달된 객체의 toString() 을 호출하여 각 상품의 정보를 출력한다.
		System.out.println(tv.toString()); 
		
		// 아규먼트로 전달된 객체의 play() 를 호출한다.
		// tv 변수에 전달된 객체가 SaleTV 타입이면 sale() 메서드를 호출한다.
		if(tv instanceof SaleTV saletv) {			
			saletv.play();
			saletv.sale();
		}else if(tv instanceof RentalTV rentaltv) {
			rentaltv.play();
		}		
	}
	
	static void printRentalTV(Rentable tv) {
		// 아규먼트로 전달된 Rentable 객체의 rent() 메서드를 호출한다.
		tv.rent();				
	}

}
