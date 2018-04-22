package com.srn1535.MultiThreading;

class Counter {
	int count;
	
	public synchronized void increment(){
		count++;
	}
}

public class Synchronizeexample {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<100;i++)
					c.increment();
				
			}
		},"T1");
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<100;i++)
					c.increment();
				
			}
		},"T2");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println(c.count);
		
	}

}
