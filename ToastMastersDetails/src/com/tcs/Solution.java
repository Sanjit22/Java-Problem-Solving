package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToastMasters[] t = new ToastMasters[5];        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<t.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String location = sc.nextLine();
            String type = sc.nextLine();
            int NoOfEvents = sc.nextInt();
            int NoOfYears =  sc.nextInt();
            t[i] = new ToastMasters(id,location,type,NoOfEvents,NoOfYears);
        }
        sc.nextLine();
        String loc = sc.nextLine();
        System.out.println("Total Count of "+loc+" : "+specificLocationCount(t,loc));
        ToastMasters t1[] = updateType(t);    
        for(int i=0;i<t1.length;i++)
            System.out.println(t1[i].getId()+"  "+t1[i].getLocation()+"  "+t1[i].getType());
    }
    
    public static int specificLocationCount(ToastMasters[] t,String loc)
    {
        //implement the method
    	int count =0;
    	for(int i=0;i<t.length;i++) {
    		if(t[i].getLocation().equalsIgnoreCase(loc) && t[i].getNoOfEvents()>10) {
    			count++;
    		}
    	}
    	return count;
    }
    
    public static ToastMasters[] updateType(ToastMasters[] t)
    {
        //implement the method
    	int count=0;
    	for(int i=0;i<t.length;i++) {
    		if(t[i].getType().equalsIgnoreCase("Member") && t[i].getNoOfEvents()>8 && t[i].getNoOfYears()>3) {
    			//t[i].setType("Host");
    			count++;
    		}
    	}
    	
    	ToastMasters[] updateType= new ToastMasters[count];
    	int counter=0;
    	for(int j=0;j<t.length;j++) {
    		if(t[j].getType().equalsIgnoreCase("Member") && t[j].getNoOfEvents()>8 && t[j].getNoOfYears()>3){
    			t[j].setType("Host");
    			updateType[counter++]=t[j];
    		}
    	}
    	
    	return updateType;
    }

}

class ToastMasters{
	private int id;
	private String location;
	private String type;
	private int noOfEvents;
	private int noOfYears;
	public ToastMasters(int id, String location, String type, int noOfEvents, int noOfYears) {
		super();
		this.id = id;
		this.location = location;
		this.type = type;
		this.noOfEvents = noOfEvents;
		this.noOfYears = noOfYears;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfEvents() {
		return noOfEvents;
	}
	public void setNoOfEvents(int noOfEvents) {
		this.noOfEvents = noOfEvents;
	}
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}
	
	
}
