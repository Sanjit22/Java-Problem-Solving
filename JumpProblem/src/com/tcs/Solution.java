package com.tcs;

import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startingLocationX1 = sc.nextInt();
		int jumpsv1= sc.nextInt();
		int startingLocationX2 = sc.nextInt();
		int jumpsv2= sc.nextInt();
		System.out.println(kangaroo(startingLocationX1, jumpsv1, startingLocationX2, jumpsv2));
		
	}
	
	static String kangaroo(int startingLocationX1, int jumpsv1, int startingLocationX2, int jumpsv2) {
		int steps1 = 0;
		int steps2 = 0;
		int dis1=startingLocationX1+jumpsv1;;
		int dis2=startingLocationX2+jumpsv2;
		String result = "NO";
		if((startingLocationX1>startingLocationX2 && jumpsv1<jumpsv2)||(startingLocationX1<startingLocationX2 && jumpsv1>jumpsv2)) {
			if(((startingLocationX1-startingLocationX2)%(jumpsv2-jumpsv1))==0) {
				result="YES";
				return result;
			}
		}
		else{
			return result;
		}
		return result;
	}

}
