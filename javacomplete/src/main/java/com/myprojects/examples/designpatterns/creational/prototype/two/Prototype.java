package com.myprojects.examples.designpatterns.creational.prototype.two;

public abstract class Prototype implements Cloneable{
	
	@Override
	protected abstract Object clone() throws CloneNotSupportedException; 

}
