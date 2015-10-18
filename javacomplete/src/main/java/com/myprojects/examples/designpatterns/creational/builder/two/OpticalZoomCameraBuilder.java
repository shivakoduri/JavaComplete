package com.myprojects.examples.designpatterns.creational.builder.two;

public class OpticalZoomCameraBuilder extends CameraBuilder {

	@Override
	public void buildOpticalZome() {
		this.camera.setOpticalZoom("50x Optical Zoom");

	}

	@Override
	public void buildDigitalZome() {
		this.camera.setDigitalZoom("None");

	}

	@Override
	public void buildDisplay() {
		this.camera
				.setDisplaySize("6 inch LED screen with touch functionality");

	}

	@Override
	public void buildMemory() {
		this.camera.setInMemorySize("32GB built in Memory");

	}

}
