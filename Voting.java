package org.task;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//asking user for age input
		System.out.println("Enter your Age");
		int age = scan.nextInt();

		if (age <= 18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not Eligible to vote");
		}
		scan.close();
	}
}
