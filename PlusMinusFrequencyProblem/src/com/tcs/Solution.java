package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		plusMinus(arr);
		
	}
	
	static void plusMinus(int[] arr) {
		double frequency;
		
		int countPosetive=0;
		int countNegative=0;
		int countZero=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				countPosetive++;
			}
			else if(arr[i]<0) {
				countNegative++;
			}
			else {
				countZero++;
			}
		}
		
		System.out.printf("%.6f",(double)countPosetive/arr.length);
		System.out.printf("\n");
		System.out.printf("%.6f",(double)countNegative/arr.length);
		System.out.printf("\n");
		System.out.printf("%.6f",(double)countZero/arr.length);
	}

}
