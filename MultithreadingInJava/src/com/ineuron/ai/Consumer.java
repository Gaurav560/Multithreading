package com.ineuron.ai;

public class Consumer extends Thread {

	
	company c;

	public Consumer(company c) {
		super();
		this.c = c;
	}

	@Override
	public void run() 
	{
		
		while (true) {
		try {
			this.c.consume_item();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			Thread.sleep(2000);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
			
		
		}
			
		
		
	}

}
