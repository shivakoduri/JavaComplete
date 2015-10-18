package com.myprojects.examples.designpatterns.creational.prototype.two;



public abstract class Mage extends Prototype {

	@Override
	public abstract Mage clone() throws CloneNotSupportedException;

}
