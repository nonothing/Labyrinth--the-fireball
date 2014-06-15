package com.dose.labyrinth;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dose.labyrinth.MyGame;

import static com.dose.labyrinth.MyGame.HEIGT_DEVICE;
import static com.dose.labyrinth.MyGame.PC;
import static com.dose.labyrinth.MyGame.WIDTH_DEVICE;
import static com.dose.labyrinth.MyGame.scaleX;
import static com.dose.labyrinth.MyGame.scaleY;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Labyrinth";
		cfg.width = WIDTH_DEVICE;
		cfg.height = HEIGT_DEVICE;
		PC = true;
		initSize();
		new LwjglApplication(new MyGame(), cfg);
	}
	
	private static void initSize(){
		scaleX = WIDTH_DEVICE / 1280.0;
		scaleY = HEIGT_DEVICE / 800.0;
	}
}
