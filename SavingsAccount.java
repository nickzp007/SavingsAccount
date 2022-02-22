package com.bridgelabz.workshop2;

public class SavingsAccount {
	private static float annualInterestRate;
	private float savingsBalance;
	private float monthlyInterest;

	public SavingsAccount(float savingsBalance ) {
		this.savingsBalance = savingsBalance;
	}

	public static void modifyInterestRate(float interestRate) {
		annualInterestRate = interestRate/100;
	}

	public void calculateMonthlyInterest() {
		monthlyInterest = savingsBalance*annualInterestRate/12;
		System.out.println("Monthly interest rate is $"+ monthlyInterest);
	}

	public void calculateSavings() {
		savingsBalance += monthlyInterest;
	}

	public void displaySavings() {
		calculateSavings();
		System.out.println("Total balance : $" + savingsBalance);
	}
}




