package com.logicofbs.fbsuper.game.Servidor;
import com.logicofbs.fbsuper.game.Principal.*;
import java.net.*;

public class Cliente{
	private Socket socket;
	public void Servidor(){
		try{
			socket = new Socket("localhost",Jogo.porta);
		}catch(Exception erro){
			Canva.alertass = "conetar: "+erro.getMessage();
		}
	}
	public void DadosSvd(int x,int y){

	}
	public void fechar(){
		try{
			socket.close();
		}catch(Exception erro){
			Canva.alertass = "fechar: "+erro.getMessage();
		}
	}
}