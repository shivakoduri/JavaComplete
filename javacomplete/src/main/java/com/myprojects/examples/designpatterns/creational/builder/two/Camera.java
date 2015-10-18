package com.myprojects.examples.designpatterns.creational.builder.two;

public class Camera {
	
	private String opticalZoom;
    private String digitalZoom;
    private String displaySize;
    private String inMemorySize;
    
	public void setOpticalZoom(String opticalZoom) {
		this.opticalZoom = opticalZoom;
	}
	public void setDigitalZoom(String digitalZoom) {
		this.digitalZoom = digitalZoom;
	}
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	public void setInMemorySize(String inMemorySize) {
		this.inMemorySize = inMemorySize;
	}
}
