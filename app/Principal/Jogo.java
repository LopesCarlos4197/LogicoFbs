package com.logicofbs.fbsuper.game.Principal;
import android.view.*;
import android.content.*;
import android.graphics.*;
import android.widget.*;
import android.net.*;
import com.logicofbs.fbsuper.game.Objectos.*;
import android.content.res.*;
import java.io.*;
import android.view.View.*;
public class Jogo extends SurfaceView implements Runnable,View.OnTouchListener {
	public final SurfaceHolder holder = getHolder();
	public static int[] btnX = new int[3];
	public static int btnY[] = new int[3];
	public static int rdX,rdY;
	public static boolean rd;
	private boolean[] slider = new boolean[3];
	public static boolean[] clicou = new boolean[3];
	public static int contar;
	private int acao,index;
	private boolean isRun;
	public static int porta = 4197;
	Canva cv;
	CenarioA cna;
	CasasA cs;
	Avatar vta;
	Context ctx;
	public Jogo(Context ctx){
		super(ctx);
		this.ctx = ctx;
		RaizDoProjecto();
		isRun = true;
		setOnTouchListener(this);
	}
	@Override
	public void run(){
		try{//tentar executar o loop do canvas se tiver tudo certo
			while (isRun){//loop inicia caso o for verdadeiro ou true
				if(!holder.getSurface().isValid())continue;//verificar erros
				Canvas cvs = holder.lockCanvas();//criar canvas e rodar a tempo real
				cv.Design(cvs);
				holder.unlockCanvasAndPost(cvs);//setar canvas para animar se tudo esta ok
			}
		}catch(Exception erro){//apresentar erro se encontrar erro no loop
			Toast.makeText(ctx,"erro 2: "+erro.getMessage(),Toast.LENGTH_LONG).show();
		}
	}
	public void RaizDoProjecto(){
		try{//tentar executar instanciador beta
			AssetManager a = ctx.getAssets();
			InputStream is = a.open("img/mapa.png");
			Bitmap chaos = BitmapFactory.decodeStream(is);
			
			AssetManager m = ctx.getAssets();
			InputStream iss = m.open("img/avatar.png");
			Bitmap avatar = BitmapFactory.decodeStream(iss);
			
			AssetManager c = ctx.getAssets();
			InputStream isc = m.open("img/casas.png");
			Bitmap casas = BitmapFactory.decodeStream(isc);
			
			cv = new Canva(ctx);
			cs = new CasasA(casas);
			cna = new CenarioA(chaos);
			vta = new Avatar(avatar);
		}catch(Exception erro){//apresentar erro se encontrar erro no loop
		
		}
	}
	@Override
	public boolean onTouch(View view, MotionEvent evento){
		acao = evento.getAction()&MotionEvent.ACTION_MASK;
		index = (evento.getAction()&MotionEvent.ACTION_POINTER_INDEX_MASK)>>MotionEvent.ACTION_POINTER_INDEX_SHIFT;
		contar = evento.getPointerCount();
		for(int i = 0; i <2; i++){
			if(i >= contar){
				continue;
			}
			if(evento.getAction() != MotionEvent.ACTION_MOVE && i != index){
				continue;
			}
			switch(acao){
				case MotionEvent.ACTION_DOWN:
				case MotionEvent.ACTION_POINTER_DOWN:
					btnX[i] = (int)evento.getX(i);
					btnY[i] = (int)evento.getY(i);
					slider[i] = true;
					clicou[i] = true;
					rdX = (int)evento.getX(i);
					rdY = (int)evento.getY(i);
					rd = true;
				break;
				case MotionEvent.ACTION_UP:
				case MotionEvent.ACTION_POINTER_UP:
					btnX[i] = (int)evento.getX(i);
					btnY[i] = (int)evento.getY(i);
					slider[i] = false;
					clicou[i] = false;
					rdX = 0;
					rdY = 0;
					rd = false;
				break;
				case MotionEvent.ACTION_HOVER_ENTER:
					rdX = 0;
					rdY = 0;
				case MotionEvent.ACTION_MOVE:
					btnX[i] = (int)evento.getX(i);
					btnY[i] = (int)evento.getY(i);
					slider[i] = true;
					clicou[i] = true;
				break;
				case MotionEvent.ACTION_OUTSIDE:
					rdX = 0;
					rdY = 0;
				case MotionEvent.ACTION_CANCEL:
					btnX[i] = (int)evento.getX(i);
					btnY[i] = (int)evento.getY(i);
					slider[i] = false;
					clicou[i] = false;
				break;
			}
		}

		return true;
	}
	public void iniciar(){//iniciar a rodar o canvas
		isRun = true;
	}
	public void parar(){//fechar o canvas sem retorno 
		isRun = false;
	}
}