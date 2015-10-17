package com.myprojects.examples.designpatterns.creational.abstractfactory.three;


/**
 * 
 * The Abstract Factory pattern provides a way to encapsulate a group of individual 
 * factories that have a common theme without specifying their concrete classes. In 
 * normal usage, the client software creates a concrete implementation of the abstract 
 * factory and then uses the generic interface of the factory to create the concrete 
 * objects that are part of the theme. The client does not know (or care) which 
 * concrete objects it gets from each of these internal factories, since it uses only 
 * the generic interfaces of their products. This pattern separates the details of 
 * implementation of a set of objects from their general usage and relies on object 
 * composition, as object creation is implemented in methods exposed in the factory 
 * interface.
 * <p>
 * The essence of the Abstract Factory pattern is a factory interface
 * ({@link KingdomFactory}) and its implementations ({@link ElfKingdomFactory},
 * {@link OrcKingdomFactory}). The example uses both concrete implementations to 
 * create a king, a castle and an army.
 * 
 */
public class App {
	
	private King king;
	private Castle castle;
	private Army army;
	
	
	public void createKingdom(final KingdomFactory factory){
		setKing(factory.createKing());
		setCastle(factory.createCastle());
		setArmy(factory.createArmy());
	}
	
	public King getKing(final KingdomFactory factory){
		return factory.createKing();
	}
	
	public Castle getCastle(final KingdomFactory factory){
		return factory.createCastle();
	}
	
	public Army getArmy(final KingdomFactory factory){
		return factory.createArmy();
	}
	
	public OrcKingdomFactory getOrcKingdomFactory(){
		return new OrcKingdomFactory();
	}
	
	public ElfKingdomFactory getElfKingdomFactory(){
		return new ElfKingdomFactory();
	}
	
	public King getKing() {
		return king;
	}
	public void setKing(King king) {
		this.king = king;
	}
	public Castle getCastle() {
		return castle;
	}
	public void setCastle(Castle castle) {
		this.castle = castle;
	}
	public Army getArmy() {
		return army;
	}
	public void setArmy(Army army) {
		this.army = army;
	}

	

}
