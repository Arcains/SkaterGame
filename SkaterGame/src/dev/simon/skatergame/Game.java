package dev.simon.skatergame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import dev.simon.skatergame.display.Display;
import dev.simon.skatergame.gfx.Assets;
import dev.simon.skatergame.gfx.ImageLoader;
import dev.simon.skatergame.gfx.SpriteSheet;
import dev.simon.skatergame.states.GameState;
import dev.simon.skatergame.states.MenuState;
import dev.simon.skatergame.states.State;


public class Game implements Runnable {
	
	private Display display;
	public int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	
	//Graphics
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	private State gameState;
	private State menuState;
	
	//Input
	private KeyManager keyManager;

	
	public Game(int width, int height, String title) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
	}
	
	public void init() {
		
		display = new Display(width, height, title);
		Assets.init();
		display.getFrame().addKeyListener(keyManager);
		
		gameState = new GameState(this);
		menuState = new MenuState(this);
		
		State.setState(gameState);

		
	}
	
	public void update() {
		
		keyManager.update();
		
		if (State.getState() != null) {
			State.getState().update();
		}
		
	}
	
	public void render() {
		
		bs = display.getCanvas().getBufferStrategy();
		if (bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics();
		
		g.clearRect(0, 0, width, height);
		
		
		if (State.getState() != null) {
			State.getState().render(g);
		}
		
		
		bs.show();
		g.dispose();
		
		
	}
	
	public void run() {
		
		int counter = 0;
		int timeSummary = 0;
		int fps = 60;

		init();

		while (running) {
			
			long timeBefore = System.nanoTime();

			update();
			render();
			
			counter++;
			long timeAfter = System.nanoTime();
			long delta = timeAfter - timeBefore;

			if ((1000 / fps) - (delta/1e6) > 0) {

				try {
					Thread.sleep((long) ((1000 / fps) - (delta/1e6)));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				timeSummary += System.nanoTime() - timeBefore;

			}
			
//			if (counter == fps) {
//				System.out.println("Zeit in fps: " + timeSummary/1e9);
//				counter = 0;
//				timeSummary = 0;
//			}

		}

		stop();

	}
	
	public synchronized void start() {
		
		if (running) {
			return;
		}
		
		running = true;
		
		thread = new Thread(this);
		thread.start();
		
	}
	
	public synchronized void stop() {
		
		if (!running) {
			return;
		}
		
		running = false;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public KeyManager getKeyManager() {
		return keyManager;
	}

}
