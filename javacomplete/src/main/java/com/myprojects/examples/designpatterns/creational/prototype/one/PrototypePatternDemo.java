package com.myprojects.examples.designpatterns.creational.prototype.one;


public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape :"+ clonedShape.getType());
		
		clonedShape = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape :"+ clonedShape.getType());
		
		clonedShape = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape :"+ clonedShape.getType());
	}

}
