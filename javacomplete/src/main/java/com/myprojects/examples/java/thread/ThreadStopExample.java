/**
 * 
 */
package com.myprojects.examples.java.thread;

import java.util.concurrent.TimeUnit;

/**
 * Java Program to demonstrate how to stop a thread in Java.
 * There is a stop() method in Thread class but its deprecated 
 * because of deadlock and other issue, but its easy to write
 * your own stop() method to stop a thread in Java. 
 */

public class ThreadStopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Task t = new Task();
			
			Thread t1 = new Thread(t, "T1");
			t1.start();
			
			//Now, let's stop our Server thread
			System.out.println(t1.currentThread().getName() + " is stopping Server thread");
			t.stop();
			
			//Let's wait to see server thread stopped 
			TimeUnit.MILLISECONDS.sleep(200);
			
			System.out.println(t1.currentThread().getName() + " is finished now");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
}
