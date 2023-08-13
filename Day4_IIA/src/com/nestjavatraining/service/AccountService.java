package com.nestjavatraining.service;

import com.nestjavatraining.entity.Account;
import com.nestjavatraining.entity.Customer;

public interface AccountService {
	public void createAccount();
	
	public Customer createCustomer(Account account);

	public void depositAmount();

	public void withdrawAmount();
}