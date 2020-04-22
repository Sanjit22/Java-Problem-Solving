package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		if (flag == 1) {
			Point p = new Point();
			System.out.println("object created with default constructor");
			p = new Point(3, 2);
			System.out.println("object created with parameterized constructor");
		} 
		else {
			Point p = new Point();
			System.out.println("object created with default constructor");
			p = new Point(3, 2);
			System.out.println("object created with parameterized constructor");
			System.out.println(p.getXCoordinate());
			System.out.println(p.getYCoordinate());
			p.setXCoordinate(22);
			p.setYCoordinate(23);
			System.out.println(p.getXCoordinate());
			System.out.println(p.getYCoordinate());
			System.out.println("getters setters defined as expected");
		}
	}
}

class Point{
	private double xCoordinate;
	private double yCoordinate;
	public double getXCoordinate() {
		return xCoordinate;
	}
	public void setXCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getYCoordinate() {
		return yCoordinate;
	}
	public void setYCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public Point(double xCoordinate, double yCoordinate) {
		super();
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	public Point() {
		super();
	}
	
}
