package com.fwsa;

interface  BaseClass {
	public static void show1() {
	}
	
	public static void show2() {
		System.out.println("The base class for the program");
	}
}
class ChildClass implements BaseClass {
	
	public void show1() {
		System.out.println("The childclass for the program ");
	}
	public void show2() {
		System.out.println("The override of the sub class");
	}
}
public class Interface{
	public static void main(String[] args) {
		ChildClass obj= new ChildClass();
		obj.show1();
		obj.show2();
		
	}
}

