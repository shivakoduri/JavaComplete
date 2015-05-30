/**
 * 
 */
package com.myprojects.examples.java.basic;

/**
 * @author Admin
 *
 */
public class Sub extends Super{
	static{
		foo = "bar";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Super.foo);

	}

}
