package dev.simon.skatergame.tiles;

import java.awt.image.BufferedImage;

import dev.simon.skatergame.gfx.Assets;

public class Block extends Tile {
	
	public Block(int id) {
		super(chooseColor(id), id);
	}

	private static BufferedImage chooseColor(int colorCode) {
		if (colorCode == 2) {
			return Assets.block_green;
		}
		if (colorCode == 1) {
			return Assets.block_red;
		}
		if (colorCode == 0) {
			return Assets.block_gray;
		}
		
		return null;

	}

}
