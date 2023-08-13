package com.nestjavatraining.service;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Formatter;
import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.entity.SavingsMaxAccount;
import com.nestjavatraining.entity.WomenSavingsAccount;

public class SavingsAccountImpl implements AccountService {
	Scanner sc = new Scanner(System.in);
	ArrayList<SavingsAccount> savingsAccountArray = new ArrayList<SavingsAccount>();

	@Override
	public void createAccount() {
		System.out.println("1. Women Savings Account 2.Savings Max account ");
		int choice = sc.nextInt();
		SavingsAccount savingsAccount = null;
		System.out.println("Enter Account code: ");
		String accountCode = sc.next();
		System.out.println("Enter Account Type : ");
		String accountName = sc.next();
		System.out.println("Enter Account Opening Date : ");
		String openingDate = sc.next();
		System.out.println("Enter Account Expiry Date : ");
		String expiryDate = sc.next();
		if (choice == 1) {
			System.out.println("Enter Account Free Limit ");
			int freeLimit = sc.nextInt();
			savingsAccount = new WomenSavingsAccount(accountCode, accountName, openingDate, expiryDate, 0, freeLimit);
		} else if (choice == 2) {
			savingsAccount = new SavingsMaxAccount(accountCode, accountName, openingDate, expiryDate, 0);
		}
		System.out.println("+++Account Created Successfully+++\n");
		savingsAccountArray.add(savingsAccount);
	}

	@Override
	public void depositAmount() {
		int flag = 0;
		System.out.println("Enter Account Code");
		String accountCode = sc.next();
		System.out.println("Enter Amount to deposit");
		double amount = sc.nextDouble();
		for (SavingsAccount i : savingsAccountArray) {
			if (i.getAccountCode().equals(accountCode)) {
				flag = 1;
				i.setAccountBalance(i.getAccountBalance() + amount);
				System.out.println("+++Successfully Deposited+++\n");
			}
		}
		if (flag != 1) {
			System.out.println("+++Failed to Deposit+++\n");
		}
	}

	@Override
	public void withdrawAmount() {
		int flag = 0;
		System.out.println("Enter Account Code");
		String accountCode = sc.next();
		System.out.println("Enter Amount to withdraw");
		double amount = sc.nextDouble();
		for (SavingsAccount i : savingsAccountArray) {
			if (i.getAccountCode().equals(accountCode)) {
				flag = 1;
				i.setAccountBalance(i.getAccountBalance() - amount);
				System.out.println("+++Successfully Withdrawed+++\n");
			}
		}
		if (flag != 1) {
			System.out.println("+++Failed to Withdraw+++\n");
		}
	}

	public void displayAccounts() {
		System.out.println("SINo" + "\tAccountCode" + "\tAccountType" + "\tCreateDate" + " \tExpiryDate" + " \tBalance"
				+ "\tFreeLimit \n********************************************************************");
		for (int i = 0; i < savingsAccountArray.size(); i++) {
			System.out.format(i + 1 + "\t" + savingsAccountArray.get(i).getAccountCode() + "\t"
					+ savingsAccountArray.get(i).getAccountName() + "\t" + savingsAccountArray.get(i).getOpeningDate()
					+ "\t" + savingsAccountArray.get(i).getExpiryDate() + "\t"
					+ savingsAccountArray.get(i).getAccountBalance() + "\t" + savingsAccountArray.get(i).toString()
					+ "\n\n");
		}
	}}