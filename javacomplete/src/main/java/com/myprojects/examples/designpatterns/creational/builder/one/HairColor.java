package com.myprojects.examples.designpatterns.creational.builder.one;

public enum HairColor {

	WHITE, BLOND, RED, BROWN, BLACK;

	@Override
	public String toString() {
		return name().toLowerCase();
	}

}
