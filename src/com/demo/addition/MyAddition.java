package com.demo.addition;

public class MyAddition {
	
	int num1,num2,sum;
	
	public MyAddition() {
		System.out.println("Default constructor called...");
	}
	
	public MyAddition(int num1, int num2, int sum) {
		super();
		System.out.println("Parametarised constructor called...");
		this.num1 = num1;
		this.num2 = num2;
		this.sum = sum;
	}

	public void addition1() {
		sum  = num1 + num2;
		System.out.println("Addition of two Number "+sum);
	}
	
	public void addition2(int num1, int num2) {

	}
	
	public int addition3(int num1, int num2) {
		return 0;
	}
	
	public int addition4() {
		return 0;
	}
	
	public void addition11() {

	}
	
	public static void addition22(int num1, int num2) {

	}
	
	public static int addition33(int num1, int num2) {
		return 0;
	}
	
	public static int addition44() {
		return 0;
	}
	
	
	

	
	
}
