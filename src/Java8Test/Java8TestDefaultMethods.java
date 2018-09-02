package Java8Test;

public class Java8TestDefaultMethods {
	
	//see tutorial as not everything is here

	public static void main(String[] args) {
		Vehicle car1 = new Car1();
		car1.print();
		
		Vehicle car2 = new Car2();
		car2.print();
		
		//this is the basic default method functionality
		Vehicle brum = new Brum();
		brum.print();
	}	
}

interface Vehicle{
	default void print() {
		System.out.println("Phnarrr!!!");
	};
	
	static void printstatic() {
		System.out.println("This is static!");
	}
}

interface FourWheeler{
	default void print() {
		System.out.println("I have four wheels!");
	}
}

class Brum implements Vehicle{
	
}

class Car1 implements Vehicle, FourWheeler {
	public void print() {
		System.out.println("this is car1!");
	}
	
}

class Car2 implements Vehicle, FourWheeler {
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.printstatic();
		System.out.println("Car and shiz!");
	}
}