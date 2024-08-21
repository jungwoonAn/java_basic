package exam;

public class BankEx01 {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.accountNum = "111-222-333";
		account1.owner = "강감찬";
		account1.balance = 1000000;
		
		account1.info();
		account1.income(100000);
		account1.balancePrint();
		account1.outcome(50000);
		account1.balancePrint();
		
		System.out.println("----------------------");
		
		Account account2 = new Account();
		account2.accountNum = "999-888-777";
		account2.owner = "권율";
		account2.balance = 5000;
		
		account2.info();
		account2.income(10000);
		account2.balancePrint();
		account2.outcome(8000);
		account2.balancePrint();
		
	}

}

class Account {
	String accountNum;
	String owner;
	int balance;
		
	void info() {
		System.out.printf("계좌번호 : %s, 소유자 : %s, 잔액 : %d원 \n", accountNum, owner, balance);
	}
	
	void income(int money) {
		balance += money;
		System.out.println(money + "원을 입금했습니다.");
	}
	
	void outcome(int money) {
		balance -= money;
		System.out.println(money + "원을 출금했습니다.");
	}
	
	void balancePrint() {
		System.out.println("잔액 : " + balance + "원");
	}
}
