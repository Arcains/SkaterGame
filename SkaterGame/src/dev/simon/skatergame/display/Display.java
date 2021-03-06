package dev.simon.skatergame.display;

import java.awt.Canvas;
import java.awt.Dimension;


import javax.swing.JFrame;

public class Display {
	
	private String title;
	private int width;
	private int height;
	
	private JFrame frame;
	private Canvas canvas;

	
	public Display(int width, int height, String title) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	
	public void createDisplay() {
	
		
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setFocusable(false);
		
		frame.add(canvas);
		frame.pack();
		
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public Canvas getCanvas() {
		return canvas;
	}

}
