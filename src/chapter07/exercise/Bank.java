package chapter07.exercise;

import java.util.Arrays;

public class Bank {

	private Customer[] 	customers;
	private int numberOfCustomers;
	
	public Bank() {
		customers = new Customer[10];
	}
	
	public void addCustomer(Customer customers) {
		this.customers[numberOfCustomers] = customers;
		numberOfCustomers++;
		
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	
	
	public Customer[] getCustomers() {
		
		return customers;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
}	


