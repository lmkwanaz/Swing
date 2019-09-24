package artifacts;

import java.util.Random;

import model.Hero;

public class Weapon {
	public static Weapon weapon = new Weapon();
	public static String[] firearm = {"Gun", "Bomb", "Sword","Lazer", "Black magic"};
	
	public Weapon(){
		
	}
	
	public String getWeapon(Hero hero) {
		Random randomise = new Random();
		
		int randWeapon = randomise.nextInt(4);
		return firearm[randWeapon];
	}

}
