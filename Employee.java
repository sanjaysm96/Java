package org.employee;

//--polymorphism overloadig same class diff methods diff args
public class Employee {
	
	public void empId(int id) {
		System.out.println("Employee Id in Int:" + id);
	}
	public void empId(String id) {
		System.out.println("Employee Id in String:" + id);
	}
	public void empId(int id,String name) {
		System.out.println("Employee Id and Name:" + id + " " + name);
	}
public static void main(String[] args) {
	Employee emp = new Employee();
	emp.empId(101);
	emp.empId("E101");
	emp.empId(101, "Sanjay");
}
}
