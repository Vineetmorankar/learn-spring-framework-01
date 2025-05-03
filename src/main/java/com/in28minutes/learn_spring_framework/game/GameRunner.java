package com.in28minutes.learn_spring_framework.game;

public class GameRunner {
	private GamingConsole game;//loose coupling
  
  public GameRunner(GamingConsole game)
  {
	  this.game = game;
  }

public void run() {
	// TODO Auto-generated method stub
	System.out.println("Game Running: "+ game);
	game.up();
	game.down();
	game.left();
	game.right();
}
}
