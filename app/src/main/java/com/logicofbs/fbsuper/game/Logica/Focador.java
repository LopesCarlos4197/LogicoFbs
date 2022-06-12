package com.logicofbs.fbsuper.game.Logica;
import android.content.*;
import com.logicofbs.fbsuper.game.Players.*;
import com.logicofbs.fbsuper.game.Principal.*;

public class Focador{
	public static int  t = 30 ,n = 80;
	public static boolean xprdiaa,xprdiiaa,yprdiaa,yprdiiaa;//parede x...ia & x..iia
	public static boolean xprdi,xprdii,yprdi,yprdii;//parede x...ia & x..iia
	public static boolean fce,fcd,fcc,fcb;
	public Focador(Context ctx){
		fce = true;
		fcd = true;
		fcc = false;
		fcb = true;
	}
	public void Cenarioiaa(int xe,int xd,int yc,int yb){
		if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb+t || AvatarA.pyb <= yc+n && AvatarA.pyc < yc+n){
			yprdiaa = false;
		}else{yprdiaa = true;}
	}
	public void Cenarioi(int xe,int xd,int yc,int yb){
		if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb+t || AvatarA.pyb <= yc+n && AvatarA.pyc < yc+n){
			yprdi = false;
		}else{yprdi = true;}
	}
}