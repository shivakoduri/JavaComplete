/**
 * 
 */
package com.myprojects.examples.designpatterns.creational.abstractfactory.four;

/**
 * @author shiva koduri
 *
 */
public abstract class AbstractFactory {
	
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);

}
