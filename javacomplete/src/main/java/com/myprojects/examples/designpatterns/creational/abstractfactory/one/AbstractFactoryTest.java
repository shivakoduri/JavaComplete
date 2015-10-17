/**
 * 
 */
package com.myprojects.examples.designpatterns.creational.abstractfactory.one;

/**
 * @author shiva koduri
 * 
 * This pattern can be considered as a “super factory” or “Factory of factories”. E
 * Encapsulate a group of factories that have a common link without highlighting their concrete classes. 
 * An abstract factory provides an interface for creating families of related objects without specifying their concrete classes
 *
 */
public class AbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button btn = GUIFactory.createButton();
		
		btn.paint();

	}

}
