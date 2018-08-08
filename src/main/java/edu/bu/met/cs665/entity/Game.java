package edu.bu.met.cs665.entity;

/**
 *  This is an interface is for Game process
 *  build the factory method pattern
 * 
 * @author Sahad Osman
 *
 */
public interface Game {

	/**
	 * this method used to start the game
	 */
	void startGame();

	/**
	 * this method include the play process
	 * 
	 * @param player1
	 * @param player2
	 */
	void play(Player player1, Player player2);
	
	/**
	 * the method called when the game end
	 */
	void GameEnd();

}
