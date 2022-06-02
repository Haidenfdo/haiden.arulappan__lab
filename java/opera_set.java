package com.fwsa;

import java.util.*;

public class opera_set {
	
	public static void main(String[] args) {
		
		Set<String> a=new HashSet<>();
		
		a.addAll(Arrays.asList(new String[] {"a","b","c","d","e","f","g"}));
		
		Set<String> b=new HashSet<String>();
		
		b.addAll(Arrays.asList(new String[] {"a","g","v","f","r"}));
		
		Set<String> union=new HashSet<String>(a);
		union.addAll(b);
		System.out.print("Union of the two set");
		System.out.println(union);
		
		Set<String> Intersection=new HashSet<String>(a);
		Intersection.retainAll(b);
		System.out.print("Intersection of the two set");
		System.out.println(Intersection);
		
		Set<String> difference=new HashSet<String>(a);
		difference.removeAll(b);
		System.out.print("differnce of the two set");
		System.out.println(difference);
		
		con();
		arr();
		iter();
		link_se();
	}
	
	public static void con() {
		
		Set<String> obj=new HashSet<>();
		
		obj.add("haiden");
		obj.add("Aswath");
		obj.add("tacax");
		
		System.out.println("Obj1"+obj);
		
		Set<String> obj2=new HashSet<>();
		
		obj2.add("haiden");
		obj2.add("Aswath");
		obj2.add("tacax");
		
		System.out.println("obj2"+obj2);
		
		System.out.println("Does obj1 contains obj2: "+ obj.containsAll(obj2));
		
		
	}

	public static void arr() {
		
		Set<Integer> abs_obj=new HashSet<>();
		
		abs_obj.add(3);
		abs_obj.add(34);
		abs_obj.add(50);
		abs_obj.add(87);
		
		System.out.println("The Set is : "+ abs_obj);
		
		Integer[] array = abs_obj.toArray(new Integer[0]);
		System.out.println("The set is :");
		
		for(int j=0;j<array.length;j++) {
			System.out.println(array[j]);
		}
	}
	
	public static void iter() {
		
		Set<String> emp=new HashSet<String>();
		
		emp.add("haiden");
		emp.add("aswath");
		emp.add("vimal");
		emp.add("kaushik");
		
		System.out.println("Set"+emp);
		
		Iterator value=emp.iterator();
		
		System.out.println("The iterator values are : ");
		
		while(value.hasNext()) {
			System.out.println(value.next());
		}
	}
	
	public static void link_se() {
		
		LinkedHashSet<String> linkedset= new LinkedHashSet<String>();
			
		linkedset.add("haiden");
		linkedset.add("aswath");
		linkedset.add("santa");
		linkedset.add("prasanna");
		
		linkedset.add("haiden");
		linkedset.add("vimal");
		
		System.out.println("The size of the linked set"+ linkedset.size());
		
		System.out.println(linkedset);
		
		System.out.println("Removing the haiden : "+ linkedset.remove("haiden"));
		
		System.out.println("Removing the element not present in set : "+linkedset.remove("abisha"));
		
		System.out.println("searching the element vimal"+linkedset.contains("vimal"));
		
		System.out.println("updated set "+linkedset);
		
		
	}
}
