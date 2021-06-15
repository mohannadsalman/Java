package com.codingdojo.java.objectmaster2;

public class HumanTest {

	public static void main(String[] args) {
		Human testHuman1 = new Human("moh");
		Human testHuman2 = new Human("MOhan");
		Human testHuman3 = new Human("mohannad");
		Wizard testWizard1 = new Wizard("Abed");
		Wizard testWizard2 = new Wizard("Nizam");
		Wizard testWizard3 = new Wizard("Joury");
		Ninja testNinja1 = new Ninja("Diar");
		Ninja testNinja2 = new Ninja("Biattnah");
		Ninja testNinja3 = new Ninja("Mohammad");
		Samurai testSamurai1 = new Samurai("osaid");
		Samurai testSamurai2 = new Samurai("Hazem");
		Samurai testSamurai3 = new Samurai("faozyah");		
		
		testHuman1.attack(testSamurai3);
		testWizard1.fireball(testNinja2);
		testNinja2.steal(testHuman2);
		testSamurai1.attack(testHuman3);
		testWizard2.heal(testNinja2);
		testWizard3.fireball(testNinja3);
		testSamurai3.deathBlow(testNinja1);
		testSamurai2.meditate();
		testNinja1.runAway();
		testSamurai3.howMany();		
	}
}