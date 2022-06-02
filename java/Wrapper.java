package com.fwsa;

import java.lang.*;

public class Wrapper {
	
	public static void main(String[] args) {
		byte a=1;
//		Byte byteobj=Byte.valueOf(a);
		Byte byteobj=a;
		int b=20;
		Integer intobj=b;
		float c=18.9f;
		Float floatobj=c;
		double d=203.2;
		Double doubleobj=d;
		char e='s';
		Character charobj=e;
		
		//printing the values from objects
		
		System.out.println("Values of Wrapper objects()printing as objects");
		System.out.println("Byte object:"+byteobj);
		System.out.println("Integer object:"+intobj);
		System.out.println("Float object:"+floatobj);
		System.out.println("Double object:"+doubleobj);
		System.out.println("Character object:"+charobj);
		
		//printing the values from the datatypes
	
		Integer pras=new Integer(10);
		int i=pras.intValue();
		int j=pras;
		System.out.println(i+" "+j);
		
		Byte hai=new Byte((byte) 5);
		byte k=hai;
		System.out.println(k);
		
		Float dee=new Float(18.9f);
		float l=dee;
		System.out.println(l);
		
		Double ace=new Double(202.9);
		double m=ace;
		System.out.println(m);
		
		Character san=new Character('e');
		char n=san;
		System.out.println(n);
		
	}

}
