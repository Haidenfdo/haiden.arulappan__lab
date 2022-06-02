package com.fwsa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class que_diff {

	public static void main(String[] args) {
		
		Queue <Integer> array = new LinkedList<>();
		
		for(int i=0;i<5;i++) 
			array.add(i);

		 System.out.println(array); 
		
		 int removedele = array.remove();
	        System.out.println("removed element-"
	                           + removedele);
	        
	        System.out.println(array);
	        
	        int head = array.peek();
	        System.out.println("head of queue-"
	                           + head);
	        
	        int size = array.size();
	        System.out.println("Size of queue-"
	                           + size);
	        
	        pqueue();
		
	}
	public static void pqueue() {
		
		 Queue<Integer> pbq
         = new PriorityBlockingQueue<Integer>();
		 
		 pbq.add(10);
	        pbq.add(20);
	        pbq.add(15);
	        
	        System.out.println(pbq.peek());
	        
	        System.out.println(pbq.poll());
	        
	        System.out.println(pbq.peek());
	}
	
}
