package com.meritamerica.assignment5.models;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestBody;

public class CDAccount extends BankAccount{



	static int counter;
	
	CDOffering cdOffering;
	 
	public CDAccount() {
		
	}
	

	CDAccount(CDOffering offering, double balance){
		this.cdOffering = CDOffering.getCDOfferingList().get(this.getCdOffering().getCdOffereingId());
		super.balance = balance;
		//super.interestRate = offering.getInterestRate();
		
	}
	
	
	CDAccount(long accountNumber,double balance,
			CDOffering offering,Date accountOpenedOn){
		
		super(accountNumber,balance,offering.getInterestRate(),accountOpenedOn);
		//this.term = offering.getTerm();
		
	}

	public CDOffering getCdOffering() {
		return cdOffering;
	}

	public void setCdOffering(CDOffering cdOffering) {
		this.cdOffering = cdOffering;
	}
	
	
}
