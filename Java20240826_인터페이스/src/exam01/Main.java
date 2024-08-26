package exam01;

public class Main {

	public static void main(String[] args) {
		Payment ccp = new CreditCardPayment();
		ccp.makePayment(100000);
		
		Payment ppp = new PayPalPayment();
		ppp.makePayment(50000);
		
		Payment cp = new CashPayment();
		cp.makePayment(300000);
	}

}
