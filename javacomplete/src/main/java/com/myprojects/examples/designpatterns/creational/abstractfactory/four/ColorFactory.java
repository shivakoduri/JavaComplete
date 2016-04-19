/**
 * 
 */
package com.myprojects.examples.designpatterns.creational.abstractfactory.four;

/**
 * @author shiva koduri
 *
 */
public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String colorType) {
		
		if(colorType==null){
			return null;
		}
		
		if(colorType.equalsIgnoreCase("RED")){
			return new Red();
		}
		
		if(colorType.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		
		if(colorType.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		
		return null;
	}
	
	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
}
