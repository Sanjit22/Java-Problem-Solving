package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//String[] st = sc.nextLine().split(" ");
		int startingPoint = sc.nextInt();
		int endingPoint = sc.nextInt();
		
		//String[] at = sc.nextLine().split(" ");
		int applePosition = sc.nextInt();
		int orangePosition = sc.nextInt();
		
		//String[] mn = sc.nextLine().split(" ");
		int noOfApples = sc.nextInt();
		int noOfOrange = sc.nextInt();
		
		int[] apples = new int[noOfApples];
		for(int i=0;i<apples.length;i++) {
			apples[i]=sc.nextInt();
		}
		
		int[] oranges = new int[noOfOrange];
		for(int j=0;j<oranges.length;j++) {
			oranges[j]=sc.nextInt();
		}
		
		countApplesAndOranges(startingPoint, endingPoint, applePosition, orangePosition, apples, oranges);
	}
	
	static void countApplesAndOranges(int startingPoint, int endingPoint, int applePosition, int orangePosition, int[] apples, int[] oranges) {
		int countApple=0;
		int countOrange = 0;
		
		for(int i=0;i<apples.length;i++) {
			int newPosition1 = applePosition + apples[i];
			if(newPosition1>=startingPoint && newPosition1<=endingPoint) {
				countApple++;
			}
		}
		
		for(int j=0;j<oranges.length;j++) {
			int newPosition2 = orangePosition + oranges[j];
			if(newPosition2>=startingPoint && newPosition2<=endingPoint) {
				countOrange++;
			}
		}
		
		System.out.println(countApple+"\n"+countOrange);
	}

}
