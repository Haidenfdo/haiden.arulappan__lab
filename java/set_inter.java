package com.fwsa;

import java.util.*;

import java.lang.*;

public class set_inter {
	
	public static void main(String[] args) {
		
		Set<String> obj=new HashSet<>();
		
		obj.add("haiden");
		obj.add("vimal");
		obj.add("musaraf");
		
		System.out.println(obj);
		
		obj.remove("vimal");
		
		System.out.println(obj);
		
	}

}
