package com.logicofbs.fbsuper.game.Objectos;
import android.graphics.*;

public class CenarioA{
	public static Bitmap bca,crv,prd,crc,std;
	public static Bitmap cl,cla,clb,md;
	private Bitmap chao;
	
	public CenarioA(Bitmap chaoa){
		chao = chaoa;
		Cenarios();
	}
	public void Cenarios(){
		bca = Bitmap.createBitmap(chao,380,20,13,13);//chão verde
		crv = Bitmap.createBitmap(chao,2,2,13,13);//chão com relva
		prd = Bitmap.createBitmap(chao,120,20,13,13);//cerca bronzeado
		crc = Bitmap.createBitmap(chao,2,160,13,13);//cerca bronzeado
		std = Bitmap.createBitmap(chao,100,20,13,13);//strada normal
		md = Bitmap.createBitmap(chao,120,140,20,15);//madeira da arvore
		cl = Bitmap.createBitmap(chao,340,120,20,20);//caule a da arvore
		cla = Bitmap.createBitmap(chao,340,100,20,20);//caule b da arvore
		clb = Bitmap.createBitmap(chao,340,80,20,20);//caule c da arvore
		
		
		
	}
}