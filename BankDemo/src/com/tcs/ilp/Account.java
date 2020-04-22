package com.tcs.ilp;

public class Account {
	
	private int accountNumber;
	private String accountHolderName;
	private	double blance;
	private String type;
	
	Account(){
		this.accountNumber=856395236;
		this.accountHolderName="Ritam Pradhan";
		this.blance=125300.52;
		this.type="Current";
	}
	
	Account(int accountNumber,String accountHolderName,double balance,String type){ 
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName; 
		this.blance=balance;
		this.type=type; 
	}
	  
	Account(Account account){ 
		this.accountNumber=account.accountNumber;
		this.accountHolderName=account.accountHolderName; 
		this.blance=account.blance;
		this.type=account.type; 
	}
	 

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBlance() {
		return blance;
	}

	public void setBlance(double blance) {
		this.blance = blance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
