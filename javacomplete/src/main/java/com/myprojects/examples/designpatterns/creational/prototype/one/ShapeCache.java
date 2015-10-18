package com.myprojects.examples.designpatterns.creational.prototype.one;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

	private static Map<String, Shape> shapes = new HashMap<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapes.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	// for each shape run database query and create shape
	// shapeMap.put(shapeKey, shape);
	// for example, we are adding three shapes
	
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		shapes.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapes.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapes.put(rectangle.getId(), rectangle);
	}

}
