package com.myprojects.examples.designpatterns.creational.abstractfactory.two;

public class FactoryMaker {
	
	private static RetailFactory retailFactory = null;
	
	static RetailFactory getFactory(String choice){
		if("UK".equalsIgnoreCase(choice)){
			retailFactory = new UKFactory();
		}else if("US".equalsIgnoreCase(choice)){
			retailFactory = new USFactory();
		}
		
		return retailFactory;
	}

}
