package org.bike;

//Implementing the Bike interface
public class Ktm implements Bike {

	// Overriding cost() method
	@Override
	public void cost() {
		System.out.println("KTM Bike Cost: ₹2,50,000");
	}

	// Overriding speed() method
	@Override
	public void speed() {
		System.out.println("KTM Bike Top Speed: 180 km/h");
	}

	public static void main(String[] args) {
		Ktm ktmBike = new Ktm();
		ktmBike.cost();  // Calls overridden method
		ktmBike.speed(); // Calls overridden method
	}
}