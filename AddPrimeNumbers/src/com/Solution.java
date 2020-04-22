package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		if (flag == 1) {// Average test case
			int[] values = new int[] { 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21, 22, 23 };

			double result = PrimeDemo.addPrimeNumbers(values);
			System.out.println(result);

			values = new int[] { 22, 33, 44, 2, 1, 0 };
			result = PrimeDemo.addPrimeNumbers(values);
			System.out.println(result);
		} 
		else {// High Test case
			int[] values = new int[] { -1, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21, 22, 23 };

			double result = PrimeDemo.addPrimeNumbers(values);
			System.out.println(result);

			values = new int[] { -11, 22, 33, 44, 2, 1, 0 };
			result = PrimeDemo.addPrimeNumbers(values);
			System.out.println(result);

			boolean f = PrimeDemo.isPrime(22);
			System.out.println(f);
			f = PrimeDemo.isPrime(22);
			System.out.println(f);
			f = PrimeDemo.isPrime(2);
			System.out.println(f);
		}
	}
}


class PrimeDemo{
	public static double addPrimeNumbers(int[] prime) {
		double sum=0;
		int count=0;
		
		for(int i=0;i<prime.length;i++) {
			if(prime[i]>1) {
				int flag=1;
				for(int j=2;j<prime[i];j++) {
					if(prime[i]%j==0) {
						flag=0;
						break;
					}
				}
				if(flag==1) {
					count++;
				}
			}
		}
		
		int[] primeNumbers = new int[count];
		int counter=0;
		
		for(int i=0;i<prime.length;i++) {
			if(prime[i]>1) {
				int flag2=1;
				for(int j=2;j<prime[i];j++) {
					if(prime[i]%j==0) {
						flag2=0;
						break;
					}
				}
				if(flag2==1) {
					primeNumbers[counter++]=prime[i];
				}
			}
		}
		
		for(int i=0;i<primeNumbers.length;i++) {
			sum=sum+primeNumbers[i];
		}
		return sum;
	}
	
	public static boolean isPrime(int number) {
		int flag=1;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				flag=0;
				break;
			}
		}
		
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
		
	}
}