/**
 * 
 */
package com.myprojects.examples.designpatterns.creational.abstractfactory.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.myprojects.examples.designpatterns.creational.abstractfactory.three.App;
import com.myprojects.examples.designpatterns.creational.abstractfactory.three.Army;
import com.myprojects.examples.designpatterns.creational.abstractfactory.three.Castle;
import com.myprojects.examples.designpatterns.creational.abstractfactory.three.ElfArmy;
import com.myprojects.examples.designpatterns.creational.abstractfactory.three.ElfCastle;
import com.myprojects.examples.designpatterns.creational.abstractfactory.three.ElfKing;
import com.myprojects.examples.designpatterns.creational.abstractfactory.three.King;
import com.myprojects.examples.designpatterns.creational.abstractfactory.three.KingdomFactory;
import com.myprojects.examples.designpatterns.creational.abstractfactory.three.OrcArmy;
import com.myprojects.examples.designpatterns.creational.abstractfactory.three.OrcCastle;
import com.myprojects.examples.designpatterns.creational.abstractfactory.three.OrcKing;

/**
 * @author shiva koduri
 *
 */
public class AppTest {
	
	private App app = new App();
	private KingdomFactory elfKingdomFactory;
	private KingdomFactory orcKingdomFactory;
	
	@Before
	public void setUp(){
		elfKingdomFactory = app.getElfKingdomFactory();
		orcKingdomFactory = app.getOrcKingdomFactory();
	}
	
	@Test
	public void testKing(){
		final King elfKing = app.getKing(elfKingdomFactory);
		assertTrue(elfKing instanceof ElfKing);
		assertEquals(ElfKing.DESCRIPTION, elfKing.getDescription());
		
		final King orcKing = app.getKing(orcKingdomFactory);
		assertTrue(orcKing instanceof OrcKing);
		assertEquals(OrcKing.DESCRIPTION, orcKing.getDescription());
	}
	
	@Test
	public void testCastle(){
		final Castle elfCastle = app.getCastle(elfKingdomFactory);
		assertTrue(elfCastle instanceof ElfCastle);
		assertEquals(ElfCastle.DESCRIPTION, elfCastle.getDescription());
		
		final Castle orcCastle = app.getCastle(orcKingdomFactory);
		assertTrue(orcCastle instanceof OrcCastle);
		assertEquals(OrcCastle.DESCRIPTION, orcCastle.getDescription());
	}
	
	
	@Test
	public void testArmy(){
		final Army elfArmy = app.getArmy(elfKingdomFactory);
		assertTrue(elfArmy instanceof ElfArmy);
		assertEquals(ElfArmy.DESCRIPTION, elfArmy.getDescription());
		
		final Army orcArmy = app.getArmy(orcKingdomFactory);
		assertTrue(orcArmy instanceof OrcArmy);
		assertEquals(OrcArmy.DESCRIPTION, orcArmy.getDescription());
	}
	
	@Test
	public void createElfKingdom() {
		app.createKingdom(elfKingdomFactory);
		final King king = app.getKing();
		final Castle castle = app.getCastle();
		final Army army = app.getArmy();
		assertTrue(king instanceof ElfKing);
		assertEquals(ElfKing.DESCRIPTION, king.getDescription());
		assertTrue(castle instanceof ElfCastle);
		assertEquals(ElfCastle.DESCRIPTION, castle.getDescription());
		assertTrue(army instanceof ElfArmy);
		assertEquals(ElfArmy.DESCRIPTION, army.getDescription());
	}
	
	@Test
	public void createOrcKingdom() {
		app.createKingdom(orcKingdomFactory);
		final King king = app.getKing();
		final Castle castle = app.getCastle();
		final Army army = app.getArmy();
		assertTrue(king instanceof OrcKing);
		assertEquals(OrcKing.DESCRIPTION, king.getDescription());
		assertTrue(castle instanceof OrcCastle);
		assertEquals(OrcCastle.DESCRIPTION, castle.getDescription());
		assertTrue(army instanceof OrcArmy);
		assertEquals(OrcArmy.DESCRIPTION, army.getDescription());
	}
	
	

}
