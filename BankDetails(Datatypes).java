package org.datatypes;

public class BankDetails {
	public void data() {
		//--byte
		byte empId = 12;
		System.out.println("EmpId:"+empId);
		//--short
		short empInitialSalary = 30000;
		System.out.println("EmployeeInitialSalary:"+empInitialSalary);
		//--integer
		int empCurrentSalary = 55000;
		System.err.println("EmployeeCurrentSalary:"+empCurrentSalary);
		//--long
		long empPhNum = 9123456780L;
		System.out.println("EmployeePhoneNo:"+empPhNum);
		//--float
		float empAttendPercent = 87.66666f;
		System.out.println("EmployeeAttendancePercentage:"+empAttendPercent);
		//--double
		double empExactAttendPercent = 87.66666;
		System.out.println("EmployeeExactAttendPercent:"+empExactAttendPercent);
		//--char
		char empInitial = 'S';
		System.out.println("EmpolyeeInitial:"+empInitial);
		//--String
		String empName = "Suriya";
		System.out.println("Name:"+empName);
		//--boolean
		boolean status = true;
		System.out.println("Status is :"+status);
	}
	public static void main(String[] args) {
		BankDetails d = new BankDetails();
		d.data();
		
				
		
	}
}
