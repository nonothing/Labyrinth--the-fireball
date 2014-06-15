package com.dose.labyrinth;

import com.badlogic.gdx.Game;
import com.dose.labyrinth.controller.MenuController;
import com.dose.labyrinth.controller.WorldController;
import com.dose.labyrinth.interfaces.IConfig;
import com.dose.labyrinth.model.MyWorld;
import com.dose.labyrinth.view.Logo;
import com.dose.labyrinth.view.MenuRenderer;
import com.dose.labyrinth.view.WorldRenderer;


public class MyGame extends   Game  {
	
	public static IConfig cfg;
	
	MenuController menuController;
	WorldController worldController;
	private Logo logo;
	
	@Override
	public void create() {
		menuController = new MenuController(this, new MenuRenderer());
		worldController = new WorldController(this, new MyWorld(), new WorldRenderer());
		
		if(!cfg.isDebug()){
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
