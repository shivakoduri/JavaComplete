/**
 * 
 */
package com.myprojects.examples.java.basic;

import java.awt.Color;

/**
 * A concrete class to extend Fruit, since Mango IS-A Fruit
 * extending Fruit is justified. it got all properties of
 * fruit, and it defines how to prepare mango for eating.
 */

public class Mango extends Fruit {

    public Mango(Color color, boolean seasonal) {
        super(color, seasonal);
    }

    @Override
    public void prepare() {
        System.out.println("Cut the Mango");
    }

}
