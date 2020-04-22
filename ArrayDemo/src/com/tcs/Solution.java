package com.tcs;

import java.util.Scanner;

public class Solution {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfInput = sc.nextInt();
		
		Student[] students = new Student[noOfInput];
		for(int i=0;i<students.length;i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double marks = sc.nextDouble();
			
			students[i]=new Student(id,name,marks);
		}

		Student[] result = studentsWithMarksMoreThanAvg(students);
		
		for(Student s:result) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
	}
	
	public static double findAvg(Student[] students) {
		double sum = 0;
		
		for(Student s: students) {
			sum = sum + s.getMarks();
		}
		return sum/students.length;
	}
	
	public static Student[] studentsWithMarksMoreThanAvg(Student[] students) {
		double avg = findAvg(students);
		int count = 0;
		
		for(Student s:students) {
			if(s.getMarks()>avg) {
				count++;
			}
		}
		
		int j=0;
		Student[] result = new Student[count];
		
		for(Student s:students) {
			if(s.getMarks()>avg) {
				result[j++]=s;
			}
		}
		
		return result;
	}

}
