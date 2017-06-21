package dev.simon.skatergame.entities.creature;

import java.awt.Graphics;

import dev.simon.skatergame.Game;
import dev.simon.skatergame.gfx.Animation;
import dev.simon.skatergame.gfx.Assets;

public class Player extends Creature {
	
	private Animation birdAnim;
	private Game game;

	public Player(Game game, float x, float y) {
		super(x, y, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);
		this.game = game;
		
		birdAnim = new Animation(20, Assets.bird_flying);
	}

	@Override
	public void update() {
		birdAnim.update();
		getInput();
	}
	
	private void getInput() {
		if (game.getKeyManager().up) {
			y -= 3;
		}
		if (game.getKeyManager().down) {
			y += 3;
		}
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(birdAnim.getCurrentFrame(), (int)x, (int)y, width, height, null);
		
	}

}
