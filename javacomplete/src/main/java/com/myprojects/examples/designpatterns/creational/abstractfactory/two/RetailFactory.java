package com.myprojects.examples.designpatterns.creational.abstractfactory.two;

/**
 * Factory class is the abstract class which will be referred by client. All the
 * concrete classes needs to implement the abstract factory method.
 * 
 * @author shiva koduri
 *
 */
public interface RetailFactory {

	GarmentType createGarments(String garmentSelection);

	GadgetType createGadget(String gadgetSelection);

}
