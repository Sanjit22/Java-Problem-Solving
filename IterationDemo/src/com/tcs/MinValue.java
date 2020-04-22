package com.tcs;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int min = str.charAt(0);
		int loc=0;
		for(int i=0;i<str.length();i++) {
			int temp = str.charAt(i);
			if(min>temp) {
				min = temp;
				loc = i;
			}
		}
		
		System.out.println(str.charAt(loc));
	}

}
