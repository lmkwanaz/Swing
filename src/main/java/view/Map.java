package view;

import java.util.Arrays;
import model.*;

public class Map {

	
	static char[][] battleMap = new char[9][9];

	
	public char ft_fetch_from_map(int x, int y)
	{
		return (battleMap[y][x]);
	}
	public int ft_board_len_x()
	{
		return (battleMap.length - 1);
	}
	public int ft_board_len_y()
	{
		return (battleMap[0].length - 1);
	}
	
	public void ft_put_in_map(int x, int y, char nameChar)
	{
		battleMap[x][y] = nameChar;
	}
	public static void buildMap() {
		for(char[] row : battleMap) {
			Arrays.fill(row, '*');
		}
	}
	public static void rawMap() {
		int line = 1;
		while(line <= 27) {
			System.out.print('-');
			line++;
		}
		System.out.println();
		for(int i = 0; i < battleMap.length; i++) {
			for(int j = 0; j < battleMap[i].length; j++) {
				System.out.print("|" + battleMap[i][j] + "|");
			}
			System.out.println();
		}
		 line = 1;
		while(line <= 27) {
			System.out.print('-');
			line++;
		}
		System.out.println();
		
	}
	
	public void changeMap(int x, int y, char player)
	{
		for(int i = 0; i < battleMap.length; i++) {
			for(int j = 0; j < battleMap[i].length; j++) {
				if (battleMap[i][j] == player) {
					battleMap[i][j] = '*';
					battleMap[y][x] = player;
					break;
				}
			}
		}
	}
	

}
