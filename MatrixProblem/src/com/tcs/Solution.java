package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		
		int[][] arr = new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(diagonalDifference(arr));
	}
	
	public static int diagonalDifference(int[][] arr) {
		int difference;
		int diagonal1=0;
		int diagonal2=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					diagonal1=diagonal1+arr[i][j];
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i+j==arr.length-1) {
					diagonal2=diagonal2+arr[i][j];
				}
			}
		}
		
		if(diagonal1>diagonal2) {
			difference=diagonal1-diagonal2;
		}
		else {
			difference=diagonal2-diagonal1;
		}
		return difference;
	}

}
