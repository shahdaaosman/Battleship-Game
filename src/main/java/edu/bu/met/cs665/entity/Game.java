package edu.bu.met.cs665.entity;

public interface Game {

	void startGame();

	void play(Player player1, Player player2);
	
	void GameEnd();

}
