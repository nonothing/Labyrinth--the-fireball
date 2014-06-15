package com.dose.sniper.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.dose.sniper.model.MyWorld;

public class WorldRenderer implements Screen{
	
	private MyWorld world;
	private SpriteBatch spriteBatch;
	private OrthographicCamera camera;
	private ShapeRenderer shapeDebugger;
	
	public WorldRenderer() {
		spriteBatch = new SpriteBatch();
		shapeDebugger = new ShapeRenderer();
		 camera = new OrthographicCamera();
		 camera= new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		 camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		 camera.update();
		 spriteBatch.setProjectionMatrix(camera.combined);
		 shapeDebugger.setProjectionMatrix(camera.combined);
	}
	
	public void setWorld(MyWorld world){
		this.world = world;
	}
	Sprite sprite;
	public void render(float delta) {
		clear();
		
		spriteBatch.begin();
		shapeDebugger.begin(ShapeType.Line);
		paint();
		shapeDebugger.end();
		spriteBatch.end();
	}

	
    
    
    public void paint() {
        clear();
    }

	
	
	
	private void clear() {
		Gdx.graphics.getGL20().glClearColor(1, 1, 1, 1 );
		Gdx.graphics.getGL20().glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT );
	}
	
	
	@Override	public void dispose() {	}
	@Override	public void hide() {	}
	@Override	public void pause() {	}
	@Override	public void resize(int arg0, int arg1) {	}
	@Override	public void resume() {	}
	@Override	public void show() {	}
		
}
