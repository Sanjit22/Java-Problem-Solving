package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake[] cakes=new Cake[5];
	        
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<cakes.length;i++)
        {
            int cakeId = sc.nextInt();sc.nextLine();
            String cakeName = sc.nextLine();
            int pound = sc.nextInt();
            double priceperpound = sc.nextDouble();
            boolean b=sc.nextBoolean();
            cakes[i] = new Cake(cakeId,cakeName,pound,priceperpound,b);
            
        }

        
        
        
        System.out.println(generateBill(cakes));
        
        Cake[] newArray=getEgglessCake(cakes);
        for(Cake ck:newArray) {
            if(ck!=null)
            {
            	System.out.println(ck.getCakeId()+" "+ck.getCakeName());
            }
        }
     }
    
    //implement business methods here
	public static double generateBill(Cake[] cakes) {
		double totalBill=0;
		double cakePrice;
		for(int i=0;i<cakes.length;i++) {
			if(cakes[i].isEggless()) {
				cakePrice=(cakes[i].getPricePerPound()*cakes[i].getPound())+50;
				totalBill= totalBill+cakePrice;
			}
			else {
				totalBill=totalBill+cakes[i].getPricePerPound()*cakes[i].getPound();
;			}
		}
		
		double totalAmount= totalBill+(totalBill*0.02);
		return totalAmount;
	}
	
	public static Cake[] getEgglessCake(Cake[] cakes) {
		int count =0;
		for(int i=0;i<cakes.length;i++) {
			if(cakes[i].isEggless()) {
				count++;
			}
		}
		
		Cake[] egglessCakes=new Cake[count];
		int counter=0;
		for(int j=0;j<cakes.length;j++) {
			if(cakes[j].isEggless()) {
				egglessCakes[counter++]=cakes[j];
			}
		}
		
		return egglessCakes;
	}

}

class Cake{
	private int cakeId;
	private String cakeName;
	private int pound;
	private double pricePerPound;
	private boolean eggless;
	public Cake(int cakeId, String cakeName, int pound, double pricePerPound, boolean eggless) {
		super();
		this.cakeId = cakeId;
		this.cakeName = cakeName;
		this.pound = pound;
		this.pricePerPound = pricePerPound;
		this.eggless = eggless;
	}
	public int getCakeId() {
		return cakeId;
	}
	public void setCakeId(int cakeId) {
		this.cakeId = cakeId;
	}
	public String getCakeName() {
		return cakeName;
	}
	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}
	public int getPound() {
		return pound;
	}
	public void setPound(int pound) {
		this.pound = pound;
	}
	public double getPricePerPound() {
		return pricePerPound;
	}
	public void setPricePerPound(double pricePerPound) {
		this.pricePerPound = pricePerPound;
	}
	public boolean isEggless() {
		return eggless;
	}
	public void setEggless(boolean eggless) {
		this.eggless = eggless;
	}
	
	
}