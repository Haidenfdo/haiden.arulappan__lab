package com.fwsa;

import java.util.*;

public class HashMap_linkedList {
	
	private static final int MAX=3;
	
	
	public static void main(String[] args) {
		
		Map <String,Integer> array=new LinkedHashMap() {
		protected boolean removeEldestEntry(Map.Entry eldest) {
	        return size() > MAX;	        
	     }
		};
		array.put("haiden",1);
		array.put("aswath",2);
		array.put("rishi",3);
		
		System.out.println(array);
		
		array.keySet();
		System.out.println(array);
		
		array.put("annamalai",4);
		System.out.println(array);
}
}