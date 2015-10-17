/**
 * 
 */
package com.myprojects.examples.designpatterns.creational.abstractfactory.one;

/**
 * @author shiva koduri
 *
 */
public class MacOsFactory implements ButtonFactory {

	public Button createButton() {
		/**
		 * this method creates a button for MAC OS button
		 */
		System.out.println("creating mac os button...");
		return new MacButton();
	}

}
