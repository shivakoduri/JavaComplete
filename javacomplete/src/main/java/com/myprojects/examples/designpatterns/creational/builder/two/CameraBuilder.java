package com.myprojects.examples.designpatterns.creational.builder.two;

public abstract class CameraBuilder {

	protected Camera camera;

	public Camera getCamera() {
		return this.camera;
	}

	public void createCamera() {
		this.camera = new Camera();
	}

	public abstract void buildOpticalZome();

	public abstract void buildDigitalZome();

	public abstract void buildDisplay();

	public abstract void buildMemory();

}
