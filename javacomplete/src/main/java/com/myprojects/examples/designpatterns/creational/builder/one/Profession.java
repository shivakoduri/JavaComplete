package com.myprojects.examples.designpatterns.creational.builder.one;

public enum Profession {

	WARRIOR, THIEF, MAGE, PRIEST;

	@Override
	public String toString() {
		return name().toLowerCase();
	}

}
