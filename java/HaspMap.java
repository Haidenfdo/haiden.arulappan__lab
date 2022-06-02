package com.fwsa;
import java.util.*;

public class HaspMap {
	public static void main(String[] args) {
		
		Map<String,Integer> array=new HashMap<>();
		
		array.put("a",100);
		array.put("b",200);
		array.put("c",300);
		array.put("d",400);
		array.put("e",500);
		
		for(Map.Entry<String,Integer> me:array.entrySet()) {
			
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
	}

}
