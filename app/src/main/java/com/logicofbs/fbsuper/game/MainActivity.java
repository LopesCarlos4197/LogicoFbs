package com.logicofbs.fbsuper.game;

import android.app.*;
import android.os.*;
import android.view.*;
import com.logicofbs.fbsuper.game.Principal.*;
import android.widget.*;

public class MainActivity extends Activity {
	FrameLayout fl;
	Jogo jg;
	@Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		fl = (FrameLayout)findViewById(R.id.container);		
		try{
			jg = new Jogo(this);
			fl.addView(jg);
		}catch(Exception erro){
			Toast.makeText(MainActivity.this,"erro n!: "+erro.getMessage(),Toast.LENGTH_LONG).show();
		}
	}
	@Override
	protected void onResume(){
		new Thread(jg).start();
		super.onResume();
	}
	@Override
	protected void onPause(){
		jg.parar();
		super.onPause();
	}
}