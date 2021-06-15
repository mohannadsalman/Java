
package com.codingdojo;

public class HumanTest {

	public static void main(String[] args) {
			Human ninja1 = new Human("mohannad");
			Human samurai1 = new Human("nizamm");
			Human wizard1 = new Human("abed");
			
			wizard1.attack(ninja1);
			samurai1.attack(ninja1);
			ninja1.attack(samurai1);
	}
}