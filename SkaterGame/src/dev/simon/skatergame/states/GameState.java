package dev.simon.skatergame.states;

import java.awt.Graphics;

import dev.simon.skatergame.Game;
import dev.simon.skatergame.background.Background;
import dev.simon.skatergame.background.CreateRandomLevel;
import dev.simon.skatergame.entities.creature.Player;
import dev.simon.skatergame.gfx.Assets;

public class GameState extends State {
	
	private CreateRandomLevel createRandomLevel;
	private Background background;
	private Player player;
	
	public GameState(Game game) {
		super(game);
		this.background = new Background(game, 0, 0);
		this.player = new Player(game, 20, 260);
		this.createRandomLevel = new CreateRandomLevel(game, 0, 0);

	}

	@Override
	public void update() {
		background.update();
		player.update();
		createRandomLevel.update();
		
	}

	@Override
	public void render(Graphics g) {
		background.render(g);
		player.render(g);
		createRandomLevel.render(g);
	
	}

}
