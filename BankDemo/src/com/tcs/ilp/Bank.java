package com.tcs.ilp;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1=new Account();
		Account account2=new Account(523641258,"Soumik Bose",49000.32,"Savings");
		Account account3=new Account(account1);
		/*
		 * account1.accountNumber=335693696;
		 * account1.accountHolderName="Sanjit Karmakar"; 
		 * account1.balance=35030.35;
		 * account1.type="Savings";
		 */
		
		account1.setAccountNumber(335693696);
		account1.setAccountHolderName("Sanjit Karmakar"); 
		account1.setBlance(35030.35);
		account1.setType("Savings");
		 
		System.out.println("Account No.\t\t"+":\t"+account1.getAccountNumber());
		System.out.println("A/C Holder Name \t"+":\t"+account1.getAccountHolderName());
		System.out.println("Balance:\t\t"+":\t"+account1.getBlance());
		System.out.println("A/C type\t\t"+":\t"+account1.getType());
		
		System.out.println("\n\n");
		
		double amount1=calculateSimpleInterest(account1.getBlance(),7.25);
		account1.setBlance(amount1);
		
		System.out.println("After Calculating the Interest @ 7.25%");
		
		System.out.println("Account No.\t\t"+":\t"+account1.getAccountNumber());
		System.out.println("A/C Holder Name \t"+":\t"+account1.getAccountHolderName());
		System.out.println("Balance:\t\t"+":\t"+account1.getBlance());
		System.out.println("A/C type\t\t"+":\t"+account1.getType());
		
		System.out.println("\n\n");
		
		System.out.println("Account No.\t\t"+":\t"+account2.getAccountNumber());
		System.out.println("A/C Holder Name \t"+":\t"+account2.getAccountHolderName());
		System.out.println("Balance:\t\t"+":\t"+account2.getBlance());
		System.out.println("A/C type\t\t"+":\t"+account2.getType());
		
		System.out.println("\n\n");
		
		System.out.println("Account No.\t\t"+":\t"+account3.getAccountNumber());
		System.out.println("A/C Holder Name \t"+":\t"+account3.getAccountHolderName());
		System.out.println("Balance:\t\t"+":\t"+account3.getBlance());
		System.out.println("A/C type\t\t"+":\t"+account3.getType());
		
		System.out.println("\n\n");
		
		double amount2=calculateCompoundInterest(account3.getBlance(), 6.50, 4);
		account3.setBlance(amount2);
		
		System.out.println("After Calculating the Interest @ 6.50%");
		
		System.out.println("Account No.\t\t"+":\t"+account3.getAccountNumber());
		System.out.println("A/C Holder Name \t"+":\t"+account3.getAccountHolderName());
		System.out.println("Balance:\t\t"+":\t"+account3.getBlance());
		System.out.println("A/C type\t\t"+":\t"+account3.getType());
		
	}
	
	public static double calculateSimpleInterest(double principle, double rateOfInterest) {
		double totalAmount=principle+((principle*rateOfInterest)/100);
		return totalAmount;
	}
	
	public static double calculateCompoundInterest(double principle,double rateOfInterest,int noOfTimes) {
		double totalAmount=principle*Math.pow((1+(rateOfInterest/noOfTimes)),noOfTimes);
		return totalAmount;
	}

}
