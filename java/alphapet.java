package com.fwsa;

public class alphapet {
	
	public static void PrintAlphapets() {
		System.out.println("list of laphapets in lower case: ");
		for(char ch = 'a'; ch <= 'z';ch++) {
			System.out.printf("%s",ch);
		}
	}
	
	public static void printAlphapetsInUppercase() {
		System.out.println("list of alphapets in upper case:");
		for(char ch='A';ch<='Z';ch++) {
			System.out.printf("%s", ch);
		}
	}
	public static void main(String[] args) {
		
		PrintAlphapets();
		
		printAlphapetsInUppercase();
	}

}
