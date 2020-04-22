package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfStudent=sc.nextInt();
		
		int[] students = new int[noOfStudent];
		for(int i=0;i<students.length;i++) {
			students[i]=sc.nextInt();
		}
		
		int[] answer = gradingStudents(students);
		for(int j=0;j<answer.length;j++) {
			System.out.println(answer[j]);
		}
	}
	
	public static int[] gradingStudents(int[] students) {
		int[] result = new int[students.length];
		for(int i=0;i<students.length;i++) {
			if(students[i]>35 && students[i]%5>=3) {
				result[i]=students[i]+5-(students[i]%5);
			}
			else {
				result[i]=students[i];
			}
		}
		return result;
	}

}
