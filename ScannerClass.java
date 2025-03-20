package org.scannerclass;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	        System.out.print("Enter Employee ID: ");
	        int empId = scan.nextInt();
	        scan.nextLine(); // Consume newline left-over

	        System.out.print("Enter Employee Name: ");
	        String empName = scan.nextLine();

	        System.out.print("Enter Employee Email: ");
	        String empEmail = scan.nextLine();

	        System.out.print("Enter Employee Phone Number: ");
	        String empPhoneno = scan.nextLine();

	        System.out.print("Enter Employee Salary: ");
	        double empSalary = scan.nextDouble();
	        scan.nextLine(); // Consume newline left-over

	        System.out.print("Enter Employee Gender: ");
	        String empGender = scan.nextLine();

	        System.out.print("Enter Employee City: ");
	        String empCity = scan.nextLine();

	        System.out.println("\nEmployee Details:");
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Employee Name: " + empName);
	        System.out.println("Employee Email: " + empEmail);
	        System.out.println("Employee Phone Number: " + empPhoneno);
	        System.out.println("Employee Salary: " + empSalary);
	        System.out.println("Employee Gender: " + empGender);
	        System.out.println("Employee City: " + empCity);

	        scan.close();
	    }
	}
