/**
 * 
 */
package com.myprojects.examples.collection;

/**
 * @author shiva koduri
 *
 */

class Machine {
	
	public void start(){
		System.out.println("Start!");
	}
	
	public void stop(){
		System.out.println("Machine Stopping..!");
	}
}

class Camera extends Machine{
	
	public void snapShot(){
		System.out.println("Snap!");
	}
	
	@Override
	public void stop() {
		System.out.println("Camera Stopping..!");
	}
}

public class Application {
	
	public static void main(String[] args){
		
		Camera camera = new Camera();
		Machine machine = camera;
		
		machine.start();
		machine.stop();
		
		
		
	}

}


