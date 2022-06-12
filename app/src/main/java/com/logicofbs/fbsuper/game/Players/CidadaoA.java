package com.logicofbs.fbsuper.game.Players;

import android.content.*;
import android.graphics.*;
import com.logicofbs.fbsuper.game.Logica.*;
import com.logicofbs.fbsuper.game.Objectos.*;
import com.logicofbs.fbsuper.game.Principal.*;
import java.util.*;

public class CidadaoA{
	public static String modo,mv;
	public static int pxe,pxd,pyc,pyb,x,y,n=13,t=13;
	private int mvt = 10;
	public static int tpmv = 0,obt,obst = 20;;
	Tela tl;
	public CidadaoA(Context ctx){
		tl = new Tela(ctx);
		mv = "e";
		modo = "mv";
		tpmv = 0;
		x = (tl.Largura()/2)-105;
		y = (tl.Altura()/2)-20;
		pxe = (tl.Largura()/2)-140; pxd = (tl.Largura()/2)-100;
		pyc = (tl.Altura()/2)+10; pyb = (tl.Altura()/2)+50;
	}
	public void Design(Canvas cvs){
		LogicacddA();
		cvs.drawBitmap(Avatar.avta,x,y,null);
		cvs.drawRect(pxe,pyc,pxd,pyb,Cores.Azul());
	}
	private void LogicacddA(){
		if(modo == "mv"){
			//if(pxe >= Canva.xstradai && pxd <= Canva.xstradaii && pyc >= Canva.ystradai && pyb <= Canva.ystradaii){
			if(mv == "e"){
				MoverE();
			}else if(mv == "c"){
				MoverC();
			}else if(mv == "d"){
				MoverD();
			}else if(mv == "b"){
				MoverB();
			}
			tpmv++;
			if(tpmv >= 50){
				Random rd = new Random();
				obt = rd.nextInt(4);
				tpmv = 0;
				OndVou(obt);
			}
		}else if(modo == "atk"){
			
		}else if(modo == "mr"){
			
		}else if(modo == "cdz"){
			
		}else if(modo == "pr"){
			
		}
	}
	private void OndVou(int rd){
		if(rd == 0){
			mv = "e";
		}else if(rd == 1){
			mv = "d";
		}else if(rd == 2){
			mv = "c";
		}else if(rd == 3){
			mv = "b";
		}
	}
	private void MoverE(){
		if (pxe > 0 && pxd > 0){
			if(pxe < Canva.xparedei || pxd > Canva.xparedeii || pyc  > Canva.yparedei || pyb < Canva.yparedeii){
				pxe -= mvt;
				pxd -= mvt;
				x -= mvt;
			}
		}
	}
	private void MoverD(){
		if (pxd < tl.Largura() && pxe < tl.Largura()){
			if(pxe < Canva.xparedei || pxd > Canva.xparedeii || pyc  > Canva.yparedei || pyb < Canva.yparedeii){
				pxe += mvt;
				pxd += mvt;
				x += mvt;
			}
		}
	}
	private void MoverC(){
		if (pyc > 0 && pyb > 0){//verificar na tela de cima
			if(pxe < Canva.xparedei || pxd > Canva.xparedeii || pyc  > Canva.yparedeii || pyb < Canva.yparedei){
				//verificar paredei
				pyc -= mvt;
				pyb -= mvt;
				y -= mvt;
			}
		}
	}
	private void MoverB(){
		if (pyb < tl.Altura() && pyc < tl.Altura()){
			if(pxe < Canva.xparedei || pxd > Canva.xparedeii || pyc  > Canva.yparedei || pyb < Canva.yparedeii){
				pyc += mvt;
				pyb += mvt;
				y += mvt;
			}
		}
	}
}