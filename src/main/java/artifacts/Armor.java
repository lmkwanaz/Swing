package artifacts;

import java.util.Random;

import model.Hero;

public class Armor {
	public static Armor armor = new Armor();
	public static String[] shield = {"Red cape", "Leather jacket", "Sheild","Gold armor", "invisible blanket"};
	
	public Armor(){
		
	}
	
	public String getArmor(Hero hero) {
		Random randomise = new Random();
		
		int randSheild = randomise.nextInt(4);
		return shield[randSheild];
	}

}
