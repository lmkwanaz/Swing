package view;

import model.*;
import controller.*;
import util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LetFight{
    public static void fightWar(Hero hero) {
		
        System.out.println("You Have came across an Enemy ");
        int select;
        System.out.println("1.Fight");
        System.out.println("2.Run");
        select = checkintstr.inInt("Select option : ");
        Enemy enemy = new Enemy(50, 50, 60, "Zombie");
        
        War game = new War(hero, enemy);
        
        if (select == 1) {
            game.fight();
        }
        else if (select == 2)
            System.out.println("Your are a Coward, you chose to run!!");
        else
            System.out.println("Invalid entery!!");

    }

    

}
