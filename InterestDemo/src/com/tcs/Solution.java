package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int id=sc.nextInt();
		double balance=sc.nextDouble();
		double interestRate=sc.nextDouble();
		
		int noOfYears=sc.nextInt();
		
		Account a=new Account(id, balance, interestRate);
		double total= calculateInterest(a, noOfYears);
		System.out.printf("%.3f",total);
	}
	
	 public static double calculateInterest(Account a, int noOfYears)
	 {
	      double totalAmount= a.getBalance()*(a.getInterestRate()+((a.getInterestRate()*noOfYears)/100))/100;
	      return totalAmount;
	 }

}
