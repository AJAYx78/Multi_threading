package com.jsp.custom;

public class NewCustomThread extends Thread {
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"new custom thread");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
