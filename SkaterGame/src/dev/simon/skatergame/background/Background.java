package dev.simon.skatergame.background;


import java.awt.Graphics;

import dev.simon.skatergame.Game;
import dev.simon.skatergame.gfx.Assets;

public class Background {
	
	private Game game;
	private float x, y;
	
	boolean endOfLevel = false;
	
	public Background(Game game, float x, float y) {
		this.game = game;
		this.x = x;
		this.y = y;
		
	}
	
	
	public void update() {
		changeBackgroundLocation();
		
	}
	
	
	public void render(Graphics g) {
		g.drawImage(Assets.background_big, (int)x, (int)y, null);	
	}
	
	private void changeBackgroundLocation() {

		if (x >= -2558) {
			x -= 3;
		}
		if (x < -2558) {
			endOfLevel = true;
		}
	}

	
	
	// GETTERS SETTERS
	
	public boolean getEndOfLevel() {
		return endOfLevel;
	}
	
	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}

}
