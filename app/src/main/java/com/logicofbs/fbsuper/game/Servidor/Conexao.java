package com.logicofbs.fbsuper.game.Servidor;
import java.io.*;
import java.net.*;
import com.logicofbs.fbsuper.game.Principal.*;

public class Conexao implements Runnable {
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private boolean rodar;
	private Jogo jogo;
	@Override
	public Conexao(Jogo jogo,Socket sct){
		this.jogo = jogo;
		try{
			oos = new ObjectOutputStream(sct.getOutputStream());
			ois  = new ObjectInputStream(sct.getInputStream());
		}
		catch (IOException e){}
	}
	public void Dados(Object obj){
		try{
			oos.write(obj);
			oos.flush();
		}
		catch (IOException e){}
	}
	@Override
	public void run(){
		rodar = true;
		while(rodar){
			try{
				Object objs = ois.readObject();
				//jogo.DadosRc(objs);
			}
			catch (IOException | ClassNotFoundException e){
			}
		}
	}
	public void fechar()throws Exception{
		oos.close();
		ois.close();
	}
}