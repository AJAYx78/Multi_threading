package com.jsp.custom;

public class CustomThread implements  Runnable {
	
	public void run() {
		for(int i=10;i>0;i--)
		{
			System.out.println(i+"from ");
		}

	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	

}
