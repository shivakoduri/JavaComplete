package com.myprojects.examples.designpatterns.creational.prototype.two;

public class ElfMage extends Mage{

	public ElfMage() {
		// TODO Auto-generated constructor stub
	}
	
	public ElfMage(ElfMage elfMage){
		
	}
	
	@Override
	public Mage clone() throws CloneNotSupportedException {
		return new ElfMage(this);
	}
	
	@Override
	public String toString() {
		return "Elven mage";
	}
}
