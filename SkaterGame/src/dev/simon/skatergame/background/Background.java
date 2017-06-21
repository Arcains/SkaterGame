package dev.simon.skatergame.background;


import java.awt.Graphics;

import dev.simon.skatergame.Game;
import dev.simon.skatergame.gfx.Assets;

public class Background {
	
	private Game game;
	private float x, y;
	
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
		if (game.getKeyManager().left && x <= -3) {
			System.out.println(x);
			x += 3;
		}
		if (game.getKeyManager().right && x >= -2558) {
			System.out.println(x);
			x -= 3;

		
	}
	}

}
