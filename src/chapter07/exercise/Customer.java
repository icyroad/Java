package chapter07.exercise;

public class Customer {
	private 	String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	public void setAccount(BankAccount account) {
		accounts[numberOfAccounts] = account;
	}
	
	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	public String toString() {
		return String.format("이름: " + getFirstName() + " " + getLastName() + ", 계좌의 개수: " + numberOfAccounts);
		
	}
	
}
