package com.fwsa;

import java.util.*;

import java.io.*;

public class threcgf extends Thread {
	
	public void run() {
		
		System.out.println("Thread started running");
	}
	public static void main(String[] args) {
		
//		threcgf obj=new threcgf();
		
		Thread dgf=new Thread(new threcgf(),"My Thread");
		threcgf hai=new threcgf();
		
		dgf .start();
		
		String str=dgf.getName();
		System.out.println(str);
		
		hai.setName("haiden is allowed");
		System.out.println(hai.getName());
	}
	

}
