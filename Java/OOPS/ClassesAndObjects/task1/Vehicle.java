package ClassesAndObjects;

public class Vehicle {
	
	String model;
	String type;
	int noOfSeats;
	int modelYear;
	String cmpName;
	boolean isSUV;
	int vehicleNumber;
	
	void running() {
		System.out.println(this.model+" is running");
	}
	
	void turnLeft() {
		System.out.println(this.model+" is turned left");
	}
	
	void turnRight() {
		System.out.println(this.model+" is turned right");
	}
	
	void stop() {
		System.out.println(this.model+" is stopped");
	}
	
	void show() {
		System.out.println("Model Name: "+this.model);
		System.out.println("Model Year: "+this.modelYear);
		System.out.println("Company Name: "+this.cmpName);
		System.out.println("No of Seats: "+this.noOfSeats);
		System.out.println("Vehicle Number: "+this.vehicleNumber);
		System.out.println("Vehicle Type: "+this.type);
	}
	
	public static void main(String[] args) {
		
		Vehicle vh1 = new Vehicle();
		
		vh1.model = "Scorpio N";
		vh1.cmpName="Mahindra";
		vh1.noOfSeats=8;
		vh1.modelYear=2018;
		vh1.isSUV=true;
		vh1.type = "Travel";
		vh1.vehicleNumber = 4545;
		
		vh1.running();
		vh1.turnLeft();
		vh1.turnRight();
		vh1.stop();
		vh1.show();
		

	}

}
