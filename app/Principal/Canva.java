package com.logicofbs.fbsuper.game.Principal;
import android.content.*;
import android.graphics.*;
import com.logicofbs.fbsuper.game.Objectos.*;
import com.logicofbs.fbsuper.game.Players.*;
import com.logicofbs.fbsuper.game.Logica.*;

public class Canva{
	Tela tl;
	public static String alertass;
	ColisoesA clsa;
	ColisoesI clsi;
	AvatarA avta;
	CidadaoA cdda;
	Focador fcd;
	Usuario usr;
	Botoes btn;
	private Bitmap cs1a,cs2a,cs3a,cs4a;
	public static int  xcasa1,ycasa1,xcasa2,ycasa2,xcasa3,ycasa3,xcasa4,ycasa4;
	public static int xpa,ypaa,ypab,ypac;
	public static int xpb,ypba,ypbb,ypbc;
	public static int xchaoi,xchaoii,ychaoi,ychaoii;//focado apenas para o relvado verde chäo x5000 y5000
	public static int xstradai,xstradaii,ystradai,ystradaii;//focado apenas para o relvado verde chäo x5000 y5000
	public static int xstradai2,xstradaii2,ystradai2,ystradaii2;//focado apenas para o relvado verde chäo x5000 y5000
	public static int xstradai3,xstradaii3,ystradai3,ystradaii3;//focado apenas para o relvado verde chäo x5000 y5000
	public static int xstradai4,xstradaii4,ystradai4,ystradaii4;//focado apenas para o relvado verde chäo x5000 y5000
	public static int xpasseioi,xpasseioii,ypasseioi,ypasseioii;//focsdo apenas para o passeio verde com terra x5000 y5000
	public static int xmurroi,xmurroii,ymurroi,ymurroii;//focsdo apenas para o murro branco x5000 y5000
	public static int xmurroia,xmurroiia,ymurroia,ymurroiia;//focsdo apenas para o murro branco x5000 y5000
	public static int xmurroiaa,xmurroiiaa,ymurroiaa,ymurroiiaa;//focsdo apenas para o murro branco x5000 y5000
	public static int xmurroiab,xmurroiiab,ymurroiab,ymurroiiab;//focsdo apenas para o murro branco x5000 y5000
	public static int xmurroiaba,xmurroiiaba,ymurroiaba,ymurroiiaba;//focsdo apenas para o murro branco x5000 y5000
	public static int xparedeiaa,xparedeiiaa,yparedeiaa,yparedeiiaa;//focado para cerca de vidro incolorx5000 y509
	public static int xparedei,xparedeii,yparedei,yparedeii;//focado para cerca de vidro incolor x5000 y5000
	public static int xparedeia,xparedeiia,yparedeia,yparedeiia;//focado para cerca de vidro incolor 1.2 x5000 y5000
	public static int xparedeib,xparedeiib,yparedeib,yparedeiib;//focado para cerca de vidro incolor 1.3 x5000 y5000
	public static int xparedeiba,xparedeiiba,yparedeiba,yparedeiiba;//focado para cerca de vidro incolor 1.3 x5000 y5000

