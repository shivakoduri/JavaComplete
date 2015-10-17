package com.myprojects.examples.designpatterns.creational.abstractfactory.three;

public class ElfKingdomFactory implements KingdomFactory{
	
	public Army createArmy() {
		return new ElfArmy();
	}
	
	public Castle createCastle() {
		return new ElfCastle();
	}
	
	public King createKing() {
		return new ElfKing();
	}

}
