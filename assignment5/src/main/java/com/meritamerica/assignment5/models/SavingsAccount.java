package com.meritamerica.assignment5.models;

import java.util.Date;

public class SavingsAccount extends BankAccount{

	static int counter=0;
	protected static double savingsInterestRate = 0.01;
	public SavingsAccount() {
		super();
	}
	
	SavingsAccount(double openingBalance){
		this(openingBalance,savingsInterestRate);
	}
	
	SavingsAccount(double balance, double interestRate){
		super(balance,interestRate);
	}
	
	SavingsAccount(double balance, double interestRate, 
			Date accountOpenedOn) {
		super(balance,interestRate,accountOpenedOn);
	}
	SavingsAccount(long accountNumber, double balance, 
			double interestRate, Date accountOpenedOn) {
		super(accountNumber,balance,interestRate,accountOpenedOn);
	}
}
