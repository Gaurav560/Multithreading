package com.ineuron.ai;

class My1 extends Thread {

	@Override
	public void run() {
//task for thread
		for (int i = 20; i <= 30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

public class MyThread2 {
	public static void main(String[] args) {
		My tMy=new My();
		Thread thread=new Thread(tMy);
		thread.start();
		My1 t = new My1();

		t.start();
	}
}
