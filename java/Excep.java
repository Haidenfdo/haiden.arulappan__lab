package com.fwsa;
import java.util.*;
import java.lang.*;


public class Excep {
	
	public static void star() throws Exception {
		throw new Exception("All cleared");
	}
		public static void main(String[] args) {
			try {
				star();
				int[] array={1,2,3,4,5};
				System.out.println(array[6]);
			}
			catch(Exception y){
				System.out.println(y);
			}
			finally {
				System.out.println("try and catch was cleared");
			}
			
		}
	}
	

   