package com.dose.labyrinth.controller;

import java.util.Timer;
import java.util.TimerTask;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.dose.labyrinth.MyGame;
import com.dose.labyrinth.model.MyWorld;
import com.dose.labyrinth.view.WorldRenderer;
import static com.dose.labyrinth.MyGame.cfg;

public class WorldController implements InputProcessor {

    private MyWorld world;
    private Timer mainTimer;
    private MenuController menuController;
    private SoundController soundController;
    private int mouseX;
    private int mouseY;
	private WorldRenderer worldRenderer;
	private MyGame myGame;
	
    
    public WorldController(MyGame myGame, MyWorld world, WorldRenderer worldRenderer)  {
        this.menuController = menuController;
        this.world = world;
        this.mainTimer = new Timer();//TODO timer 10
        this.mainTimer.schedule(timerTask, 1, 10);
        this.soundController = soundController; 
		this.worldRenderer = worldRenderer;
		this.myGame = myGame;
		worldRenderer.setWorld(world);
        mouseX = 0;
        mouseY = 0;
     }

    TimerTask timerTask = new TimerTask() {
		
		@Override
		public void run() {
			actionPerformed();
		}
	};
    
    
    public void actionPerformed() {
    }
	
	public void setInput(){
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public boolean keyDown(int keyCode) {
		return true;
	}

	@Override
	public boolean keyTyped(char arg0) {
		return false;
	}

	@Override
	public boolean keyUp(int keyCode) {
		return true;
	}

	@Override
	public boolean mouseMoved(int x, int y) {
		if(cfg.isPC()){
			mouseX = x;
			mouseY = y;
		}
		return true;
	}

	@Override
	public boolean scrolled(int arg0) {
		return false;
	}

	@Override
	public boolean touchDown(int x, int y, int pointer, int button) {
		isTouch = true;
		return false;
	}

	boolean isTouch;
	double angle;
	@Override
	public boolean touchDragged(int x, int y, int pointer) {
		return true;
	}

	@Override
	public boolean touchUp(int x, int y, int pointer, int button) {
			isTouch = false;
		return true;
	}
	
	public WorldRenderer getWorldRenderer(){
		return worldRenderer;
	}
}
