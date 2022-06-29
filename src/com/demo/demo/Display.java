package com.demo.demo;

public class Display extends TestBase{

	public Display() {
		System.out.println("Hello");
	}
	
	public Display(int num) {
		this(true);
		System.out.println(num);
	}
	
	public Display(String name) {
		this();
		System.out.println(name);
	}
	
	public Display(boolean isTrue) {
		this("Prajakta");
		System.out.println(isTrue);
	}
	{
		
	}
	

}
