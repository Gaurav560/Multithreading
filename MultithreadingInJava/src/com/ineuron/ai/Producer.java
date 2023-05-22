package com.ineuron.ai;

public class Producer extends Thread {

	company c;
	public Producer(company c) {
		super();
		this.c = c;
	}
	@Override
	public void run() 
	{
		int i=1;
		while (true) {
		try {
			this.c.produce_item(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			Thread.sleep(1000);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
			
		i++;
		}

	}

}
