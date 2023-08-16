package Session_9;

public class _2_car {
	
	String name;
	int price;
	String colour;
	
	static int wheels = 4;
	
	public static void main(String[] args)
	{
		System.out.println("Sports Car");
		
		_2_car sportsCar = new _2_car();
		sportsCar.name = "BMW";
		sportsCar.price = 40000;
		sportsCar.colour = "Sterling black";
		sportsCar.wheels = 5;
		
		System.out.println("Sports Car details:");
		System.out.println(sportsCar.name + " " + sportsCar.price + " " + sportsCar.colour + " " + wheels);
		
		_2_car passengerCar = new _2_car();
		passengerCar.name = "Swift";
		passengerCar.price = 6000;
		passengerCar.colour = "White";
		System.out.println("Passenger Car details:");
		System.out.println(passengerCar.name + " " + passengerCar.price + " " + passengerCar .colour + " " + wheels);
		
	}

}
