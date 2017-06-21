package dev.simon.skatergame.states;

import java.awt.Graphics;

import dev.simon.skatergame.Game;

public abstract class State {
	
	
	public static State currentState = null;
	
	public static void setState(State state) {
		currentState = state;
	}
	
	public static State getState() {
		return currentState;
	}
	
	
	
	//CLASS
	
	protected Game game;
	
	public State(Game game) {
		this.game = game;
	}
	
	
	public abstract void update();
	
	public abstract void render(Graphics g);

}
