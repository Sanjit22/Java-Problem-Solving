package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = 5;
		
		long[] arr = new long[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		miniMaxSum(arr);
	}
	
	static void miniMaxSum(long[] arr) {
		long temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		long miniSum=0;
		for(int k=0;k<arr.length-1;k++) {
			miniSum=miniSum+arr[k];
		}
		
		long maxSum=0;
		for(int l=1;l<arr.length;l++) {
			maxSum=maxSum+arr[l];
		}
		
		System.out.println(miniSum+" "+maxSum);
	}

}
