package dev.simon.skatergame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	
	//STATIC STUFF
	
	public static Tile[] tiles = new Tile[256];
	public static Block grey = new Block(0);
	public static Block red = new Block(1);
	public static Block green = new Block(2);
	
	
	
	//CLASS
	public static final int TILE_WIDTH = 64; 
	public static final int TILE_HEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;
	private boolean isSolid = true;
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
	}
	
	
	
	
	
	// GETTER SETTER
	public BufferedImage getTexture() {
		return texture;
	}

	public void setTexture(BufferedImage texture) {
		this.texture = texture;
	}

	public int getId() {
		return id;
	}

	public boolean isSolid() {
		return isSolid;
	}

	public void setSolid(boolean isSolid) {
		this.isSolid = isSolid;
	}

}
