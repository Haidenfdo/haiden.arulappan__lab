package com.fwsa;

import java.util.*;

public class List {
	
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<>();
		 
		array.add("1");
		array.add("Haiden");
		array.add("345");
		array.add("aswath");
		
		System.out.println(array);
		System.out.println(array.contains("Haiden"));
		
		array.add(2,"vimal");
		System.out.println(array);
		
		ArrayList<String> array1=new ArrayList<>();
		array1.addAll(array);
		System.out.println(array1);
		
		ArrayList<String> array2=new ArrayList<>();
		array2.add("500");
		array2.add("rishi");
		array2.add("sanboi");
		array2.add("900");
		
		System.out.println(array2);
		array2.addAll(2,array1);
		System.out.println(array2);
		
		
		java.util.List<String> array3= array2.subList(0,4);
		System.out.println(array3);
		
		
		
		
	}

}
