package com.demo.demo;

public class MyMethods {
	int num;
	String name;
	String address;
	
	public MyMethods(int num, String name, String address) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println("RollNo "+num+"\nName "+name+"\nAddress "+address+"\n");
	}
	
	public void displayInfo(int num, String name, String address) {
		System.out.println("RollNo "+num+"\nName "+name+"\nAddress "+address+"\n");
	}
	
	public String  displayInf(int num, String name, String address) {
		System.out.println("RollNo "+num+"\nName "+name+"\nAddress "+address+"\n");
		return "done !";
	}
	
	public String displayIn() {
		return "RollNo "+num+"\nName "+name+"\nAddress "+address+"\n";
	}
	
}
