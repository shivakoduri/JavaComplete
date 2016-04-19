/**
 * 
 */
package com.myprojects.examples.designpatterns.creational.abstractfactory.four;

/**
 * @author shiva koduri
 *
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		
		if(choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}
		
		if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}

		return null;
		
	}

}
