package com.bridgelabz.workshop2;


public class SavingsAccountTest {
	public static void main(String[] args) {
	SavingsAccount saver1=new SavingsAccount(2000);
	SavingsAccount saver2=new SavingsAccount(4000);
	SavingsAccount.modifyInterestRate(5);
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	saver1.displaySavings();
	saver2.displaySavings();
	
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	saver1.displaySavings();
	saver2.displaySavings();
	}
}

