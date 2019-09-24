package util;

import model.Spiderman;
import model.Blackpanther;
import model.Hero;
import model.Hulk;
import model.SuperMan;
import model.Badman;

public class HeroFactory {
	public static Hero createCharacter(String name, String type) {
		if (type.equalsIgnoreCase("Spiderman")) {
			return new Spiderman(name);
		}else if (type.equalsIgnoreCase("Blackpanther")) {
			return new Blackpanther(name);
		}else if (type.equalsIgnoreCase("Hulk")) {
			return new Hulk(name);
		}else if (type.equalsIgnoreCase("SuperMan")) {
			return new SuperMan(name);
		}else if (type.equalsIgnoreCase("Badman")) {
			return new Badman(name);
		}else
			return null;
		
	}

}
