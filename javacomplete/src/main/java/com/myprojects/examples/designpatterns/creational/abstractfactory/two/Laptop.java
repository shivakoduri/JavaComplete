package com.myprojects.examples.designpatterns.creational.abstractfactory.two;

public class Laptop implements GadgetType {

	public String print() {
		System.out.println("Laptop Created..");
		
		return "Laptop";
	}
}
