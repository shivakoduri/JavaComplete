package com.myprojects.examples.designpatterns.creational.abstractfactory.two;

public class USFactory implements RetailFactory{

	public GadgetType createGadget(String gadgetSelection) {
		if ("Laptop".equalsIgnoreCase(gadgetSelection)) {
			return new Laptop();
		}
		throw new IllegalArgumentException("Selection does not exist");
	}
	
	
	public GarmentType createGarments(String garmentSelection) {
		if ("Shirt".equalsIgnoreCase(garmentSelection)) {
			return new Shirt();
		}
		throw new IllegalArgumentException("Selection does not exist");
	}
	
}
