/**
 * 
 */
package com.myprojects.examples.java.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shiva koduri
 *
 */
public class PrimitiveAndReferenceType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int i =20;
		int j=i;
		j++;
		
		System.out.println("i:"+i+ ", j:"+j);
		
		List<String> list = new ArrayList<String>();
		List<String> copy = list;
		
		copy.add("hello");
		
		
		//When you assign a value to primitive data types, the primitive value is copied, 
		//but when you assign an object to reference type, the handle is copied.
		//which means for reference type object is not copied only handle is copied, 
		//i.e. object is shared between two reference variable, known as aliases. 


		System.out.println("list:"+ list+", copy:"+ copy);
		

	}

}
