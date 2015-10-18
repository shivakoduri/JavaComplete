package com.myprojects.examples.designpatterns.creational.builder.one;

public enum Weapon {

	DAGGER, SWORD, AXE, WARHAMMER, BOW;

	@Override
	public String toString() {
		return name().toLowerCase();
	}

}
