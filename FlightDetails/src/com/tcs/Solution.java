package com.tcs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight[] flts = new Flight[7];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 7; i++) {
			String FlightId = sc.nextLine();
			String Departure_From = sc.nextLine();
			String Arrival_To = sc.nextLine();
			double duration = sc.nextDouble();
			sc.nextLine();
			boolean Meal_available = sc.nextBoolean();
			sc.nextLine();

			flts[i] = new Flight(FlightId, Departure_From, Arrival_To, duration, Meal_available);
		}

		String dep_from = sc.nextLine();
		String arv_to = sc.nextLine();

		Flight[] FlightArray = SearchFlight(flts);

		System.out.println("Flight_ID Duration Meal_Available");
		for (Flight f : FlightArray) {
			System.out.println(f.FlightId + "       " + f.duration + "       " + f.Meal_available);
		}

		System.out.println("--------------------------------------------------------");

		System.out.println("Flight_ID Dep  Arv   Duration");

		Flight[] FltDetl = GetFlightDetails(flts, dep_from, arv_to);

		for (Flight f : FltDetl) {
			System.out.println(f.FlightId + "      " + f.getDeparture_From() + "  " + f.getArrival_To() + "    "
					+ f.getDuration());
		}
	}

	public static Flight[] SearchFlight(Flight[] F) {
		// implement method
		int count =0;
		for(int i=0;i<F.length;i++) {
			if(F[i].duration>120 && F[i].isMeal_available()) {
				count++;
			}
		}
		
		Flight[] searchFlight= new Flight[count];
		int counter=0;
		for(int j=0;j<F.length;j++) {
			if(F[j].duration>120 && F[j].isMeal_available()) {
				searchFlight[counter++]=F[j];
			}
		}
		return searchFlight;
	}

	public static Flight[] GetFlightDetails(Flight[] f, String dep, String arv) {
		// implement method
		int count=0;
		for(int i=0;i<f.length;i++) {
			if(f[i].getDeparture_From().equalsIgnoreCase(dep) && f[i].getArrival_To().equalsIgnoreCase(arv)) {
				count++;
			}
		}
		
		Flight[] getFlightDetails=new Flight[count];
		int counter=0;
		for(int j=0;j<f.length;j++) {
			if(f[j].getDeparture_From().equalsIgnoreCase(dep) && f[j].getArrival_To().equalsIgnoreCase(arv)) {
				getFlightDetails[counter++]=f[j];
			}
		}
		
		Flight temp;
		for(int k=0;k<getFlightDetails.length;k++) {
			for(int l=k+1;l<getFlightDetails.length;l++) {
				if(getFlightDetails[k].duration>getFlightDetails[l].duration) {
					temp=getFlightDetails[k];
					getFlightDetails[k]=getFlightDetails[l];
					getFlightDetails[l]=temp;
				}
			}
		}
		
		return getFlightDetails;
	}

}

class Flight{
	String FlightId;
	private String Departure_From;
	private String Arrival_To;
	double duration;
	boolean Meal_available;
	public Flight(String flightId, String departure_From, String arrival_To, double duration, boolean meal_available) {
		super();
		FlightId = flightId;
		Departure_From = departure_From;
		Arrival_To = arrival_To;
		this.duration = duration;
		Meal_available = meal_available;
	}
	public String getFlightId() {
		return FlightId;
	}
	public void setFlightId(String flightId) {
		FlightId = flightId;
	}
	public String getDeparture_From() {
		return Departure_From;
	}
	public void setDeparture_From(String departure_From) {
		Departure_From = departure_From;
	}
	public String getArrival_To() {
		return Arrival_To;
	}
	public void setArrival_To(String arrival_To) {
		Arrival_To = arrival_To;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public boolean isMeal_available() {
		return Meal_available;
	}
	public void setMeal_available(boolean meal_available) {
		Meal_available = meal_available;
	}
	
}
