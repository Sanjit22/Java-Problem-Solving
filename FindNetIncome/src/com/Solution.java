package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		// Average Test Case
		if (flag == 1) {
			System.out.println(TaxDemo.calculateNetIncome(20000, 5.5));
			System.out.println(TaxDemo.calculateNetIncome(120000, 10.5));
		} 
		else {
			double x1 = TaxDemo.calculateNetIncome(150000, -1);
			double x2 = TaxDemo.calculateNetIncome(150000, 0);
			double x3 = TaxDemo.calculateNetIncome(-150000, 50);
			double x4 = TaxDemo.calculateNetIncome(150000, 105);

			if (x1 == 0.0 || x1 == -1.0)
				System.out.println("OK");
			if (x2 == 0.0 || x2 == -1.0)
				System.out.println("OK");
			if (x3 == -75000.0)
				System.out.println("OK");
			if (x4 == 0.0 || x4 == -1.0)
				System.out.println("OK");
		}
	}

}


class TaxDemo{
	private double totalSalary;
	private double taxPercentage;
	
	public TaxDemo(double totalSalary, double taxPercentage) {
		super();
		this.totalSalary = totalSalary;
		this.taxPercentage = taxPercentage;
	}
	
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	public static double calculateNetIncome(double totalSalary,double taxPercentage) {
		double netIncome=0;
		if(totalSalary>0 && taxPercentage>1 && taxPercentage<100) {
			netIncome=totalSalary-(totalSalary*(taxPercentage/100.0));
			return netIncome;
		}
		else if(totalSalary<0 && taxPercentage>1 && taxPercentage<100) {
			return totalSalary*(taxPercentage/100.0);
		}
		else {
			return -1.0;
		}
	}
}
