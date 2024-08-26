package exam01;

public class CashPayment implements Payment {

	@Override
	public void makePayment(double amount) {
		System.out.println("현금으로 " + amount + "원을 결제합니다.");
	}

}
