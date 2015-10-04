/**
 * 
 */
package com.myprojects.examples.java.thread;

/**
 * @author shiva koduri
 *
 */
public class Task implements Runnable{
	private volatile boolean exit =false; 
	
	public void run() {
		while(!exit){
			 System.out.println("-- Task is running");
		}
		System.out.println("--Task is stopped running");
	}
	
	public void stop(){
		exit = true;
	}
	

}
