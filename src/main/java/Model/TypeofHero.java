package model;

import model.SaveInfo;
import artifacts.Armor;
import artifacts.Weapon;
import model.Spiderman;
import model.Enemy;
import model.Blackpanther;
import model.Hero;
import model.Hulk;
import model.SuperMan;
import model.Badman;
import util.HeroFactory;
import view.*;
import view.ViewStatus;
import controller.*;

public class TypeofHero {
	
	public static String TypeofHeroToStr(int type) {
		if (type == 1) {
			return "Spiderman";
		}else if (type == 2) {
			return "Blackpanther";
		}else if (type == 3) {
			return "Hulk";
		}else if (type == 4) {
			return "SuperMan";
		}else if (type == 5) {
			return "Badman";
		}else
			return null;
		
	}
	
    public static void _type(String name) 
    {
    	int heroValue;
    	System.out.println("\n##########CHOOSE HERO WANT TO BE###########\n");
    	System.out.println("1.Spiderman");
    	System.out.println("2.Blackpanther");
    	System.out.println("3.Hulk");
    	System.out.println("4.SuperMan");
    	System.out.println("5.Badman");
    	System.out.println("6.Exit");
    	heroValue = checkintstr.inInt(" Select option : ");
    	
    	String type = TypeofHeroToStr(heroValue);
    	
    	Hero hero = HeroFactory.createCharacter(name, type);
    	Weapon weapon = new Weapon();
		Armor armor = new Armor();
    	
    	if (heroValue == 6) {
    		System.exit(0);
    	}
    	
    	ViewStatus.printstatus(hero);
    	SaveInfo.Openfile();
    	String str = hero.getType() + "," + hero.getName() + "," + hero.getLevel() + "," + hero.getHit_points() + "," + hero.getAttack() + "," + hero.getDefense() + "," + weapon.getWeapon(hero) + "," + armor.getArmor(hero) ;
        SaveInfo.writeToFile(str);
    	
        SaveInfo.closefile();
    	
    	int select;
    	System.out.println("\n");
    	System.out.println("1.Start Game");
    	System.out.println("2.Exit");
    	select = checkintstr.inInt("Select option : ");
    	
    	switch (select) {
    	case 1:
			System.out.println("\n##########START GAME###########\n");
			Achieve.AchieveUp(hero);
        	
    	case 2:
    		System.exit(0);
    		break;
    	default:
    	    System.out.println("Invalid selection");
    	    break; 
    	}
    	}
    	
    


}
