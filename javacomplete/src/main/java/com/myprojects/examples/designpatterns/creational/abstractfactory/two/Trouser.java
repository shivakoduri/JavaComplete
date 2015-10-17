package com.myprojects.examples.designpatterns.creational.abstractfactory.two;

public class Trouser implements GarmentType{

	public String print() {
		System.out.println("Trouser created..");
		
		return "Trouser";
	}
}
