package dev.simon.skatergame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 48;
	private static final int height = 48;
	
	public static BufferedImage hero_standing, hero_defense, 
					hero_walking1, hero_walking2, hero_kneeling;
	
	public static BufferedImage block_gray, block_red, block_green;
	
	public static BufferedImage[] bird_flying;
	
	public static BufferedImage background_grass, background_big;
	
	public static void init() {
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Monk.png"));
		hero_standing = sheet.crop(0, 0, width, height);
		hero_defense = sheet.crop(width, 0, width, height);
		hero_walking1 = sheet.crop(2*width, 0, width, height);
		hero_walking2 = sheet.crop(3*width, 0, width, height);
		hero_kneeling = sheet.crop(4*width, 0, width, height);
		
		SpriteSheet blocks = new SpriteSheet(ImageLoader.loadImage("/textures/3blocks.png"));
		block_gray = blocks.crop(0, 0, 32, 32);
		block_red = blocks.crop(34, 0, 32, 32);
		block_green = blocks.crop(68, 0, 32, 32);
		
		
		
		
		SpriteSheet bird = new SpriteSheet(ImageLoader.loadImage("/textures/bird.png"));
		bird_flying = new BufferedImage[14];
		
		bird_flying[0] = bird.crop(0, 0, 110, 100);
		bird_flying[1] = bird.crop(110, 0, 110, 100);
		bird_flying[2] = bird.crop(220, 0, 110, 100);
		bird_flying[3] = bird.crop(330, 0, 110, 100);
		bird_flying[4] = bird.crop(440, 0, 110, 100);
		bird_flying[5] = bird.crop(0, 102, 110, 100);
		bird_flying[6] = bird.crop(110, 102, 110, 100);
		bird_flying[7] = bird.crop(220, 102, 110, 100);
		bird_flying[8] = bird.crop(330, 102, 110, 100);
		bird_flying[9] = bird.crop(440, 102, 110, 100);
		bird_flying[10] = bird.crop(0, 204, 110, 100);
		bird_flying[11] = bird.crop(110, 204, 110, 100);
		bird_flying[12] = bird.crop(220, 204, 110, 100);
		bird_flying[13] = bird.crop(330, 204, 110, 100);

		
		background_grass = ImageLoader.loadImage("/backgrounds/background_grass.jpg");
		background_big = ImageLoader.loadImage("/backgrounds/background_8000x640.jpg");
		
	}

}
