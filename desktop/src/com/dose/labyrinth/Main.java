package com.dose.labyrinth;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dose.labyrinth.MyGame;
import static com.dose.labyrinth.MyGame.cfg;

public class Main {
	public static void main(String[] args) {
		cfg = new ConfigPC();
		LwjglApplicationConfiguration acfg = new LwjglApplicationConfiguration();
		acfg.title = "Labyrinth";
		acfg.width = cfg.getWidth();
		acfg.height = cfg.getHeight();
		cfg.setPC(true);
		cfg.setDebug(false);
		initSize();
		new LwjglApplication(new MyGame(), acfg);
	}
	
	private static void initSize(){
		cfg.setScaleX(cfg.getWidth() / 1280.0);
		cfg.setScaleY(cfg.getHeight() / 800.0);
	}
}
