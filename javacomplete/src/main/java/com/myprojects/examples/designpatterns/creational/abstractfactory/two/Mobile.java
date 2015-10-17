package com.myprojects.examples.designpatterns.creational.abstractfactory.two;

public class Mobile implements GadgetType{

	public String print() {
		
		 System.out.println("Mobile created...");
		 return "Mobile";
	}
}
