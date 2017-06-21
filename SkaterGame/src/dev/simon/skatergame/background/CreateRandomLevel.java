package dev.simon.skatergame.background;

import java.awt.Graphics;

import dev.simon.skatergame.Game;
import dev.simon.skatergame.gfx.Assets;
import dev.simon.skatergame.tiles.Tile;

public class CreateRandomLevel {
	
	private final int DEFAULT_SIZE = 64;
	
	
	private final int[][] level = new int[50][10];
	private Game game;
	private float x;
	
	public CreateRandomLevel(Game game, float x) {
		this.game = game;
		this.x = x;

		for (int j = 0; j < 10; j++) {

			for (int i = 0; i < 50; i++) {
				int number = (int) (Math.random() * 15);
				
				if (number < 1) {
					level[i][j] = 1;
				} else {
					level[i][j] = 0;
				}
			}
		}
	}
	
	
	public void update() {
		changeLevelLocation();
	}
	
	
	public void render(Graphics g) {

		for (int j = 0; j < 9; j++) {

			for (int i = 3; i < 46; i++) {
				if (level[i][j] == 1) {
					Tile.tiles[0].render(g, (int) (i*DEFAULT_SIZE + x), j*DEFAULT_SIZE);
				}
			}
		}

	}
	
	
	
	private void changeLevelLocation() {
		
		if (x >= -2558) {
			x -= 3;

		}
	}
	
}
