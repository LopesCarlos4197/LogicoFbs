package com.logicofbs.fbsuper.game.Servidor;
import java.net.*;
import com.logicofbs.fbsuper.game.Principal.*;

public class Servidor{
	private ServerSocket serversocket;
	public Conexao cnx;
	public void Servidor(){
		try{
			serversocket = new ServerSocket(Jogo.porta);
			serversocket.accept();
			//cnx = new Conexao(this,serversocket);
			
		}catch(Exception erro){
			Canva.alertass = "conetar: "+erro.getMessage();
		}
	}
	public void DadosSvd(int x,int y){
		
	}
	public void fechar(){
		try{
			serversocket.close();
		}catch(Exception erro){
			Canva.alertass = "fechar: "+erro.getMessage();
		}
	}
}