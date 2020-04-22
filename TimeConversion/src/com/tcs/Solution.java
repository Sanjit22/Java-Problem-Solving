package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		
		int hour =Integer.parseInt(time.substring(0, 2));
		String ampm =  time.substring(8, 10);
		String minSec = time.substring(2, 8);
		
		String mid;
		if(ampm.contentEquals("PM") && hour<12) {
			hour = hour+12;
			System.out.println(hour+minSec);
		}
		else if(hour==12 && ampm.contentEquals("AM")) {
			mid="00";
			hour=0;
			System.out.println(mid+minSec);
		}
		else if(hour<10){
			System.out.println("0"+hour+minSec);
		}
		else {
			System.out.println(hour+minSec);
		}
		
	}

}
