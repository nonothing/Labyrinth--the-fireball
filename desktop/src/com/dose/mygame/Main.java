package com.dose.mygame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dose.sniper.MyGame;

import static com.dose.sniper.MyGame.HEIGT_DEVICE;
import static com.dose.sniper.MyGame.WIDTH_DEVICE;
import static com.dose.sniper.MyGame.scaleX;
import static com.dose.sniper.MyGame.scaleY;
import static com.dose.sniper.MyGame.PC;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Sniper";
		cfg.width = WIDTH_DEVICE;
		cfg.height = HEIGT_DEVICE;
		PC = true;
		initSize();
		new LwjglApplication(new MyGame(), cfg);
	}
	
	private static void initSize(){
		scaleX = WIDTH_DEVICE / 1920.0;
		scaleY = HEIGT_DEVICE / 1080.0;
	}
}
