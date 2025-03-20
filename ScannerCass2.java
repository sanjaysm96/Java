package org.scannerclass;

import java.util.Scanner;

public class ScannerCass2 {
	public static void main(String[] args) {
        // Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Getting student details from user
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Mark1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter Mark2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter Mark3: ");
        int mark3 = scanner.nextInt();

        System.out.print("Enter Mark4: ");
        int mark4 = scanner.nextInt();

        System.out.print("Enter Mark5: ");
        int mark5 = scanner.nextInt();

        // Calculating total and average
        int totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;
        double averageMarks = totalMarks / 5; // Using 5.0 to get accurate decimal value

        // Displaying student details and results
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        // Closing the scanner
        scanner.close();
    }
}
