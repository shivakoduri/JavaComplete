/**
 * 
 */
package com.myprojects.examples.java.basic;

import java.awt.Color;

/**
 * @author shiva koduri
 *
 * Abstract class to represent Fruit, defined only essential
 * properties of Fruit here and make things abstract which
 * is different for different fruits.
 *
 */
public abstract class Fruit {
	
	private Color color;
    private boolean seasonal;

    public Fruit(Color color, boolean seasonal) {
        this.color = color;
        this.seasonal = seasonal;
    }

   /*
    * This is an abstract method, see it doesn't have method body, only declaration
    */
    public abstract void prepare();

    public Color getColor() {
        return color;
    }

    public boolean isSeasonal() {
        return seasonal;
    }

}
