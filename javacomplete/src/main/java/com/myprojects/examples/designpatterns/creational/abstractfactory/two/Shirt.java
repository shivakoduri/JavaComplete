package com.myprojects.examples.designpatterns.creational.abstractfactory.two;

public class Shirt implements GarmentType {

	public String print() {
		System.out.println("Shirt Created");
		return "Shirt";
	}
}
