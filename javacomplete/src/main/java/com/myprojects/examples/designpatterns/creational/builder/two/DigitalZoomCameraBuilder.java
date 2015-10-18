package com.myprojects.examples.designpatterns.creational.builder.two;

public class DigitalZoomCameraBuilder extends CameraBuilder {

	@Override
	public void buildOpticalZome() {
		this.camera.setOpticalZoom("None");

	}

	@Override
	public void buildDigitalZome() {
		this.camera.setDigitalZoom("10X Optical Zoom");

	}

	@Override
	public void buildDisplay() {
		this.camera.setDisplaySize("4 inch LED screen");

	}

	@Override
	public void buildMemory() {
		this.camera.setInMemorySize("16GB inbuilt memory");

	}

}
