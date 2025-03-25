package org.task;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Value");
		int value = scan.nextInt();

		if (value % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
		scan.close();
	}

}
