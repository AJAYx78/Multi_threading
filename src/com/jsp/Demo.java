package com.jsp;

public class Demo {
	
	
	public static void main(String[] args) {
		System.out.println("My name is Ajay ");
		
		             Thread thread  =     Thread.currentThread();
		            String tname= thread.getName();
		       int pname= thread.getPriority();
		     
		       thread.setPriority(10);
		       System.out.println(thread.getPriority());
		       System.out.println(thread.getId());
		             
	}
	
	

	
}
