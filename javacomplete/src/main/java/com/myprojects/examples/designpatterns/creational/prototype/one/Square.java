package com.myprojects.examples.designpatterns.creational.prototype.one;

public class Square extends Shape{
	public Square() {
		type = "Square";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Squre::draw method..");
	}
	
	

}
