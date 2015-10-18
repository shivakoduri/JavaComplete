package com.myprojects.examples.designpatterns.creational.builder.two;

public class CamerMaker {
	
	private CameraBuilder cameraBuilder = null;

	public void setCameraBuilder(CameraBuilder cameraBuilder) {
		this.cameraBuilder = cameraBuilder;
	}
	
	public Camera getCamera(){
		return this.cameraBuilder.getCamera();
	}
	
	
	public void constructCamera(){
		this.cameraBuilder.createCamera();
		this.cameraBuilder.buildDigitalZome();
		this.cameraBuilder.buildOpticalZome();
		this.cameraBuilder.buildMemory();
		this.cameraBuilder.buildDisplay();

	}
	
	

}
