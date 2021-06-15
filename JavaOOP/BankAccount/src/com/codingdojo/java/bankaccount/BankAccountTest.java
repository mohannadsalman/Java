
package com.codingdojo.java.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		
	BankAccount user1 = new BankAccount();
	BankAccount user2 = new BankAccount();
	BankAccount user3 = new BankAccount();
	user1.accountDeposit("Savings", 100.00);
	user2.accountDeposit("checking", 200.00);
	user3.accountDeposit("savings", 20500.50);
	user1.accountWithdrawal("Checking", 30.00);
	user2.accountWithdrawal("checking", 600.00);
	user3.accountWithdrawal("savings", 14000.00);
	user2.myBalance();
	user1.myBalance();
	user3.myBalance();
	}
}