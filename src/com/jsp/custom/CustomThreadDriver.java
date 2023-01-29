package com.jsp.custom;

public class CustomThreadDriver {

	public static void main(String[] args) {
		
		
		
		CustomThread ct=new CustomThread();
		Thread thread= new Thread(ct);
		NewCustomThread nc=new NewCustomThread();
		
		
		thread.start();
		
         nc.start();
		
	}

}
