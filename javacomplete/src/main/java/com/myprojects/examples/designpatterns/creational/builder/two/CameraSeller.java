package com.myprojects.examples.designpatterns.creational.builder.two;

public class CameraSeller {

	public static void main(String[] args) {
		CamerMaker maker = new CamerMaker();
		
		System.out.println("Create Camera with optical zoom...");
		
		CameraBuilder builder = new OpticalZoomCameraBuilder();
		maker.setCameraBuilder(builder);
		maker.constructCamera();
		
		Camera camera = maker.getCamera();

	}

}
