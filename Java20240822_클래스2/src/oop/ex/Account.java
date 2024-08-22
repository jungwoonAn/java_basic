package oop.ex;

public class Account {
	private int balance;  // 잔액
	
	// 입금 메서드
	void deposit(int amount){
		balance += amount;
	}
	
	// 출금 메서드
	public void withdraw(int amount){
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
		}else {			
			balance -= amount;
		}
	}
	
	int getBalance() {
		return balance;
	}
}
