package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int[] a = new int[3];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		int[] b = new int[3];
		for(int j=0;j<b.length;j++) {
			b[j] = sc.nextInt();
		}
		
		int[] answer = compareTriplets(a, b);
		for(int k=0;k<answer.length;k++) {
			System.out.print(answer[k]);
			if(k != answer.length-1) {
				System.out.print(" ");
			}
		}
	}

	public static int[] compareTriplets(int[] a, int[] b) {
		int countA=0;
		int countB=0;
		int[] result = new int[2];
		for(int i=0;i<3;i++) {
			if(a[i]>b[i]) {
				countA++;
				result[0]=countA;
			}
			else if(a[i]<b[i]) {
				countB++;
				result[1]=countB;
			}
		}
		return result;
	}
	
}

