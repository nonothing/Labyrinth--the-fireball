package com.dose.labyrinth;

import com.badlogic.gdx.Game;
import com.dose.labyrinth.controller.MenuController;
import com.dose.labyrinth.controller.WorldController;
import com.dose.labyrinth.model.MyWorld;
import com.dose.labyrinth.view.Logo;
import com.dose.labyrinth.view.MenuRenderer;
import com.dose.labyrinth.view.WorldRenderer;


public class MyGame extends   Game  {
	
	public static boolean DEBUG = false;
	public static int WIDTH_DEVICE = 800;
	public static int HEIGT_DEVICE = 444;
	public static double scaleX = 1.0;
	public static double scaleY = 1.0;
	public static boolean PC;
	
	MenuController menuController;
	WorldController worldController;
	private Logo logo;
	
	@Override
	public void create() {
		System.out.println(scaleX);
		menuController = new MenuController(this, new MenuRenderer());
		worldController = new WorldController(this, new MyWorld(), new WorldRenderer());
		
		if(!DEBUG){
			logo = new Logo(this);
			setScreen(logo);
		}else{
			worldController.setInput();
			setScreen(worldController.getWorldRenderer());
		}
	}
	
	@Override
	public void dispose() {
		worldController = null;
//		batch.dispose();TODO
//		texture.dispose();TODO
		super.dispose();
	}
	
	public void changeMenu(){
		menuController.setInput();
		setScreen(menuController.getMenuRenderer());
	}
	
	public void changeGame(){
		worldController.setInput();
		setScreen(worldController.getWorldRenderer());
	}
	
	@Override
	public void resize(int width, int height) {
		
	}
	
}
