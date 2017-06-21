package dev.simon.skatergame.entities.creature;

import java.awt.Graphics;

import dev.simon.skatergame.entities.Entity;
import dev.simon.skatergame.gfx.Assets;

public abstract class Creature extends Entity {
	
	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 144,
							DEFAULT_CREATURE_HEIGHT = 144;
	
	
	protected int health;
	protected float speed;
	protected float xMove, yMove;

	public Creature(float x, float y, int width, int height) {
		super(x, y, width, height);
		this.health = DEFAULT_HEALTH;
		this.speed = DEFAULT_SPEED;
	}
	
	public void move() {
		x += xMove;
		y += yMove;
	}


	
	// Getter/Setter
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

}
