/**
 * 
 */
package com.myprojects.examples.designpatterns.creational.abstractfactory.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shiva koduri
 *
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 String garmentSelection = null;
		 String gadgetSelection = null;
		 String countryChoice = null;
		 
		 try {
			System.out.println("1. Enter your garment selection Trouser/Shirt:\n");
			garmentSelection = br.readLine();
			System.out.println("1. Enter your gadget selection Laptop/Mobile:\n");
			gadgetSelection = br.readLine();
			System.out.println("1. Enter your county selection US/UK:\n");
			countryChoice = br.readLine();
			
			
			RetailFactory retailFactory = FactoryMaker.getFactory(countryChoice);
			System.out.println("Country selected:"+ countryChoice);
			GarmentType garmentType = retailFactory.createGarments(garmentSelection);
			System.out.println(garmentType.print());
			GadgetType gadgetType = retailFactory.createGadget(gadgetSelection);
			System.out.println(gadgetType.print());
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 

	}

}
