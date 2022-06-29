package com.demo.demo;

import java.util.Scanner;

public class TestBase {

	
	public static void main(String[] args) {
		
		System.out.println("Please Enter Your Details");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your Name");
		String name = sc.next();
		System.out.println("Please Enter Your Address");
		String address = sc.next();
		System.out.println("Please Enter Your Roll No.");
		int roll = sc.nextInt();
		
		MyMethods metnod = new MyMethods(roll, name, address);
	}
	
}
