package com.fwsa;

import java.util.ArrayList;
import java.util.List;


public class Bank {

//	private String bankName = Constant.BANKNAME;
	private List<Account> accountList = new ArrayList<Account>();

	
	Bank() {
//		accountList = new Object[] { };
	}

	public static void main(String[] args) {
		System.out.println("Application Has been Started");
		Bank bank = new Bank();
		bank.createAccount("Haiden", "No 11,....", "12-02-2002", 12345);
		bank.createAccount("Suguram", "No 12,.....", "02-12-2001", 12345);
		bank.createAccount("Aswath", "No 13,....","22-02-2003", 123456);
	}

	public void createAccount(String name, String address, String dob, int contact) {
		Account acc = new Account(name, address, dob, contact);
		int len = accountList.size();
		System.out.println(len);
		accountList.add(len, acc);
		
		for (Account account : accountList) {
			System.out.println(account.toString());
		}
		
	}

}
