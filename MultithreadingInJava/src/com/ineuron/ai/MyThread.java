package com.ineuron.ai;

 class My implements Runnable {

	@Override
	public void run() {
//task for thread
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}

	
	
}

public class MyThread{
public static void main(String[] args) {
	My t=new My();
	Thread thread=new Thread(t);
	thread.start();
}	
}
