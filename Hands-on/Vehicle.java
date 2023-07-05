package oops;

 class Vehicle {

	String brand;
	int year;
	public void displayinfo()
	{
		System.out.println("Brand and year of the vehicle are:");
	}
 }
	class Car extends Vehicle
	{
		String model;
		public void displayinfo()
		{
			System.out.println("Brand and year of the vehicle:");
		}
	}
	class Sportscar extends Car
	{
		int maxspeed;
		public void displayinfo()
		{
			System.out.println("Brand, year, model and maxspeed of the sports car is:");
		}
	}
	class Vehiclemain
	{
		public static void main(String[] args)
		{
			Sportscar e=new Sportscar();
			
			e.brand="Mercedes";
			e.model="AMG GT";	
			e.year= 2023;
			e.maxspeed=316;
			System.out.println("Brand name is:" +e.brand);
			System.out.println("Model name is:" +e.model);
			System.out.println("Year in which it was released is:" +e.year);
			System.out.println("The maximum speed achieved by the car is:" +e.maxspeed);
		}
	}

