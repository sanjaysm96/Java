package org.phone;

public class Phone {

	//--polymorphism overloadig same class diff methods diff args
	    // Method with one String parameter
	    public void phoneInfo(String brand) {
	        System.out.println("Phone Brand: " + brand);
	    }

	    // Method with one int parameter
	    public void phoneInfo(int modelNumber) {
	        System.out.println("Phone Model Number: " + modelNumber);
	    }

	    // Method with two parameters (String first, int second)
	    public void phoneInfo(String brand, int modelNumber) {
	        System.out.println("Phone Brand: " + brand + ", Model Number: " + modelNumber);
	    }

	    // Method with two parameters (int first, String second) - different order
	    public void phoneInfo(int modelNumber, String brand) {
	        System.out.println("Model Number: " + modelNumber + ", Phone Brand: " + brand);
	    }

	    public static void main(String[] args) {
	        Phone phone = new Phone();
	        
	        phone.phoneInfo("Samsung"); // Calls the method with String argument
	        phone.phoneInfo(1234); // Calls the method with int argument
	        phone.phoneInfo("Apple", 15); // Calls the method with (String, int) argument
	        phone.phoneInfo(2023, "OnePlus"); // Calls the method with (int, String) argument
	}
}
