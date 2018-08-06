package edu.bu.met.cs665.entity;

import java.util.Scanner;

import edu.bu.met.cs665.board.Board;

public class NewGame {

	//build the singleton pattern
	private NewGame () {
		
	}
	
    private static class SingletonHolder {
        private static final NewGame INSTANCE = new NewGame();
    }

	public static NewGame getInstance() {
		 return SingletonHolder.INSTANCE;
	}
	
	public void startGame() {
		
		Board board1 = new Board(1);
		Player player1 = new Player(1,board1);
		Board board2 = new Board(2);
		Player player2 = new Player(2,board2);
        play(player1,player2);
		
	}


	private void play(Player player1, Player player2) {
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


	public void GameEnd() {
		
		System.out.println("-------- Game over ----------");
		
	}


}
