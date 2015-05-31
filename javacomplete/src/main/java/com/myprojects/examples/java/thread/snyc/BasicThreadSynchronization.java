/**
 * 
 */
package com.myprojects.examples.java.thread.snyc;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
class Processor extends Thread{
	
	private volatile boolean running = true;
	
	@Override
	public void run() {
		while (running){
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown(){
		running=false;
	}
}


public class BasicThreadSynchronization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Processor proc1 = new Processor();
		 proc1.start();
		 
		 System.out.println("Press return to stop...");
		 Scanner scn = new Scanner(System.in);
		 scn.nextLine();
		 
		 proc1.shutdown();
		 
		 
	}

}
