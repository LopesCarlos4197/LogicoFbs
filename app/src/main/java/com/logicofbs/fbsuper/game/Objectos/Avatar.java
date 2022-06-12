package com.logicofbs.fbsuper.game.Objectos;
import android.content.*;
import android.graphics.*;

public class Avatar{
	public static Bitmap avta;
	private Bitmap avt;
	public Avatar(Bitmap avt){
		this.avt = avt;
		Players();
	}
	public void Players(){
		avta = Bitmap.createBitmap(avt,13,20,40,40);
	}
}