/**
 * 
 */
package com.myprojects.examples.designpatterns.creational.abstractfactory.one;

/**
 * @author shiva koduri
 *
 */
public class WindowsFactory implements ButtonFactory {
	public Button createButton() {
		/**
         * this method creates a button for windows
         * button
         */
        System.out.println("creating windows button...");
        return new WindowsButton();

	}
}
