package com.logicofbs.fbsuper.game.Principal;

import android.content.*;
import android.graphics.*;
public class Botoes {
	Control ctl;
	//controls de movementar
	public int ctxe,ctye,ctlxe,ctaye;
	public int ctxd,ctyd,ctlxd,ctayd;
	public int raiox,raioy,raio;
	//controls de ação 
	public int ctxpl,ctypl,ctlxpl,ctaypl;
	public int ctxbx,ctybx,ctlxbx,ctaybx;
	//controls de ação atacar
	public int ctxc,ctyc,ctlxc,ctayc;
	public int ctxb,ctyb,ctlxb,ctayb;
	public int ctxbt,ctybt,ctlxbt,ctaybt;
	//level para exibir dados
	public int vl;
	public static boolean armar;
	public static int destinox,destinoy;

	public static String mvDir,mvTop;
	Tela telaa;
	//Inimigoa inimigoa;
	public Botoes(Context ctx){
		//inimigoa = new Inimigoa(ctx);
		telaa = new Tela(ctx);
		ctl = new Control(ctx);
		armar = false;
		destinox = 50;//telaa.Largura()/2;
		destinoy = telaa.Altura()/2;
		vl = 10;
		//lado cima center ação
		ctxc = 75; ctlxc = 135;
		ctyc = telaa.Altura()-185; ctayc = telaa.Altura()-125;;
		//lado baixo center ação
		ctxb = 75; ctlxb = 135;
		ctyb = telaa.Altura()-75; ctayb = telaa.Altura()-15;;
		//lado esquerdo mv
		ctxe = 20; ctlxe = 80;
		ctye = telaa.Altura()-130; ctaye = telaa.Altura()-70;
		//lado direito mv
		ctxd = 130; ctlxd = 190;
		ctyd = telaa.Altura()-130; ctayd = telaa.Altura()-70;
		//botão pular
		ctxpl = telaa.Largura()-80; ctlxpl = telaa.Largura()-20;
		ctypl = telaa.Altura()-180; ctaypl = telaa.Altura()-120;
		//botão abaixar
		ctxbx = telaa.Largura()-80; ctlxbx = telaa.Largura()-20;
		ctybx = telaa.Altura()-80; ctaybx = telaa.Altura()-20;
		//botão bater
		ctxbt = telaa.Largura()-180; ctlxbt = telaa.Largura()-120;
		ctybt = telaa.Altura()-80; ctaybt = telaa.Altura()-20;
		//lavanca do btn mover
		raiox = (ctxe + ctlxd)/2;
		raioy = (ctyc + ctayb)/2;
		raio = 20;
	}
	public void ControlMv(Canvas cvs){
		ctl.Design(cvs);
		//exibir btn mover
		cvs.drawRect(ctxe,ctye,ctlxe,ctaye,Cores.Azul());
		cvs.drawRect(ctxd,ctyd,ctlxd,ctayd,Cores.Azul());
		cvs.drawRect(ctxc,ctyc,ctlxc,ctayc,Cores.Azul());
		cvs.drawRect(ctxb,ctyb,ctlxb,ctayb,Cores.Azul());
		//exibir btn pular e baixar
		cvs.drawRect(ctxpl,ctypl,ctlxpl,ctaypl,Cores.Azul());
		cvs.drawRect(ctxbx,ctybx,ctlxbx,ctaybx,Cores.Azul());
		//exibir botão bater e magia

		cvs.drawRect(ctxbt,ctybt,ctlxbt,ctaybt,Cores.Azul());

		//cvs.drawText("Jogo.clicou[0]: "+Jogo.clicou[0]+" chao.pxi: "+Chao.pxi+" mvdir: "+mvDir,60,130,Cores.getCorAvatarb());
		//programar btn mover
		if(Jogo.clicou[0] == true && Jogo.btnX[0] >= ctxe && Jogo.btnX[0] <= ctlxe && Jogo.btnY[0] >= ctye && Jogo.btnY[0] <= ctaye || Jogo.clicou[1] == true && Jogo.btnX[1] >= ctxe && Jogo.btnX[1] <= ctlxe && Jogo.btnY[1] >= ctye && Jogo.btnY[1] <= ctaye){
			mvDir = "e";
			
			cvs.drawRect(ctxe,ctye,ctlxe,ctaye,Cores.Branco());
		}else if(Jogo.clicou[0] == true && Jogo.btnX[0] >= ctxd && Jogo.btnX[0] <= ctlxd && Jogo.btnY[0] >= ctyd && Jogo.btnY[0] <= ctayd || Jogo.clicou[1] == true && Jogo.btnX[1] >= ctxd && Jogo.btnX[1] <= ctlxd && Jogo.btnY[1] >= ctyd && Jogo.btnY[1] <= ctayd){
			mvDir = "d";
			 
			cvs.drawRect(ctxd,ctyd,ctlxd,ctayd,Cores.Branco());
		}else if(Jogo.clicou[0] == true && Jogo.btnX[0] >= ctxc && Jogo.btnX[0] <= ctlxc && Jogo.btnY[0] >= ctyc && Jogo.btnY[0] <= ctayc || Jogo.clicou[1] == true && Jogo.btnX[1] >= ctxc && Jogo.btnX[1] <= ctlxc && Jogo.btnY[1] >= ctyc && Jogo.btnY[1] <= ctayc){
			//pular btn
			mvDir = "c";
			
			cvs.drawRect(ctxc,ctyc,ctlxc,ctayc,Cores.Branco());
		}else if(Jogo.clicou[0] == true && Jogo.btnX[0] >= ctxb && Jogo.btnX[0] <= ctlxb && Jogo.btnY[0] >= ctyb && Jogo.btnY[0] <= ctayb || Jogo.clicou[1] == true && Jogo.btnX[1] >= ctxb && Jogo.btnX[1] <= ctlxb && Jogo.btnY[1] >= ctyb && Jogo.btnY[1] <= ctayb){

			//pular btn
			mvDir = "b";
			
			cvs.drawRect(ctxb,ctyb,ctlxb,ctayb,Cores.Branco());
		}else{
			mvDir = " ";

		}
		if(Jogo.clicou[0] == true && Jogo.btnX[0] >= ctxpl && Jogo.btnX[0] <= ctlxpl && Jogo.btnY[0] >= ctypl && Jogo.btnY[0] <= ctaypl || Jogo.clicou[1] == true && Jogo.btnX[1] >= ctxpl && Jogo.btnX[1] <= ctlxpl && Jogo.btnY[1] >= ctypl && Jogo.btnY[1] <= ctaypl){
			//pular btn
			mvTop = "pl";

			cvs.drawRect(ctxpl,ctypl,ctlxpl,ctaypl,Cores.Branco());
		}else if(Jogo.clicou[0] == true && Jogo.btnX[0] >= ctxbx && Jogo.btnX[0] <= ctlxbx && Jogo.btnY[0] >= ctybx && Jogo.btnY[0] <= ctaybx || Jogo.clicou[1] == true && Jogo.btnX[1] >= ctxbx && Jogo.btnX[1] <= ctlxbx && Jogo.btnY[1] >= ctybx && Jogo.btnY[1] <= ctaybx){
			//pular btn
			mvTop = "bx";
		
			cvs.drawRect(ctxbx,ctybx,ctlxbx,ctaybx,Cores.Branco());
		}else if(Jogo.clicou[0] == true && Jogo.btnX[0] >= ctxbt && Jogo.btnX[0] <= ctlxbt && Jogo.btnY[0] >= ctybt && Jogo.btnY[0] <= ctaybt || Jogo.clicou[1] == true && Jogo.btnX[1] >= ctxbt && Jogo.btnX[1] <= ctlxbt && Jogo.btnY[1] >= ctybt && Jogo.btnY[1] <= ctaybt){
			//baterr btn
			mvTop = "bt";
			
			cvs.drawRect(ctxbt,ctybt,ctlxbt,ctaybt,Cores.Branco());
		}else {
			mvTop = " ";
		}
		cvs.drawCircle(raiox,raioy,raio,Cores.Azul());
		//configurar raio da lavanca mover
		if(Jogo.clicou[0] == true && Jogo.btnX[0] >= ctxe && Jogo.btnX[0] <= ctlxd && Jogo.btnY[0] >= ctyc && Jogo.btnY[0] <= ctayb || Jogo.clicou[1] == true && Jogo.btnX[1] >= ctxe && Jogo.btnX[1] <= ctlxd && Jogo.btnY[1] >= ctyc && Jogo.btnY[1] <= ctayb){
			raiox = Jogo.btnX[0];
			raioy = Jogo.btnY[0];
		}else{
			raiox = (ctxe + ctlxd)/2;
			raioy = (ctyc + ctayb)/2;
		}


		if(Jogo.clicou[0] == false && mvDir == " "){
			mvDir = " ";
		}
		if(Jogo.clicou[1] == false && mvTop == " "){
			mvTop = " ";
		}

	}
}