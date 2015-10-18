package com.myprojects.examples.designpatterns.creational.prototype.two;

public abstract class Beast extends Prototype{

	@Override
	protected abstract Beast clone() throws CloneNotSupportedException;
}
