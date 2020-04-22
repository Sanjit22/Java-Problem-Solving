package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		double distance=findDistance(p1,p2);
		System.out.printf("%.3f",distance);
	}
	
	public static double findDistance(Point p1, Point p2) {
		double distance=Math.sqrt(((p1.getX()-p2.getX())*(p1.getX()-p2.getX()))+((p1.getY()-p2.getY())*(p1.getY()-p2.getY())));
		return distance;
	}
	 
}

class Point{
	private double x;
	private double y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}
