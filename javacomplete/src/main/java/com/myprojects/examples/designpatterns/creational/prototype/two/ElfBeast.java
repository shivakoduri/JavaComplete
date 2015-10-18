package com.myprojects.examples.designpatterns.creational.prototype.two;

public class ElfBeast extends Beast {

	public ElfBeast() {

	}

	public ElfBeast(ElfBeast elfBeast) {

	}

	@Override
	protected Beast clone() throws CloneNotSupportedException {
		return new ElfBeast(this);
	}

	@Override
	public String toString() {
		return "Eleven Eagle";
	}
}
