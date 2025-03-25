package org.task;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		int sum = 0;

		// Adding odd numbers from 1 to 100
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}

		// Printing the sum
		System.out.println("Sum of odd numbers from 1 to 100: " + sum);
	}
}
