package com.fwsa;

public class leap_year {

	public static void main(String[] args) {
		
		int year =1997;
		boolean leap=false;
		
		if(year % 4== 0) {
			
			if(year % 100 == 0) {
				
				if(year % 400 == 0) {
					 
					 leap=true;
					 	
				}
				else {
					leap=false;
				}
				
			}
			else leap=true;
		}
		else leap=false;
		
		if(leap) {
			System.out.println("The year is leap"+year);
		}
		else{
			System.out.println("The year is not leap"+year);
		}
	}
}
