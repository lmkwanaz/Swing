package model;

import java.util.Random;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import artifacts.Armor;
import artifacts.Weapon;
import model.*;
import view.Map;
import view.War;
import view.*;

public abstract class Hero extends Character  {
	
	private Weapon weapon;
	
	private Armor armor;
	
	@NotNull
	@Size(min = 2, max = 20)
	protected String name;
	protected int level;
	protected int experience;
	private String type;
	public int x_exes;
	public int y_exes;
	protected int movement;
	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	protected char PlayerChar;
	protected int numOfMonsters = 0;
	
	@NotNull
	@Size(min = 2, max = 20)
	 public Hero(String name) {
		this.name = name;
//		this.level = level;
//
		this.experience = experience;
		

}

	public void player() {
		Map map = new Map(); 
		
		int maxXspace = map.ft_board_len_x();
		int maxYspace = map.ft_board_len_y();
		
		
		int randX, randY;
		
		do {
			randX = maxXspace / 2;
			randY = maxYspace / 2;

			
		}while (map.ft_fetch_from_map(randX, randY) != '*');

			this.x_exes = randX;
			this.y_exes = randY;
			
			this.PlayerChar = this.name.charAt(0);

			map.ft_put_in_map(x_exes, y_exes, PlayerChar);
			
	}
	

	
	public void moveHero(Hero hero, int item) {
		Map map = new Map(); 
		
		int maxXBoardSpace = map.ft_board_len_x();
		int maxYBoardSpace = map.ft_board_len_y();
		
			
			map.ft_put_in_map(x_exes, y_exes, PlayerChar);
			

			if (item == 1)
			{
				if ((y_exes - 1) > 0)
				{
					if (map.ft_fetch_from_map(x_exes, y_exes - 1) != '*')
						LetFight.fightWar(hero);
					y_exes = y_exes - 1;
				}
				else {
					y_exes = y_exes - 1;
					System.out.println("You Have Won!");
				}
			}
			else if (item == 2)
			{
				
				if ((x_exes + 1) < maxXBoardSpace)
				{
					if (map.ft_fetch_from_map(x_exes + 1, y_exes) != '*')
						LetFight.fightWar(hero);
					x_exes = x_exes + 1;
				}
				else{
					x_exes = x_exes + 1;
					System.out.println("You Have Won!");
				}
			}
			else if (item == 3)
			{
				if ((y_exes + 1) < maxYBoardSpace)
				{
					if (map.ft_fetch_from_map(x_exes, y_exes + 1) != '*')
						LetFight.fightWar(hero);
					y_exes = y_exes + 1;
				}	
				else {
					y_exes = y_exes + 1;
					System.out.println("You Have Won!");	
				}
			}
			else if (item == 4)
			{
				if ((x_exes - 1) > 0)
				{
					if (map.ft_fetch_from_map(x_exes - 1, y_exes) != '*')
						LetFight.fightWar(hero);
					x_exes = x_exes - 1;
				}
				else {
					x_exes = x_exes - 1;
					System.out.println("You Have Won!");	
				}
			}
			map.changeMap(x_exes, y_exes, PlayerChar);
		
		}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public int getExperience() {
		return experience;
	}

	public String getType() {
		return type;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isDead() {
	        return hit_points <= 0;
	}

	
}
