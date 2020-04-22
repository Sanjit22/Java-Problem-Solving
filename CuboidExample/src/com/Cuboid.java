package com;

public class Cuboid {
	private static int idGenerator=1;
	private int cuboidId;
	private int length;
	private int width;
	private int height;
	
	public Cuboid(int length, int width, int height) {
		this.cuboidId = idGenerator++;
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public static int getIdGenerator() {
		return idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		Cuboid.idGenerator = idGenerator;
	}

	public int getCuboidId() {
		return cuboidId;
	}

	public void setCuboidId(int cuboidId) {
		this.cuboidId = cuboidId;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getSurfaceArea() {
		double totalSurfaceArea;
		totalSurfaceArea=2*((length*width)+(width*height)+(height*length));
		return totalSurfaceArea;
	}
	
	public double getVolume() {
		double totalVolume;
		totalVolume=length*width*height;
		return totalVolume;
	}

	public double getVolume(double holloRadius) {
		double volumeCuboid;
		double volumeSphere;
		double finalVolumeCuboid;
		volumeCuboid=length*height*width;
		volumeSphere=4*(Math.PI*Math.pow(holloRadius, 3))/3;
		finalVolumeCuboid=volumeCuboid-volumeSphere;
		return finalVolumeCuboid;
	}
}
