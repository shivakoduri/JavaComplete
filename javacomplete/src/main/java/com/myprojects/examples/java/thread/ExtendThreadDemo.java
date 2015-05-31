/**
 * 
 */
package com.myprojects.examples.java.thread;

/**
 * @author Admin
 *
 */

class Runner extends Thread{
	@Override
	public void run() {
		
		for(int i=0; i<10;i++){
			System.out.println("Hello: "+ i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}


public class ExtendThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runner runner1 = new Runner();
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();
				

	}

}
