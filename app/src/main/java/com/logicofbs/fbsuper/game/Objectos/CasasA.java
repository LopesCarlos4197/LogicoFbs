package com.logicofbs.fbsuper.game.Objectos;

import android.graphics.*;

public class CasasA {
	private Bitmap css;;
	public static Bitmap cs1,cs2,cs3,cs3a,cs4;
	
	public CasasA(Bitmap cs){
		css = cs;
		Cenarios();
	}
	public void Cenarios(){
		cs1 = Bitmap.createBitmap(css,3,5,52,65);//casa n1
		cs2 = Bitmap.createBitmap(css,56,5,52,65);//casa n2
		cs3 = Bitmap.createBitmap(css,113,5,50,65);//casa n3
		cs3a = Bitmap.createBitmap(css,163,5,50,65);//casa n3a
		cs4 = Bitmap.createBitmap(css,210,5,90,65);//casa n4
	}
}