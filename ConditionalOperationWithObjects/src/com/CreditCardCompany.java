package com;

import java.util.Scanner;

public class CreditCardCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		if (flag == 1) {// Average Test case
			Customer c1 = new Customer(123, 10124, 200);
			Customer c2 = new Customer(333, 10125, 200.35);

			CreditCardCompany ccCompany = new CreditCardCompany();

			double payback = ccCompany.getPaybackAmount(c1);
			System.out.println("Customer Id:" + c1.getCustId() + "\tAccount Id:" + c1.getAccountId()
					+ "\tCredit Card Charges:" + c1.getCreditCardCharges() + "\tPayback amount:" + payback);

			payback = ccCompany.getPaybackAmount(c2);
			System.out.println("\nCustomer Id:" + c2.getCustId() + "\tAccount Id:" + c2.getAccountId()
					+ "\tCredit Card Charges:" + c2.getCreditCardCharges() + "\tPayback amount:" + payback);
		} 
		else {// High Test Case

			Customer c1 = new Customer(123, 10124, 200);
			Customer c2 = new Customer(333, 10125, 200.35);

			CreditCardCompany ccCompany = new CreditCardCompany();

			double payback = ccCompany.getPaybackAmount(c1);
			System.out.println("Customer Id:" + c1.getCustId() + "\tAccount Id:" + c1.getAccountId()
					+ "\tCredit Card Charges:" + c1.getCreditCardCharges() + "\tPayback amount:" + payback);

			payback = ccCompany.getPaybackAmount(c2);
			System.out.println("\nCustomer Id:" + c2.getCustId() + "\tAccount Id:" + c2.getAccountId()
					+ "\tCredit Card Charges:" + c2.getCreditCardCharges() + "\tPayback amount:" + payback);
		}
	}
	
	public double getPaybackAmount(Customer ccCompany) {
		double payBackAmount;
		if(ccCompany.getCreditCardCharges()<=500) {
			payBackAmount= 0.25*(1/100.0)*ccCompany.getCreditCardCharges();
			return payBackAmount;
		}
		else if(ccCompany.getCreditCardCharges()>500 && ccCompany.getCreditCardCharges()<=1500) {
			payBackAmount=0.25*(1/100.0)*500;
			payBackAmount=payBackAmount+ 0.50*(1/100.0)*(ccCompany.getCreditCardCharges()-500);
			return payBackAmount;
		}
		else if(ccCompany.getCreditCardCharges()>1500 && ccCompany.getCreditCardCharges()<=2500) {
			payBackAmount=(0.25*(1/100.0)*500)+(0.50*(1/100.0)*1000);
			payBackAmount=payBackAmount+ 0.75*(1/100.0)*(ccCompany.getCreditCardCharges()-1500);
			return payBackAmount;
		}
		else {
			payBackAmount=(0.25*(1/100.0)*500)+(0.50*(1/100.0)*1000)+(0.75*(1/100.0)*1000);
			payBackAmount=payBackAmount+ 1.0*(1/100.0)*(ccCompany.getCreditCardCharges()-1500);
			return payBackAmount;
		}
	}

}

class Customer{
	private int custId;
	private int accountId;
	private double creditCardCharges;
	public Customer(int custId, int accountId, double creditCardCharges) {
		super();
		this.custId = custId;
		this.accountId = accountId;
		this.creditCardCharges = creditCardCharges;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getCreditCardCharges() {
		return creditCardCharges;
	}
	public void setCreditCardCharges(double creditCardCharges) {
		this.creditCardCharges = creditCardCharges;
	}
	
}
