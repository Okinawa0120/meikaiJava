package meikaiJava.Chap12.Ex1201;

import meikaiJava.Chap10.Ex1004.Day;

public class TotalCar extends Car{
	private double totalDistance;
	
	public TotalCar(String name, int width, int height, int length, double fuel,
			  Day purchaseDay,double totalDistance) {
		super(name, width, height, length, fuel, purchaseDay);
		this.totalDistance = totalDistance; 
	}
	
	double getTotalDistance(){
		return totalDistance;
	}
}
