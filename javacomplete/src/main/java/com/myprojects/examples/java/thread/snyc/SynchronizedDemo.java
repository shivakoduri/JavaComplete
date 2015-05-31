/**
 * 
 */
package com.myprojects.examples.java.thread.snyc;

/**
 * @author Admin
 *
 */
public class SynchronizedDemo {
	
	private int count=0;
	
	public synchronized void increment(){ //intrinsic lock which is mutex
		count++;
	}
	
	public void doWork(){
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				for(int i= 0 ; i<10000; i++){
					increment();
				}
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				for(int i= 0 ; i<10000; i++){
					increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count:" + count);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SynchronizedDemo demo = new SynchronizedDemo();
		demo.doWork();
	}

}
