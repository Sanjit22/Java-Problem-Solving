package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfCandles=sc.nextInt();
		sc.hasNextLine();
		
		int[] height = new int[noOfCandles];
		for(int i=0;i<height.length;i++) {
			height[i]=sc.nextInt();
		}
		
		System.out.println(birthdayCakeCandles(height));
	}
	
	public static int birthdayCakeCandles(int[] height) {
		int max=height[0];
		for(int i=1;i<height.length;i++) {
			if(max<height[i]) {
				max = height[i];
			}
		}
		
		int count=0;
		for(int j=0;j<height.length;j++) {
			if(height[j]==max) {
				count++;
			}
		}
		return count;
	}

}
