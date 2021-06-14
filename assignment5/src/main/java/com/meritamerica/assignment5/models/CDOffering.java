package com.meritamerica.assignment5.models;

import java.util.*;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class CDOffering {

	static int counter = 1;
	
	int cdOffereingId;
	@NotNull(message = "term is required")
	@Range(min = 1, message = "Term must be minimum 1 year")
	//@Max
	private int term;
	
	@NotNull(message = "interest rate is required")
	@Range(min = 0, max = 1, message = "Interest Rate must be between 0 and 1")
	private double interestRate;
	
	public CDOffering() {
		this.cdOffereingId = counter++;
	}
	
	
	
	CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}

	
	protected static List<CDOffering> cdOfferingList = new ArrayList<CDOffering>();
	
	public static void setCDOfferingList(List<CDOffering> cdOfList) {
		cdOfferingList = cdOfList;
	}
	
	public static List<CDOffering> getCDOfferingList() {
		return cdOfferingList;
	}
	
	
	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getCdOffereingId() {
		return cdOffereingId;
	}

	public void setCdOffereingId(int cdOffereingId) {
		this.cdOffereingId = cdOffereingId;
	}
	
	
}
