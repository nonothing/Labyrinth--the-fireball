package com.dose.labyrinth;

import android.os.Bundle;
import android.util.Log;
import android.view.Display;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.dose.labyrinth.MyGame;

import static com.dose.labyrinth.MyGame.HEIGT_DEVICE;
import static com.dose.labyrinth.MyGame.PC;
import static com.dose.labyrinth.MyGame.WIDTH_DEVICE;
import static com.dose.labyrinth.MyGame.scaleX;
import static com.dose.labyrinth.MyGame.scaleY;


public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        initDisplay();
        PC = false;
        initialize(new MyGame(), cfg);
    }
    
    @SuppressWarnings("deprecation")
	private void initDisplay() {
		Display display = getWindowManager().getDefaultDisplay();
		WIDTH_DEVICE = display.getWidth();
		HEIGT_DEVICE = display.getHeight();
		scaleX = WIDTH_DEVICE/1280.0;
		scaleY = HEIGT_DEVICE/800.0;
		
		Log.i("DISPLAY", "x="+WIDTH_DEVICE + " y="+ HEIGT_DEVICE + " scaleX=" + scaleX+ " scaleY=" + scaleY);
	} 
}