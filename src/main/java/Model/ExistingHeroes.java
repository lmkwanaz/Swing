package model;

import java.util.ArrayList;
import java.util.List;

import artifacts.Armor;
import artifacts.Weapon;

//import controller.checkintstr;
import util.HeroFactory;
import view.*;
import model.*;
import view.ViewStatus;

public class ExistingHeroes {
	
	public static void _typeofHero() 
    {
 	
    
    	Weapon weapon = new Weapon();
    	Armor armor = new Armor();
    	
    	
    	SaveInfo.Openfile();
		List<String[]> heroList = SaveInfo.getHeroList();
		int index = 1;
    	
    	for(String[] heroStat: heroList) {
			System.out.println(index + ". " + heroStat[1]);
			index++;	
    	}
    	
    int selectHero;
    selectHero = checkintstr.inInt("Select option : ");
    selectHero--;

	String[] heroStat = heroList.get(selectHero);
	
    SaveInfo.closefile();
	
    Hero hero = HeroFactory.createCharacter(heroStat[1].trim(), heroStat[0].trim());
	
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
   		break;
   	default:
   	    System.out.println("Invalid selection");
   	    break; 
   	}
    }
    	
}