	public static boolean xstdvi,xstdvi2,xstdvi3,xstdvi4;
	public static int mtx=5000,mty=5000;
	public static int chax,chay;
	public Canva(Context ctx){
		tl = new Tela(ctx);
		clsa = new ColisoesA(ctx);
		clsi = new ColisoesI(ctx);
		avta = new AvatarA(ctx);
		cdda = new CidadaoA(ctx);
		fcd = new Focador(ctx);
		btn = new Botoes(ctx);
		usr = new Usuario(ctx,tl);
		xstdvi = false;
		xstdvi2 = false;
		xstdvi3 = false;
		
		xcasa1 = 60;
		ycasa1 = (-tl.Altura()+200);
		xcasa2 = 180;
		ycasa2 = (-tl.Altura()+200);
		xcasa3 = 460;
		ycasa3 = (-tl.Altura()+200);
		xcasa4 = 560;
		ycasa4 = (-tl.Altura()+200);
		
		xpa = 100;ypaa = 30;ypab = 15;ypac = 0;
		xpb = 400;ypba = 30;ypbb = 15;ypbc = 0;
		xchaoi = -10; xchaoii = tl.Largura()+10;//largura chão verde
		ychaoi = -10; ychaoii = tl.Altura()+10;//altura chão verde
		xstradai = -50;xstradaii = tl.Largura()+50;
		ystradai = tl.Altura()/2;ystradaii = ((tl.Altura()/2)+200)+clsa.n;
		xstradai2 = 50;xstradaii2 = tl.Largura()+50;
		ystradai2 = (tl.Altura()/2)-250;ystradaii2 = ((tl.Altura()/2)-200)+clsa.n;
		xstradai3 = tl.Largura()+40;xstradaii3 = tl.Largura()+280;
		ystradai3 = -(tl.Altura()*2)-250;ystradaii3 = ((tl.Altura()*2)+400)+clsa.n;
		xstradai4 = -250;xstradaii4 = -50;
		ystradai4 = -(tl.Altura()*2)-250;ystradaii4 = ((tl.Altura()*2)+400)+clsa.n;
		xparedeiaa = 0; xparedeiiaa = tl.Largura();//largura da parede de vidro
		yparedeiaa = (-tl.Altura())+100; yparedeiiaa = (-tl.Altura())+200;//altura da parede de vidro
		xparedei = 0; xparedeii = tl.Largura();//largura da parede de vidro
		yparedei = (tl.Altura()/2)-100; yparedeii = tl.Altura()/2;//altura da parede de vidro
		xparedeia = 0; xparedeiia = tl.Largura();//largura da parede de vidro
		yparedeia = (tl.Altura()/2)+200; yparedeiia = (tl.Altura()/2)+300;//altura da parede de vidro
		xmurroi = 0; xmurroii = 1;
		ymurroi = (tl.Altura()/2)+290; ymurroii = (tl.Altura()*2)+70;
		xmurroia = tl.Largura()-10; xmurroiia = tl.Largura()-8;
		ymurroia = (tl.Altura()/2)+290; ymurroiia = (tl.Altura()*2)+70;
		ymurroiaa = (-tl.Altura())+190; ymurroiiaa = (tl.Altura()/2)-50;
		xmurroiaa = 0; xmurroiiaa = 1;
		ymurroiab = (-tl.Altura())+190; ymurroiiab = (tl.Altura()/2)-260;
		xmurroiab = tl.Largura()-10 ; xmurroiiab = tl.Largura()-8;
		ymurroiaba = (tl.Altura())-350; ymurroiiaba = (tl.Altura()/2)-50;
		xmurroiaba = tl.Largura()-10 ; xmurroiiaba = tl.Largura()-8;
		xparedeib = 0; xparedeiib = (tl.Largura()/2)-50;//largura da parede de vidro
		yparedeib = tl.Altura()*2; yparedeiib = (tl.Altura()*2)+100;//altura da parede de vidro
		xparedeiba = (tl.Largura()/2)+50; xparedeiiba = tl.Largura();//largura da parede de vidro
		yparedeiba = tl.Altura()*2; yparedeiiba = (tl.Altura()*2)+100;//altura da parede de vidro


		xpasseioi = 0; xpasseioii = tl.Largura();//largura do passeio verde com terra
		ypasseioi = 0; ypasseioii = tl.Altura()/2;//sltura do paddeio verde com terra


		chax = 13; chay = 13; //focado para dimensão da parede
		//ctl = new Control(ctx);
	}
	public void Design(Canvas cvs){
		cvs.drawRect(0,0,tl.Largura(),tl.Altura(),Cores.Branco());//fixo fundo
		for(int i = xchaoi; i < xchaoii;i+=chax){//multiplicar largura do chão
			for(int ii = ychaoi;ii < ychaoii; ii += chay){//multiplicar altura do chão
				if(i >= 0 && i <= tl.Largura() || ii >= 0 && ii <= tl.Altura()){
					cvs.drawBitmap(CenarioA.bca,i,ii,null);
				}
			}
		}
		if(xstradaii2 > 0 && xstradai2 < tl.Largura() && ystradaii2 > 0 && ystradai2 < tl.Altura()){
			xstdvi2 = false;
			for(int i = xstradai2; i < xstradaii2;i+=chax){//multiplicar largura da parede
				for(int ii = ystradai2;ii < ystradaii2; ii += chay){//multiplicar altura da parede
					if(i >= 0 && i <= tl.Largura() || ii >= 0 && ii <= tl.Altura()){
						cvs.drawBitmap(CenarioA.std,i,ii,null);
					}
				}
			}
		}else{xstdvi2 = true;}
		if(xstradaii3 > 0 && xstradai3 < tl.Largura() && ystradaii3 > 0 && ystradai3 < tl.Altura()){
			xstdvi3 = false;
			for(int i = xstradai3; i < xstradaii3;i+=chax){//multiplicar largura da parede
				for(int ii = ystradai3;ii < ystradaii3; ii += chay){//multiplicar altura da parede
					if(i >= 0 && i <= tl.Largura() || ii >= 0 && ii <= tl.Altura()){
						cvs.drawBitmap(CenarioA.std,i,ii,null);
					}
				}
			}
		}else{xstdvi3 = true;}
		if(xstradaii4 > 0 && xstradai4 < tl.Largura() && ystradaii4 > 0 && ystradai4 < tl.Altura()){
			xstdvi4 = false;
			for(int i = xstradai4; i < xstradaii4;i+=chax){//multiplicar largura da parede
				for(int ii = ystradai4;ii < ystradaii4; ii += chay){//multiplicar altura da parede
					if(i >= 0 && i <= tl.Largura() || ii >= 0 && ii <= tl.Altura()){
						cvs.drawBitmap(CenarioA.std,i,ii,null);
					}
				}
			}
		}else{xstdvi3 = true;}
		
		if(xstradaii > 0 && xstradai < tl.Largura() && ystradaii > 0 && ystradai < tl.Altura()){
			xstdvi = false;
			for(int i = xstradai; i < xstradaii;i+=chax){//multiplicar largura da parede
				for(int ii = ystradai;ii < ystradaii; ii += chay){//multiplicar altura da parede
					if(i >= 0 && i <= tl.Largura() || ii >= 0 && ii <= tl.Altura()){
						cvs.drawBitmap(CenarioA.std,i,ii,null);
					}
				}
			}
		}else{xstdvi = true;}
		if(fcd.yprdiaa == false || fcd.yprdi == false){
			avta.Design(cvs);
		}
		if(mtx >= 4000 && mtx <= 6000 && mty >= 4000 && mty <= 6000){
			for(int i = ymurroiab; i < ymurroiiab;i+=chay){//multiplicar largura do paceio
				if(i >= 0 && i <= tl.Largura() || ymurroiiab >= 0 && ymurroiiab <= tl.Altura()){
					cvs.drawBitmap(CenarioA.prd,xmurroiiab,i,null);
					clsi.Cenariomiab(xmurroiab,xmurroiiab,ymurroiab,ymurroiiab);
					clsa.Cenariomiab(xmurroiab,xmurroiiab,ymurroiab,ymurroiiab);
				}
			}
		}
		if(mtx >= 4000 && mtx <= 6000 && mty >= 4000 && mty <= 6000){
			for(int i = ymurroiaba; i < ymurroiiaba;i+=chay){//multiplicar largura do paceio
				if(i >= 0 && i <= tl.Largura() || ymurroiiaba >= 0 && ymurroiiaba <= tl.Altura()){
					cvs.drawBitmap(CenarioA.prd,xmurroiiaba,i,null);
					clsa.Cenariomiaba(xmurroiaba,xmurroiiaba,ymurroiaba,ymurroiiaba);
					clsi.Cenariomiaba(xmurroiaba,xmurroiiaba,ymurroiaba,ymurroiiaba);
				}
			}
		}
		if(mtx >= 4000 && mtx <= 6000 && mty >= 4000 && mty <= 6000){
			for(int i = ymurroia; i < ymurroiia;i+=chay){//multiplicar largura do paceio
				if(i >= 0 && i <= tl.Largura() || ymurroiia >= 0 && ymurroiia <= tl.Altura()){
					cvs.drawBitmap(CenarioA.prd,xmurroiia,i,null);
					clsa.Cenariomia(xmurroia,xmurroiia,ymurroia,ymurroiia);
					clsi.Cenariomia(xmurroia,xmurroiia,ymurroia,ymurroiia);
				}
			}
		}
		if(mtx >= 4000 && mtx <= 6000 && mty >= 4000 && mty <= 6000){
			for(int i = xparedeiaa; i < xparedeiiaa;i+=chax){//multiplicar largura da parede
				for(int ii = yparedeiaa;ii < yparedeiiaa; ii += chay){//multiplicar altura da parede
					if(i >= 0 && i <= tl.Largura() || ii >= 0 && ii <= tl.Altura()){
						cvs.drawBitmap(CenarioA.prd,i,ii,null);
						clsa.Cenarioiaa(xparedeiaa,xparedeiiaa,yparedeiaa,yparedeiiaa);
						clsi.Cenarioiaa(xparedeiaa,xparedeiiaa,yparedeiaa,yparedeiiaa);
						fcd.Cenarioiaa(xparedeiaa,xparedeiiaa,yparedeiaa,yparedeiiaa);
					}
				}
			}
		}
		if(mtx >= 4000 && mtx <= 6000 && mty >= 4000 && mty <= 6000){
			for(int i = xparedei; i < xparedeii;i+=chax){//multiplicar largura da parede
				for(int ii = yparedei;ii < yparedeii; ii += chay){//multiplicar altura da parede
					if(i >= 0 && i <= tl.Largura() || ii >= 0 && ii <= tl.Altura()){
						cvs.drawBitmap(CenarioA.prd,i,ii,null);
						clsa.Cenarioi(xparedei,xparedeii,yparedei,yparedeii);
						clsi.Cenarioi(xparedei,xparedeii,yparedei,yparedeii);
						fcd.Cenarioi(xparedei,xparedeii,yparedei,yparedeii);
					}
				}
			}
		}
		if(mtx >= 4000 && mtx <= 6000 && mty >= 4000 && mty <= 6000){
			for(int i = xparedeia; i < xparedeiia;i+=chax){//multiplicar largura da parede 1.2
				for(int ii = yparedeia;ii < yparedeiia; ii += chay){//multiplicar altura da parede
					if(i >= 0 && i <= tl.Largura() || ii >= 0 && ii <= tl.Altura()){
						cvs.drawBitmap(CenarioA.prd,i,ii,null);
						clsa.Cenarioia(xparedeia,xparedeiia,yparedeia,yparedeiia);
						clsi.Cenarioia(xparedeia,xparedeiia,yparedeia,yparedeiia);
					}
				}
			}
		}
		if(mtx >= 4000 && mtx <= 6000 && mty >= 4000 && mty <= 6000){
			for(int i = xparedeib; i < xparedeiib;i+=chax){//multiplicar largura da parede 1.2
				for(int ii = yparedeib;ii < yparedeiib; ii += chay){//multiplicar altura da parede
					if(i >= 0 && i <= tl.Largura() || ii >= 0 && ii <= tl.Altura()){
						cvs.drawBitmap(CenarioA.prd,i,ii,null);
						clsa.Cenarioib(xparedeib,xparedeiib,yparedeib,yparedeiib);
						clsa.Cenarioib(xparedeib,xparedeiib,yparedeib,yparedeiib);
					}
				}
			}
		}
		if(mtx >= 4000 && mtx <= 6000 && mty >= 4000 && mty <= 6000){
			for(int i = xparedeiba; i < xparedeiiba;i+=chax){//multiplicar largura da parede 1.2
				for(int ii = yparedeiba;ii < yparedeiiba; ii += chay){//multiplicar altura da parede
					if(i >= 0 && i <= tl.Largura() || ii >= 0 && ii <= tl.Altura()){
						cvs.drawBitmap(CenarioA.prd,i,ii,null);
						clsa.Cenarioiba(xparedeiba,xparedeiiba,yparedeiba,yparedeiiba);
						clsa.Cenarioiba(xparedeiba,xparedeiiba,yparedeiba,yparedeiiba);
					}
				}
			}
		}
		if(mtx >= 4000 && mtx <= 6000 && mty >= 4000 && mty <= 6000){
			for(int i = ymurroi; i < ymurroii;i+=chay){//multiplicar largura do paceio
				if(i >= 0 && i <= tl.Largura() || ymurroii >= 0 && ymurroii <= tl.Altura()){
					cvs.drawBitmap(CenarioA.prd,xmurroii,i,null);
					clsa.Cenariomi(xmurroi,xmurroii,ymurroi,ymurroii);
					clsa.Cenariomi(xmurroi,xmurroii,ymurroi,ymurroii);
				}
			}
		}
		if(mtx >= 4000 && mtx <= 6000 && mty >= 4000 && mty <= 6000){
			for(int i = ymurroiaa; i < ymurroiiaa;i+=chay){//multiplicar largura do paceio
				if(i >= 0 && i <= tl.Largura() || ymurroiiaa >= 0 && ymurroiiaa <= tl.Altura()){
					cvs.drawBitmap(CenarioA.prd,xmurroiiaa,i,null);
					clsa.Cenariomiaa(xmurroiaa,xmurroiiaa,ymurroiaa,ymurroiiaa);
					clsa.Cenariomiaa(xmurroiaa,xmurroiiaa,ymurroiaa,ymurroiiaa);
				}
			}
		}
		if(mtx >= 4000 && mtx <= 6000 && mty >= 4000 && mty <= 6000){
			for(int i = xpasseioi; i < xpasseioii;i+=chax){//multiplicar largura do paceio
				if(i >= 0 && i <= tl.Largura() || ypasseioii >= 0 && ypasseioii <= tl.Altura()){
					cvs.drawBitmap(CenarioA.crv,i,ypasseioii,null);
					//clsa.CenarioA(xpasseioi,xpasseioii,ypasseioi,ypasseioii);
				}
			}
		}
		if(xpa >= 0 && xpa <= tl.Largura() || xpa >= 0 && xpa <= tl.Altura()){
			cvs.drawBitmap(CenarioA.cl,xpa,ypaa,null);
			cvs.drawBitmap(CenarioA.cla,xpa,ypab,null);
			cvs.drawBitmap(CenarioA.clb,xpa,ypac,null);
		}
		if(xpb >= 0 && xpb <= tl.Largura() || xpb >= 0 && xpb <= tl.Altura()){
			cvs.drawBitmap(CenarioA.cl,xpb,ypba,null);



			cvs.drawBitmap(CenarioA.cla,xpb,ypbb,null);
			cvs.drawBitmap(CenarioA.clb,xpb,ypbc,null);
		}
		cdda.Design(cvs);
		
		if(fcd.yprdiaa == true || fcd.yprdi == true){
			avta.Design(cvs);
		}
		//cvs.drawBitmap(Avatar.avta,200,350,null);
		//cvs.drawBitmap(CenarioA.md,100,360,null);
		cs1a = Bitmap.createScaledBitmap(CasasA.cs1,100,100,true);
		cvs.drawBitmap(cs1a,xcasa1,ycasa1-50,null);
		cs2a = Bitmap.createScaledBitmap(CasasA.cs1,100,100,true);
		cvs.drawBitmap(cs2a,xcasa2,ycasa2-50,null);
		cs3a = Bitmap.createScaledBitmap(CasasA.cs3,100,100,true);
		cvs.drawBitmap(cs3a,xcasa3,ycasa3-50,null);
		cs4a = Bitmap.createScaledBitmap(CasasA.cs4,150,100,true);
		cvs.drawBitmap(cs4a,xcasa4,ycasa4-50,null);
		
		cs1a = Bitmap.createScaledBitmap(CasasA.cs3,100,100,true);
		cvs.drawBitmap(cs1a,xcasa1,ycasa1+150,null);
		cs2a = Bitmap.createScaledBitmap(CasasA.cs1,100,100,true);
		cvs.drawBitmap(cs2a,xcasa2,ycasa2+150,null);
		cs3a = Bitmap.createScaledBitmap(CasasA.cs3,100,100,true);
		cvs.drawBitmap(cs3a,xcasa3,ycasa3+150,null);
		cs4a = Bitmap.createScaledBitmap(CasasA.cs3,150,100,true);
		cvs.drawBitmap(cs4a,xcasa4,ycasa4+150,null);
		
		cvs.drawRect(Control.mpd+5,Control.mpc,(Control.mpd+5)*4,Control.mpb-50,Cores.Azul());
		cvs.drawText("Gps: ["+xstdvi+" : "+mty+"] Tela: ["+tl.Largura()+" : "+tl.Altura()+"]",Control.mpd+5,Control.mpc+15,Cores.Branco());	
		cvs.drawText("Mv: ["+CidadaoA.x+" : "+CidadaoA.y+"] Modo: ["+CidadaoA.mv+" : "+CidadaoA.tpmv+"]",Control.mpd+5,Control.mpc+40,Cores.Branco());	
		btn.ControlMv(cvs);
		usr.Design(cvs);
	}
}