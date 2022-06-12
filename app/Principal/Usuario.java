package com.logicofbs.fbsuper.game.Principal;
import android.content.*;
import android.graphics.*;

public class Usuario{
	private int xeq1,xdq1,ycq1,ybq1;
	private int xeq2,xdq2,ycq2,ybq2;
	private int xeq3,xdq3,ycq3,ybq3;
	private int xeq4,xdq4,ycq4,ybq4;
	private int xeq5,xdq5,ycq5,ybq5;
	public Usuario(Context ctx,Tela tl){
		xeq1 = 240;xdq1 = 280;ycq1 = tl.Altura()-50; ybq1 = tl.Altura()-10;
		xeq2 = 300;xdq2 = 340;ycq2 = tl.Altura()-50; ybq2 = tl.Altura()-10;
		xeq3 = 360;xdq3 = 400;ycq3 = tl.Altura()-50; ybq3 = tl.Altura()-10;
		xeq4 = 420;xdq4 = 460;ycq4 = tl.Altura()-50; ybq4 = tl.Altura()-10;
		xeq5 = 480;xdq5 = 520;ycq5 = tl.Altura()-50; ybq5 = tl.Altura()-10;
	}
	public void Design(Canvas cvs){
		cvs.drawRect(xeq1,ycq1,xdq1,ybq1,Cores.Azul());
		cvs.drawRect(xeq2,ycq2,xdq2,ybq2,Cores.Azul());
		cvs.drawRect(xeq3,ycq3,xdq3,ybq3,Cores.Azul());
		cvs.drawRect(xeq4,ycq4,xdq4,ybq4,Cores.Azul());
		cvs.drawRect(xeq5,ycq5,xdq5,ybq5,Cores.Azul());
	}
}