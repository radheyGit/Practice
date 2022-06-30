package com.demo.SecondaryRefference;

public class Employee {

	String name;
	String employeeId;
	int age;
	double salary;
	String designation;
	//Secondary Reference
	Address address;
	Education education;
	
	public Employee() {
		System.out.println("Default Counstructor of Employee Class");
	}

	public Employee(String name, String employeeId, int age, double salary, String designation, Address address,
			Education education) {
		super();
		System.out.println("Parametarised Counstructor of Employee Class");
		this.name = name;
		this.employeeId = employeeId;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
		this.address = address;
		this.education = education;
	}

	
	
	
	
	
}
