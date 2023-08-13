package com.nestjavatraining.entity;

public class Customer {

	private String customerCode;
	private String customerName;
	private Account account;

	public Customer(String customerCode, String customerName, Account account) {

		this.customerCode = customerCode;
		this.customerName = customerName;
		this.account = account;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
