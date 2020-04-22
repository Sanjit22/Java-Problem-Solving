package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		Point p3 = new Point(x3, y3);
		
		Point answer = pointWithHighestOriginDistance(p1, p2, p3);
		System.out.println(answer.getX()+"\n"+answer.getY());
	}
	
	public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3) {
		double distance1 = Math.sqrt((p1.getX()*p1.getX())+(p1.getY()*p1.getY()));
		double distance2 = Math.sqrt((p2.getX()*p2.getX())+(p2.getY()*p2.getY()));
		double distance3 = Math.sqrt((p3.getX()*p3.getX())+(p3.getY()*p3.getY()));
		
		if(distance1>distance2 && distance1>distance3) {
			return p1;
		}
		else if(distance2>distance3) {
			return p2;
		}
		else {
			return p3;
		}
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
