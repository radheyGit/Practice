package com.demo.demo;

public class MyConstructor {

	int num;
	String name;
	String address;
	
	public MyConstructor(int num, String name, String address) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println("RollNo "+num+"\nName "+name+"\nAddress "+address+"\n");
	}
	
	
	
}
