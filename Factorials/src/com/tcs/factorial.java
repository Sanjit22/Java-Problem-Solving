package com.tcs;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		for(int i=0;i<number.length;i++) {
			number[i]=sc.nextInt();
		}
		
		for(int n:number) {
			System.out.println(find_factorial(n));
		}
	}
	
	public static int find_factorial(int f) {
		int fact=1;
		
		for(int i=f;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}

}
