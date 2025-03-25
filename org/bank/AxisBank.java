package org.bank;

public class AxisBank extends BankInfo {

	// Child class overriding the deposit() method

	// Overriding deposit() method
	@Override
	void deposit() {
		System.out.println("Axis Bank: Special Deposit Interest Rate: 7%");
	}

	public static void main(String[] args) {
		AxisBank axis = new AxisBank();

		// Calling parent class methods
		axis.saving();
		axis.fixed();

		// Calls the overridden deposit() method in AxisBank
		axis.deposit();  
	}
}
