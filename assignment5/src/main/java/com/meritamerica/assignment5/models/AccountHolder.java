package com.meritamerica.assignment5.models;

import java.util.*;

import javax.validation.constraints.NotBlank;

public class AccountHolder {

	static int counter = 1;
	
	protected int accountId;
	
	@NotBlank(message = "first name is required")
	protected String firstName;
	
	protected String middleName;
	
	@NotBlank(message = "last name is required")
	protected String lastName;
	
	@NotBlank(message = "ssn is required")
	protected String SSN;
	

	protected List<CheckingAccount> checkingAccountsList = new ArrayList<CheckingAccount>();
	protected List<SavingsAccount> savingsAccountsList = new ArrayList<SavingsAccount>();
	protected List<CDAccount> cdAccountsList = new ArrayList<CDAccount>();
	//protected List<AccountHolder> accounHoldersList = new ArrayList<AccountHolder>();
	
	protected int numberOfCheckingAccounts;
	
	public int getNumberOfCheckingAccounts() {
		return checkingAccountsList.size();
	}

	public double getCheckingBalance() {
		double checkingBalance = 0.0;
		
		if(checkingAccountsList != null) {
			for(int i = 0 ; i < checkingAccountsList.size() ; i++) {
				checkingBalance += checkingAccountsList.get(i).getBalance();
			}
		}
		return checkingBalance;
	}

	public int getNumberOfSavingsAccounts() {
		return savingsAccountsList.size();
	}

	public double getSavingsBalance() {
		double savingsBalance = 0.0;
		
		if(savingsAccountsList != null) {
			for(int i = 0 ; i < savingsAccountsList.size() ; i++) {
				savingsBalance += savingsAccountsList.get(i).getBalance();
			}
		}
		return savingsBalance;
	}

	public int getNumberOfCDAccounts() {
		return cdAccountsList.size();
	}

	public double getCdBalance() {
		double cdBalance = 0.0;
		
		if(cdAccountsList != null) {
			for(int i = 0 ; i < cdAccountsList.size() ; i++) {
				cdBalance += cdAccountsList.get(i).getBalance();
			}
		}
		return cdBalance;
	}

	public double getCombinedBalance() {
		double totalBalance = getCdBalance() + getCheckingBalance() + getSavingsBalance();
		
		return totalBalance;
	}

	protected double checkingBalance;
	protected int numberOfSavingsAccounts;
	protected double savingsBalance;
	protected int numberOfCDAccounts;
	protected double cdBalance;
	protected double combinedBalance;

	
	
	public AccountHolder() {
		this.accountId = counter++;
	}

	AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		//this.accountId = counter++;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.SSN = ssn;
	}
	
	/*
	 * public void addAccountHolder(AccountHolder ah) { accounHoldersList.add(ah); }
	 * 
	 * public List<AccountHolder> getAccountHolder() { return accounHoldersList; }
	 * 
	 */

	
	  public static int getCounter() {
		return counter;
	}

	public List<CheckingAccount> getCheckingAccountsList() {
		return checkingAccountsList;
	}

	public List<SavingsAccount> getSavingsAccountsList() {
		return savingsAccountsList;
	}

	public List<CDAccount> getCdAccountsList() {
		return cdAccountsList;
	}

	/*
	 * public List<AccountHolder> getAccounHoldersList() { return accounHoldersList;
	 * }
	 */
	public int getAccountId() { return accountId; }
	  
	  public void setAccountId(int accountId) { this.accountId = accountId; }
	  
	  public String getFirstName() { return firstName; }
	  
	  public void setFirstName(String firstName) { this.firstName = firstName; }
	  
	  public String getMiddleName() { return middleName; }
	  
	  public void setMiddleName(String middleName) { this.middleName = middleName; }
	  
	  public String getLastName() { return lastName; }
	  
	  public void setLastName(String lastName) { this.lastName = lastName; }
	  
	  public String getSSN() { return SSN; }
	  
	  public void setSSN(String sSN) { SSN = sSN; }
	 

}
