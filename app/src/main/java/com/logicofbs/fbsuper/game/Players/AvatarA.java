package com.logicofbs.fbsuper.game.Players;
import android.content.*;
import android.graphics.*;
import com.logicofbs.fbsuper.game.Objectos.*;
import com.logicofbs.fbsuper.game.Principal.*;

public class AvatarA{
	public static int pxe,pxd,pyc,pyb,x,y;
	Tela tl;
	public AvatarA(Context ctx){
		tl = new Tela(ctx);
		x = (tl.Largura()/2)-15;
		y = (tl.Altura()/2)-20;
		
		pxe = (tl.Largura()/2)-20; pxd = (tl.Largura()/2)+20;
		pyc = (tl.Altura()/2)-20; pyb = (tl.Altura()/2)+20;
	}
	public void Design(Canvas cvs){
		cvs.drawRect(pxe,pyc,pxd,pyb,Cores.Branco());
		cvs.drawBitmap(Avatar.avta,x,y,null);
	}
	public void LogicaAvtA(){
		
	}
}