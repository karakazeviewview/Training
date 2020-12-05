import java.util.*;
public class Car{
	private double fuelRest;
	private double fuelRatio;
	private double fuelMax;

	public Car(double fuelRest,double fuel Ratio,double fuelMax){
		this.setFuelRest(fuelRest);
		this.setFuelRatio(fuelRatio);
		this.setFuelMax(fuelMax);
	}
	
	pbulic void displayFuel(){
		System.out.printf("現在の燃料は%.1fリットルです。%n",this.fuelRest);
	}

	public void addFuel(double fuel){
		if(this.fuelRest+fuel
	}
}

