package com.dose.labyrinth;

import android.os.Bundle;
import android.util.Log;
import android.view.Display;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.dose.labyrinth.MyGame;
import static com.dose.labyrinth.MyGame.cfg;


public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cfg = new ConfigAndroid();
        AndroidApplicationConfiguration acfg = new AndroidApplicationConfiguration();
        initDisplay();
        initialize(new MyGame(), acfg);
    }
    
    @SuppressWarnings("deprecation")
	private void initDisplay() {
		Display display = getWindowManager().getDefaultDisplay();
		cfg.setWidth(display.getWidth());
		cfg.setHeight(display.getHeight());
		cfg.setScaleX(cfg.getWidth()/1280.0);
		cfg.setScaleY(cfg.getHeight()/800.0);
		Log.i("DISPLAY", "x="+cfg.getWidth() + " y="+ cfg.getHeight() + " scaleX=" + cfg.getScaleX()+ " scaleY=" + cfg.getScaleY());
	} 
}