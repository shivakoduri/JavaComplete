package com.myprojects.examples.designpatterns.creational.abstractfactory.three;

public interface KingdomFactory {
	
	Castle createCastle();
	
	King createKing();
	
	Army createArmy();

}
