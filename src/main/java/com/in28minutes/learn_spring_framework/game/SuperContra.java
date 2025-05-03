package com.in28minutes.learn_spring_framework.game;

public class SuperContra implements GamingConsole{
	public void up()
	{
		System.out.println("jump");
	}
	
	public void down()
	{
		System.out.println("sit down");
	}
	
	public void left()
	{
		System.out.println("turn back");
	}
	
	public void right()
	{
		System.out.println("fire bullets");
	}
}
