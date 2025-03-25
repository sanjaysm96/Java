package org.company;

public class CompanyInfo {
	    
	//--polymorphism overloadig same class diff methods diff args
	    // Method with no parameters
	    public void companyName() {
	        System.out.println("Company Name: Default Company");
	    }

	    // Method with one parameter
	    public void companyName(String name) {
	        System.out.println("Company Name: " + name);
	    }

	    // Method with two parameters
	    public void companyName(String name, int year) {
	        System.out.println("Company Name: " + name + ", Established Year: " + year);
	    }

	    public static void main(String[] args) {
	        CompanyInfo company = new CompanyInfo();
	        
	        company.companyName(); // Calls the method with no arguments
	        company.companyName("Tech Solutions"); // Calls the method with one argument
	        company.companyName("Tech Solutions", 2010); // Calls the method with two arguments
	    }
}
