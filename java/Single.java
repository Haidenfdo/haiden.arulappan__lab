package com.fwsa;


public class Single {

	
	private static Single obj;
	
	private Single() {}
	
	public static Single getInstance() {
		if(obj==null) {
			obj=new Single();
			return obj;
		}
		return obj;
	}
}
