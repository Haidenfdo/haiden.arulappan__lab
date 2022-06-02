package com.fwsa;

import java.util.*;

public class TreekMao {
	
	static void TreekMao(){
		
		Map<Integer,String> array=new TreeMap<>();
		
		array.put(1,"aswath");
		array.put(2,"Haiden");
		array.put(3,"Kaushik");
		array.put(4,"Vimal");
		array.put(5,"deepak");
		array.put(6,"prasanna");
		
		System.out.println("Treemap"+array);
		}
	
	public static void main(String[] args) {
		
		System.out.println("TreeMap using Tree Constructor:");
		
		TreekMao();
	}

}
