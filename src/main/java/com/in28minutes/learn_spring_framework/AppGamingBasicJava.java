package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var marioGame = new MarioGame();
//		var superContra = new SuperContra();
		var game = new PacManGame();//loose coupling
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
