/**
 * 
 */
package com.myprojects.examples.java.basic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author shiva koduri
 *
 */
public class SortNotComparableTest {
	
	@Test
	public void sortNotComparable(){
		final List<NotComparable> objects = new ArrayList<NotComparable>();
		
		for(int i=0;i<10;i++){
			objects.add(new NotComparable(i));
		}
		
//		Collections.sort(objects); --Not Valid
	}

}
