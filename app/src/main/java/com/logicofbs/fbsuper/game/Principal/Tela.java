package com.logicofbs.fbsuper.game.Principal;
import android.view.WindowManager;
import android.content.*;
import android.view.Display;
import android.util.*;

public class Tela {
	public static int dimx = 0,dimy = 0;
	DisplayMetrics metros;
	public Tela(Context ctx){
		WindowManager wm = (WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
		Display dp = wm.getDefaultDisplay();
		metros = new DisplayMetrics();
		dp.getMetrics(metros);
	}
	public int Largura(){
		return metros.widthPixels+dimx;
	}
	public int Altura(){
		return metros.heightPixels+dimy;
	}
}