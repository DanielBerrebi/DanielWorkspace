package evenOddGame;

import java.util.Scanner;

public class EvenOddGame {
	private Player[] players = new Player[5];
	private int winningPoints = 3;
	
	public void createPlayers(){
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player();
			System.out.println("Enter player name");
			String playerName = in.next();
			players[i].setName(playerName);
		}	
	}
	
	public void printPlayersStatus(){
		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i].details());
		}
	}
}
