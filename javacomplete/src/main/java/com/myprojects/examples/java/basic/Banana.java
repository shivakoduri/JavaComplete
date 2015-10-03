/**
 * 
 */
package com.myprojects.examples.java.basic;

import java.awt.Color;

/**
 * @author shiva koduri
 *
 */
public class Banana extends Fruit {

    public Banana(Color color, boolean seasonal) {
        super(color, seasonal);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void prepare() {
        System.out.println("Peal the Banana");
    }

}
