/**
 * 
 */
package com.myprojects.examples.java.basic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Java Program to demonstrate what is abstract class and abstract method in Java, how to use
 * them, when to use them with a practical example.
 */
public class AbstractClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fruit mango = new Mango(Color.YELLOW, true); // mango is seasonal
        Fruit banana = new Banana(Color.YELLOW, false); // banana is not seasonal

        List<Fruit> platter = new ArrayList<Fruit>();
        platter.add(mango);
        platter.add(banana);
        serve(platter);
    }

    public static void serve(Collection<Fruit> fruits) {
        System.out.println("Preparing fruits to serve");
        for (Fruit f : fruits) {
            f.prepare();
        }
    }


}
