package com.logicofbs.fbsuper.game.Principal;
import android.view.*;
import android.content.*;
import android.graphics.*;
import android.view.View.*;
import com.logicofbs.fbsuper.game.Players.*;
import com.logicofbs.fbsuper.game.Objectos.*;
import com.logicofbs.fbsuper.game.Logica.*;

public class Control
{
	public static int rde,rdc,rdd,rdb,mv=50,mvt=10;
	public static int mpe,mpd,mpc,mpb,x,y,xn,yn,xs,ys,xo,yo,xe,ye;
	public static boolean rd;
	Tela tl;
	Som sm;
	public Control(Context ctx)
	{
		tl = new Tela(ctx);
		sm = new Som(ctx);
		mpe = 5;mpd = 105;
		mpc = 5;mpb = 105;
		x = (mpe + mpd) / 2;
		y = (mpc + mpb) / 2;
		xn = mpd / 2; yn = 15;xs = mpd / 2;ys = mpb - 5;
		xe = 8; ye = (mpb / 2) + 5;xo = mpd - 13;yo = (mpb / 2) + 5;
		rde = (tl.Largura() / 2) + 10; rdd = tl.Largura() - 10;
		rdc = 10; rdb = (tl.Altura() / 2) + 100;
		rd = false;
	}
	public void Design(Canvas cvs)
	{
		cvs.drawRect(mpe, mpc, mpd, mpb, Cores.Azul());
		cvs.drawCircle(x, y, 3, Cores.Branco());
		cvs.drawText("N", xn, yn, Cores.Branco());	
		cvs.drawText("S", xs, ys, Cores.Branco());	
		cvs.drawText("E", xe, ye, Cores.Branco());	
		cvs.drawText("O", xo, yo, Cores.Branco());	

		//manipular cenario completo na zona local
		rd = true;
		//if(rd == true && Jogo.rdX != 0 && Jogo.rdY != 0){
		//if(Jogo.btnX[0] > rde  && Jogo.btnX[0] < rdd && Jogo.btnY[0] > rdc && Jogo.btnY[0] < rdb || Jogo.btnX[1] > rde  && Jogo.btnX[1] < rdd && Jogo.btnY[1] > rdc && Jogo.btnY[1] < rdb){
		//if(Jogo.btnX[0] > Jogo.rdX-mv){
		if (Botoes.mvDir == "e")
		{
			//Canva.xchaoi += mvt;//movendo chão verde ld e +
			//Canva.xchaoii += mvt;//movendo chão verde ld d +
			if (ColisoesA.xprdi == false && ColisoesA.xmri == false && ColisoesA.xmria == false && ColisoesA.xmriaa == false && ColisoesA.xprdia == false && ColisoesA.xprdiaa == false && ColisoesA.xprdib == false && ColisoesA.xprdiba == false && ColisoesA.xmriab == false && ColisoesA.xmriaba == false)
			{
				if (Canva.mtx <= 3000 || Canva.mtx >= 7000)
				{
					Canva.xchaoi += mvt;
					Canva.xchaoii += mvt;
				}
				Canva.xparedei += mvt;
				Canva.xparedeii += mvt;
				Canva.xparedeia += mvt;
				Canva.xparedeiia += mvt;
				Canva.xparedeiaa += mvt;
				Canva.xparedeiiaa += mvt;
				Canva.xparedeib += mvt;
				Canva.xparedeiib += mvt;
				Canva.xparedeiba += mvt;
				Canva.xparedeiiba += mvt;
				Canva.xmurroi += mvt;
				Canva.xmurroii += mvt;
				Canva.xmurroia += mvt;
				Canva.xmurroiia += mvt;
				Canva.xmurroiaa += mvt;
				Canva.xmurroiiaa += mvt;
				Canva.xmurroiab += mvt;
				Canva.xmurroiiab += mvt;
				Canva.xmurroiaba += mvt;
				Canva.xmurroiiaba += mvt;
				Canva.xpasseioi += mvt;
				Canva.xpasseioii += mvt;
				Canva.xstradai += mvt;
				Canva.xstradaii += mvt;
				Canva.xstradai2 += mvt;
				Canva.xstradaii2 += mvt;
				Canva.xstradai3 += mvt;
				Canva.xstradaii3 += mvt;
				Canva.xstradai4 += mvt;
				Canva.xstradaii4 += mvt;
				Canva.xpa += mvt;
				Canva.xpb += mvt;
				Canva.xcasa1 += mvt;
				Canva.xcasa2 += mvt;
				Canva.xcasa3 += mvt;
				Canva.xcasa4 += mvt;
				
				//cidadaoA
				//if(CidadaoA.pxe > -20 && CidadaoA.pxe < tl.Largura()+20){
					CidadaoA.pxe += mvt;
					CidadaoA.pxd += mvt;
					CidadaoA.x += mvt;
				//}
				Canva.mtx += mvt;//identifocador de destino x +
			}
			else{sm.colisao();}
		}
		if (Botoes.mvDir == "d")
		{
			if (ColisoesA.xprdii == false && ColisoesA.xmrii == false && ColisoesA.xmriia == false && ColisoesA.xmriiaa == false && ColisoesA.xprdiia == false && ColisoesA.xprdiiaa == false && ColisoesA.xprdiib == false && ColisoesA.xprdiiba == false && ColisoesA.xmriiab == false  && ColisoesA.xmriiaba == false)
			{
				if (Canva.mtx <= 3000 || Canva.mtx >= 7000)
				{
					Canva.xchaoi -= mvt;
					Canva.xchaoii -= mvt;
				}
				//if(Jogo.btnX[0] < Jogo.rdX+mv){
				Canva.xparedei -= mvt;
				Canva.xparedeii -= mvt;
				Canva.xparedeia -= mvt;
				Canva.xparedeiia -= mvt;
				Canva.xparedeiaa -= mvt;
				Canva.xparedeiiaa -= mvt;
				Canva.xparedeib -= mvt;
				Canva.xparedeiib -= mvt;
				Canva.xparedeiba -= mvt;
				Canva.xparedeiiba -= mvt;
				Canva.xmurroi -= mvt;
				Canva.xmurroii -= mvt;
				Canva.xmurroia -= mvt;
				Canva.xmurroiia -= mvt;
				Canva.xmurroiaa -= mvt;
				Canva.xmurroiiaa -= mvt;
				Canva.xmurroiab -= mvt;
				Canva.xmurroiiab -= mvt;
				Canva.xmurroiaba -= mvt;
				Canva.xmurroiiaba -= mvt;
				Canva.xpasseioi -= mvt;
				Canva.xpasseioii -= mvt;
				Canva.xstradai -= mvt;
				Canva.xstradaii -= mvt;
				Canva.xstradai2 -= mvt;
				Canva.xstradaii2 -= mvt;
				Canva.xstradai3 -= mvt;
				Canva.xstradaii3 -= mvt;
				Canva.xstradai4 -= mvt;
				Canva.xstradaii4 -= mvt;
				Canva.xpa -= mvt;
				Canva.xpb -= mvt;
				Canva.xcasa1 -= mvt;
				Canva.xcasa2 -= mvt;
				Canva.xcasa3 -= mvt;
				Canva.xcasa4 -= mvt;
				
				//cidadaoA
				//if(CidadaoA.pxe > -20 && CidadaoA.pxe < tl.Largura()+20){
					CidadaoA.pxe -= mvt;
					CidadaoA.pxd -= mvt;
					CidadaoA.x -= mvt;
				//}
				Canva.mtx -= mvt;//identifocador de destino x +
			}
			else{sm.colisao();}
		}
		if (Botoes.mvDir == "c")
		{
			if (Canva.mty <= 3000 || Canva.mty >= 7000)
			{
				Canva.ychaoi += mvt;
				Canva.ychaoii += mvt;
			}
			//if(Jogo.btnY[0] > Jogo.rdY-mv){
			if (ColisoesA.yprdi == false && ColisoesA.ymri == false && ColisoesA.ymria == false && ColisoesA.ymriaa == false && ColisoesA.yprdia == false && ColisoesA.yprdiaa == false && ColisoesA.yprdib == false && ColisoesA.yprdiba == false && ColisoesA.ymriab == false  && ColisoesA.ymriaba == false)
			{
				Canva.yparedei += mvt;
				Canva.yparedeii += mvt;
				Canva.yparedeia += mvt;
				Canva.yparedeiia += mvt;
				Canva.yparedeiaa += mvt;
				Canva.yparedeiiaa += mvt;
				Canva.yparedeib += mvt;
				Canva.yparedeiib += mvt;
				Canva.yparedeiba += mvt;
				Canva.yparedeiiba += mvt;
				Canva.ymurroi += mvt;
				Canva.ymurroii += mvt;
				Canva.ymurroia += mvt;
				Canva.ymurroiia += mvt;
				Canva.ymurroiaa += mvt;
				Canva.ymurroiiaa += mvt;
				Canva.ymurroiab += mvt;
				Canva.ymurroiiab += mvt;
				Canva.ymurroiaba += mvt;
				Canva.ymurroiiaba += mvt;
				Canva.ypasseioi += mvt;
				Canva.ypasseioii += mvt;
				Canva.ystradai += mvt;
				Canva.ystradaii += mvt;
				Canva.ystradai2 += mvt;
				Canva.ystradaii2 += mvt;
				Canva.ystradai3 += mvt;
				Canva.ystradaii3 += mvt;
				Canva.ystradai4 += mvt;
				Canva.ystradaii4 += mvt;
				Canva.ypaa += mvt;
				Canva.ypab += mvt;
				Canva.ypac += mvt;
				Canva.ypba += mvt;
				Canva.ypbb += mvt;
				Canva.ypbc += mvt;
				Canva.ycasa1 += mvt;
				Canva.ycasa2 += mvt;
				Canva.ycasa3 += mvt;
				Canva.ycasa4 += mvt;
				
				//cidadaoA
				//if(CidadaoA.pyc > -20 && CidadaoA.pyb < tl.Altura()+20){
					CidadaoA.pyc += mvt;
					CidadaoA.pyb += mvt;
					CidadaoA.y += mvt;
				//}
				Canva.mty += mvt;
			}
			else{sm.colisao();}
		}
		if (Botoes.mvDir == "b")
		{
			if (Canva.mty <= 3000 || Canva.mty >= 7000)
			{
				Canva.ychaoi -= mvt;
				Canva.ychaoii -= mvt;
			}
			//if(Jogo.btnY[0] < Jogo.rdY+mv){
			if (ColisoesA.yprdii == false && ColisoesA.ymrii == false && ColisoesA.ymriia == false && ColisoesA.ymriiaa == false && ColisoesA.yprdiia == false && ColisoesA.yprdiiaa == false && ColisoesA.yprdiib == false && ColisoesA.yprdiiba == false && ColisoesA.ymriiab == false && ColisoesA.ymriiaba == false)
			{
				Canva.yparedei -= mvt;
				Canva.yparedeii -= mvt;
				Canva.yparedeia -= mvt;
				Canva.yparedeiia -= mvt;
				Canva.yparedeiaa -= mvt;
				Canva.yparedeiiaa -= mvt;
				Canva.yparedeib -= mvt;
				Canva.yparedeiib -= mvt;
				Canva.yparedeiba -= mvt;
				Canva.yparedeiiba -= mvt;
				Canva.ymurroi -= mvt;
				Canva.ymurroii -= mvt;
				Canva.ymurroia -= mvt;
				Canva.ymurroiia -= mvt;
				Canva.ymurroiaa -= mvt;
				Canva.ymurroiiaa -= mvt;
				Canva.ymurroiab -= mvt;
				Canva.ymurroiiab -= mvt;
				Canva.ymurroiaba -= mvt;
				Canva.ymurroiiaba -= mvt;
				Canva.ypasseioi -= mvt;
				Canva.ypasseioii -= mvt;
				Canva.ystradai -= mvt;
				Canva.ystradaii -= mvt;
				Canva.ystradai2 -= mvt;
				Canva.ystradaii2 -= mvt;
				Canva.ystradai3 -= mvt;
				Canva.ystradaii3 -= mvt;
				Canva.ystradai4 -= mvt;
				Canva.ystradaii4 -= mvt;
				Canva.ypaa -= mvt;
				Canva.ypab -= mvt;
				Canva.ypac -= mvt;
				Canva.ypba -= mvt;
				Canva.ypbb -= mvt;							Canva.ypbc -= mvt;
				Canva.ycasa1 -= mvt;
				Canva.ycasa2 -= mvt;
				Canva.ycasa3 -= mvt;
				Canva.ycasa4 -= mvt;
				
				//cidadaoA
				//if(CidadaoA.pyc >= 0 && CidadaoA.pyb <= tl.Altura()){
					CidadaoA.pyc -= mvt;
					CidadaoA.pyb -= mvt;
					CidadaoA.y -= mvt;
				//}
				Canva.mty -= mvt;
			}
			else{sm.colisao();}
		}
	}
}