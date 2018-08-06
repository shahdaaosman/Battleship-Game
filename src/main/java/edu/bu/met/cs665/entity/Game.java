package edu.bu.met.cs665.entity;

public interface Game {

	public void startGame();
	
	public void intializbord(int[][] board);
	
	public void displaybord(int bordId);
	
	public void setShipsRandomaly();
	
	public int playerRound(int id);
	
	public void GameEnd(); 
	
	
}
