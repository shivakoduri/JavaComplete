package com.myprojects.examples.designpatterns.creational.abstractfactory.two;

public class UKFactory implements RetailFactory {

	public GadgetType createGadget(String gadgetSelection) {
		if ("Mobile".equalsIgnoreCase(gadgetSelection)) {
			return new Mobile();
		}
		throw new IllegalArgumentException("Selection does not exist");
	}

	public GarmentType createGarments(String garmentSelection) {
		if ("Trouser".equalsIgnoreCase(garmentSelection)) {
			return new Trouser();
		}
		throw new IllegalArgumentException("Selection does not exist");
	}

}
