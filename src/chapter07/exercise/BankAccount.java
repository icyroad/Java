package chapter07.exercise;

public class BankAccount {
	private int balance;	
	
	
	protected BankAccount (int balance)	 {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public  void deposit(int amount) {
		balance += amount;
	}
	
	public boolean withdraw(int amount) {
		if (balance - amount <0) {
			System.out.println("잔액이 부족합니다.");
			return false;
		}  else if (amount<0) {
			System.out.println("금액은 음수일 수 없습니다.");
			return false;
		}	else {
			balance -=amount;
			return true;
		}
	}
	
	public 	boolean transfer(int amount, BankAccount otherAccount) {
		if (balance - amount <0 ) {
			System.out.println("잔액이 부족합니다.");
			return false;
		} else if (amount<0) {
			System.out.println("금액은 음수일 수 없습니다.");
			return false;
		}else {
			balance -= amount;
			otherAccount.balance +=amount;
			return true;
		}
	}
	
	public String toString() {
		return String.format("잔액: " + balance);
	}
}
