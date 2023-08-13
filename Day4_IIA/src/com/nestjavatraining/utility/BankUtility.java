package com.nestjavatraining.utility;

import java.util.Scanner;
import java.util.logging.Formatter;
import com.nestjavatraining.service.SavingsAccountImpl;

public class BankUtility {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		SavingsAccountImpl savingsAccountImpl = new SavingsAccountImpl();
		while (true) {
			System.out.println(
					"*************Welcome to ASAS Bank************** \n\n1.Create Account \n\n2.Deposit Amount \n\n3.Withdraw Amount \n\n4.Display Accounts \n\n5.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				savingsAccountImpl.createAccount();
				break;
			case 2:
				savingsAccountImpl.depositAmount();
				break;
			case 3:
				savingsAccountImpl.withdrawAmount();
				break;
			case 4:
				savingsAccountImpl.displayAccounts();
				break;
			case 5:
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}