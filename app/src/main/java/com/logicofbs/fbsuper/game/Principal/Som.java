package com.logicofbs.fbsuper.game.Principal;
import android.content.*;
import android.media.*;
import com.logicofbs.fbsuper.game.*;


public class Som{
	private SoundPool sp;
	private int cls;
	public Som(Context ctx){
		sp = new SoundPool(3,AudioManager.STREAM_MUSIC,0);
		cls = sp.load(ctx,R.raw.hit,0);
	}
	public void colisao(){
		sp.play(cls,1,1,0,0,1);
		sp.stop(1);
	}
}