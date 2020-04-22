package com;

public class TestCuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid c1=new Cuboid(10, 8, 6);
		Cuboid c2=new Cuboid(9, 7, 5);
		Cuboid c3=new Cuboid(10, 15, 5);
		
		System.out.println("Cuboid 1 with Id \t\t:\t" +c1.getCuboidId());
		System.out.println("Surface Area of Cuboid "+c1.getCuboidId()+" \t:\t"+c1.getSurfaceArea());
		System.out.println("Volume of Cuboid "+c1.getCuboidId()+" \t\t:\t"+c1.getVolume());
		
		System.out.println("\n");
		
		System.out.println("Cuboid 1 with Id \t\t:\t" +c2.getCuboidId());
		System.out.println("Surface Area of Cuboid "+c2.getCuboidId()+" \t:\t"+c2.getSurfaceArea());
		System.out.println("Volume of Cuboid "+c2.getCuboidId()+" \t\t:\t"+c2.getVolume());
		
		System.out.println("\n");
		
		System.out.println("Cuboid 1 with Id \t\t:\t" +c3.getCuboidId());
		System.out.println("Surface Area of Cuboid "+c3.getCuboidId()+" \t:\t"+c3.getSurfaceArea());
		System.out.println("Volume of Cuboid "+c3.getCuboidId()+" \t\t:\t"+c3.getVolume());
		
		System.out.println("\n");
		
		System.out.println("Volume after reducing the volume of Hollo Sphere \t:\t"+Math.round(c2.getVolume(13.5)));
		
		System.out.println("\n");
		
		System.out.println("Id of maximum volume of Cuboid\t:\t"+findCuboidWithMaxVolume(c1, c2, c3));

	}
	
	public static int findCuboidWithMaxVolume(Cuboid c1,Cuboid c2,Cuboid c3){
		double volumeCuboid1=c1.getVolume();
		double volumeCuboid2=c2.getVolume();
		double volumeCuboid3=c3.getVolume();
		
		if(volumeCuboid1>volumeCuboid2 && volumeCuboid1>volumeCuboid3)
			return c1.getCuboidId();
		else if(volumeCuboid2>volumeCuboid1 && volumeCuboid2>volumeCuboid3)
			return c2.getCuboidId();
		else
			return c3.getCuboidId(); 
	}

}
