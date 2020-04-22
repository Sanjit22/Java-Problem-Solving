package com;

import java.util.Scanner;

public class PointDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		// Average Test case
		if (flag == 1) {
			Point p1 = new Point(3, 2);
			Point p2 = new Point(6, 6);

			double d = PointDemo.findDistance(p1, p2);
			System.out.println(d);
		} 
		else {// High Test case
			Point p1 = new Point(3, 2);
			Point p2 = new Point(6, 6);

			double d = PointDemo.findDistance(p1, p2);
			System.out.println(d);

			d = PointDemo.findDistance(null, null);

			if (d == 0)
				System.out.println("ok");

			d = PointDemo.findDistance(p1, null);

			if (d == 0)
				System.out.println("ok");

			d = PointDemo.findDistance(null, p2);

			if (d == 0)
				System.out.println("ok");

		}

	}
	
	public static double findDistance(Point p1, Point p2) {
		double distance=0.0;
		if(p1!=null && p2!=null) {
			double x1=p1.getxCoordinate();
			double x2=p2.getxCoordinate();
			double y1=p1.getyCoordinate();
			double y2=p2.getyCoordinate();
			double v1=(x1-x2)*(x1-x2);
			double v2=(y1-y2)*(y1-y2);
			
			distance= Math.sqrt(v1+v2);
			return distance;
		}
		else {
			return 0;
		}
	}

}

class Point{
	private double xCoordinate;
	private double yCoordinate;
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public Point(double xCoordinate, double yCoordinate) {
		super();
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
}