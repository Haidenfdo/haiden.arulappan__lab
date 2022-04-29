package com.fwsa;

public class Account {

	Account(String name, String address, String dob, int contact) {
		setName(name);
		setAddress(address);
		setDob(dob);
		setContact(contact);
		setBalance(0);
	}

	Account(String name, String address, String dob, int contact, float balance) {
		setName(name);
		setAddress(address);
		setDob(dob);
		setContact(contact);
		setBalance(balance);
	}
	
	
	public void credit(float amount) {
		float newBalance = getBalance() + amount;
		setBalance(newBalance);
		System.out.println("Amount Credited Successfully");
		System.out.println("Your new Balance is: " + getBalance());
	}

	
	public void debit(float amount) {
		float newBalance = getBalance() - amount;
		setBalance(newBalance);
		System.out.println("Amount Debited Successfully");
		System.out.println("Your new Balance is: " + getBalance());
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", dob=" + dob + ", contact=" + contact + ", address=" + address
				+ ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

	private String name;
	private String dob;
	private int contact;
	private String address;
	private long accountNumber;
	private float balance;


}
