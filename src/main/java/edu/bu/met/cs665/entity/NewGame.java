package edu.bu.met.cs665.entity;

import java.util.Scanner;
/**
 * This class represents a New Game
 * 
 * @author Shahd Osman
 *
 */
public class NewGame implements Game{

	/**
	 * build the singleton pattern
	 */
	private NewGame () {
		
	}
	
    /**
     * 
     * this class represent the Singleton holder
     *
     */
	private static class SingletonHolder {
        private static final NewGame INSTANCE = new NewGame();
    }

	/**
	 * this return the game object
	 * @return
	 */
	public static NewGame getInstance() {
		 return SingletonHolder.INSTANCE;
	}
	
	/**
	 * this method used to start the game
	 */
	@Override
	public void startGame() {
		gameRules();
		Board board1 = new Board(1);
		Player player1 = new Player(1,board1);
		Board board2 = new Board(2);
		Player player2 = new Player(2,board2);
        play(player1,player2);
		
	}
	
	/**
	 * this method display the game rules
	 */
	private void gameRules() {
		System.out.println("+++++++++++++++++++ Battleship GAME RULES ++++++++++++++++++");
		System.out.println("+++  There are two player                                +++");
		System.out.println("+++  There are Three ships with one location each        +++");
		System.out.println("+++  The ships are placed in 5*5 grid randomly           +++");
		System.out.println("+++  Each player has a turn to guess a ship location      +++");
		System.out.println("+++  The player who shoots three ships firt WIN the game +++");
		System.out.println("++++++++++++++++++++ GAME STARTED HAVE fUN +++++++++++++++++");
		System.out.println();
		
	}

	/**
	 * this method include the play process
	 */
	@Override
	public void play(Player player1, Player player2) {
		//play if no one win
		while(!(player1.playerWin(player1.board) ||
				player2.playerWin(player2.board))) {
			//player one turn
			player1.board.DisplyBord();
			player1.playerRound();
			player1.board.DisplyBord();
			//check if player 1 win
			if (player1.playerWin(player1.board)== true) {
				System.out.println("-------- Player 1 WIN ----------");
				break;
			}
			// player 2 turn 
			player2.board.DisplyBord();
			player2.playerRound();
			player2.board.DisplyBord();
			//check if player 1 win
			if (player2.playerWin(player2.board)== true) {
				System.out.println("-------- Player 2 WIN ----------");
				break;
			}
		}
		GameEnd();
	}

	/**
	 * the method called when the game end
	 */
	@Override
	public void GameEnd() {
		
		System.out.println("--------   Game over ----------");
		
	}


}
