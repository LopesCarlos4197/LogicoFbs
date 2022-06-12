package com.logicofbs.fbsuper.game.Logica;
import android.content.*;
import com.logicofbs.fbsuper.game.Players.*;
import com.logicofbs.fbsuper.game.Principal.*;

public class ColisoesA{
	public static int  t = 30 ,n = 80;
	public static boolean xmri,xmrii,ymri,ymrii;//murro x...i & x..ii
	public static boolean xmria,xmriia,ymria,ymriia;//murro x...i & x..ii
	public static boolean xmriaa,xmriiaa,ymriaa,ymriiaa;//murro x...i & x..ii
	public static boolean xmriab,xmriiab,ymriab,ymriiab;//murro x...i & x..ii
	public static boolean xmriaba,xmriiaba,ymriaba,ymriiaba;//murro x...i & x..ii
	public static boolean xprdi,xprdii,yprdi,yprdii;//parede x...ia & x..iia
	public static boolean xprdiaa,xprdiiaa,yprdiaa,yprdiiaa;//parede x...ia & x..iia
	public static boolean xprdia,xprdiia,yprdia,yprdiia;//parede x...ia & x..iia
	public static boolean xprdib,xprdiib,yprdib,yprdiib;//parede x...ia & x..iia
	public static boolean xprdiba,xprdiiba,yprdiba,yprdiiba;//parede x...ia & x..iia
	public ColisoesA(Context ctx){
		t = 30;
		n = 70;
	}
	public void Cenarioi(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(Botoes.mvDir == "e"){
			if(AvatarA.pxd <= xe && AvatarA.pxe < xe|| AvatarA.pxe > xd || AvatarA.pyc >= yb-t || AvatarA.pyb <= yc+n){
				xprdi = false;
			}else{xprdi = true;}
		}
		if(Botoes.mvDir == "d"){
			if(AvatarA.pxd < xe || AvatarA.pxe >= xd && AvatarA.pxd > xd || AvatarA.pyc >= yb-t || AvatarA.pyb <= yc+n){
				xprdii = false;
			}else{xprdii = true;}
		}
		if(Botoes.mvDir == "c"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb-t || AvatarA.pyb <= yc+n && AvatarA.pyc < yc+n){
				yprdi = false;
			}else{yprdi = true;}
		}
		if(Botoes.mvDir == "b"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyb < yc+n || AvatarA.pyc >= yb-t && AvatarA.pyb > yb){
				yprdii = false;
			}else{yprdii = true;}
		}
	}
	public void Cenarioia(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(Botoes.mvDir == "e"){
			if(AvatarA.pxd <= xe && AvatarA.pxe < xe|| AvatarA.pxe > xd || AvatarA.pyc >= yb-t || AvatarA.pyb <= yc+n){
				xprdia = false;
			}else{xprdia = true;}
		}
		if(Botoes.mvDir == "d"){
			if(AvatarA.pxd < xe || AvatarA.pxe >= xd && AvatarA.pxd > xd || AvatarA.pyc >= yb-t || AvatarA.pyb <= yc+n){
				xprdiia = false;
			}else{xprdiia = true;}
		}
		if(Botoes.mvDir == "c"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb-t || AvatarA.pyb <= yc+n && AvatarA.pyc < yc+n){
				yprdia = false;
			}else{yprdia = true;}
		}
		if(Botoes.mvDir == "b"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyb < yc+n || AvatarA.pyc >= yb-t && AvatarA.pyb > yb){
				yprdiia = false;
			}else{yprdiia = true;}
		}
	}
	public void Cenarioiaa(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(Botoes.mvDir == "e"){
			if(AvatarA.pxd <= xe && AvatarA.pxe < xe|| AvatarA.pxe > xd || AvatarA.pyc >= yb-t || AvatarA.pyb <= yc+n){
				xprdiaa = false;
			}else{xprdiaa = true;}
		}
		if(Botoes.mvDir == "d"){
			if(AvatarA.pxd < xe || AvatarA.pxe >= xd && AvatarA.pxd > xd || AvatarA.pyc >= yb-t || AvatarA.pyb <= yc+n){
				xprdiiaa = false;
			}else{xprdiiaa = true;}
		}
		if(Botoes.mvDir == "c"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb-t || AvatarA.pyb <= yc+n && AvatarA.pyc < yc+n){
				yprdiaa = false;
			}else{yprdiaa = true;}
		}
		if(Botoes.mvDir == "b"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyb < yc+n || AvatarA.pyc >= yb-t && AvatarA.pyb > yb){
				yprdiiaa = false;
			}else{yprdiiaa = true;}
		}
	}
	public void Cenarioib(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(Botoes.mvDir == "e"){
			if(AvatarA.pxd <= xe && AvatarA.pxe < xe|| AvatarA.pxe > xd || AvatarA.pyc >= yb-t || AvatarA.pyb <= yc+n){
				xprdib = false;
			}else{xprdib = true;}
		}
		if(Botoes.mvDir == "d"){
			if(AvatarA.pxd < xe || AvatarA.pxe >= xd && AvatarA.pxd > xd || AvatarA.pyc >= yb-t || AvatarA.pyb <= yc+n){
				xprdiib = false;
			}else{xprdiib = true;}
		}
		if(Botoes.mvDir == "c"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb-t || AvatarA.pyb <= yc+n && AvatarA.pyc < yc+n){
				yprdib = false;
			}else{yprdib = true;}
		}
		if(Botoes.mvDir == "b"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyb < yc+n || AvatarA.pyc >= yb-t && AvatarA.pyb > yb){
				yprdiib = false;
			}else{yprdiib = true;}
		}
	}
	public void Cenarioiba(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(Botoes.mvDir == "e"){
			if(AvatarA.pxd <= xe && AvatarA.pxe < xe|| AvatarA.pxe > xd || AvatarA.pyc >= yb-t || AvatarA.pyb <= yc+n){
				xprdiba = false;
			}else{xprdiba = true;}
		}
		if(Botoes.mvDir == "d"){
			if(AvatarA.pxd < xe || AvatarA.pxe >= xd && AvatarA.pxd > xd || AvatarA.pyc >= yb-t || AvatarA.pyb <= yc+n){
				xprdiiba = false;
			}else{xprdiiba = true;}
		}
		if(Botoes.mvDir == "c"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb-t || AvatarA.pyb <= yc+n && AvatarA.pyc < yc+n){
				yprdiba = false;
			}else{yprdiba = true;}
		}
		if(Botoes.mvDir == "b"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyb < yc+n || AvatarA.pyc >= yb-t && AvatarA.pyb > yb){
				yprdiiba = false;
			}else{yprdiiba = true;}
		}
	}
	public void Cenariomi(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(Botoes.mvDir == "e"){
			if(AvatarA.pxd <= xe && AvatarA.pxe < xe|| AvatarA.pxe > xd+20 || AvatarA.pyc >= yb || AvatarA.pyb <= yc){
				xmri = false;
			}else{xmri = true;}
		}
		if(Botoes.mvDir == "d"){
			if(AvatarA.pxd < xe || AvatarA.pxe >= xd && AvatarA.pxd > xd || AvatarA.pyc >= yb || AvatarA.pyb <= yc){
				xmrii = false;
			}else{xmrii = true;}
		}
		if(Botoes.mvDir == "c"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb || AvatarA.pyb <= yc && AvatarA.pyc < yc){
				ymri = false;
			}else{ymri = true;}
		}
		if(Botoes.mvDir == "b"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyb < yc || AvatarA.pyc >= yb && AvatarA.pyb > yb){
				ymrii = false;
			}else{ymrii = true;}
		}
	}
	public void Cenariomia(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(Botoes.mvDir == "e"){
			if(AvatarA.pxd <= xe && AvatarA.pxe < xe|| AvatarA.pxe > xd+20 || AvatarA.pyc >= yb || AvatarA.pyb <= yc){
				xmria = false;
			}else{xmria = true;}
		}
		if(Botoes.mvDir == "d"){
			if(AvatarA.pxd < xe || AvatarA.pxe >= xd && AvatarA.pxd > xd || AvatarA.pyc >= yb || AvatarA.pyb <= yc){
				xmriia = false;
			}else{xmriia = true;}
		}
		if(Botoes.mvDir == "c"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb || AvatarA.pyb <= yc && AvatarA.pyc < yc){
				ymria = false;
			}else{ymria = true;}
		}
		if(Botoes.mvDir == "b"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyb < yc || AvatarA.pyc >= yb && AvatarA.pyb > yb){
				ymriia = false;
			}else{ymriia = true;}
		}
	}
	public void Cenariomiaa(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(Botoes.mvDir == "e"){
			if(AvatarA.pxd <= xe && AvatarA.pxe < xe|| AvatarA.pxe > xd+20 || AvatarA.pyc >= yb || AvatarA.pyb <= yc){
				xmriaa = false;
			}else{xmriaa = true;}
		}
		if(Botoes.mvDir == "d"){
			if(AvatarA.pxd < xe || AvatarA.pxe >= xd && AvatarA.pxd > xd || AvatarA.pyc >= yb || AvatarA.pyb <= yc){
				xmriiaa = false;
			}else{xmriiaa = true;}
		}
		if(Botoes.mvDir == "c"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb || AvatarA.pyb <= yc && AvatarA.pyc < yc){
				ymriaa = false;
			}else{ymriaa = true;}
		}
		if(Botoes.mvDir == "b"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyb < yc || AvatarA.pyc >= yb && AvatarA.pyb > yb){
				ymriiaa = false;
			}else{ymriiaa = true;}
		}
	}
	public void Cenariomiab(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(Botoes.mvDir == "e"){
			if(AvatarA.pxd <= xe && AvatarA.pxe < xe|| AvatarA.pxe > xd+20 || AvatarA.pyc >= yb || AvatarA.pyb <= yc){
				xmriab = false;
			}else{xmriab = true;}
		}
		if(Botoes.mvDir == "d"){
			if(AvatarA.pxd < xe || AvatarA.pxe >= xd && AvatarA.pxd > xd || AvatarA.pyc >= yb || AvatarA.pyb <= yc){
				xmriiab = false;
			}else{xmriiab = true;}
		}
		if(Botoes.mvDir == "c"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb || AvatarA.pyb <= yc && AvatarA.pyc < yc){
				ymriab = false;
			}else{ymriab = true;}
		}
		if(Botoes.mvDir == "b"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyb < yc || AvatarA.pyc >= yb && AvatarA.pyb > yb){
				ymriiab = false;
			}else{ymriiab = true;}
		}
	}
	public void Cenariomiaba(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(Botoes.mvDir == "e"){
			if(AvatarA.pxd <= xe && AvatarA.pxe < xe|| AvatarA.pxe > xd+20 || AvatarA.pyc >= yb || AvatarA.pyb <= yc){
				xmriaba = false;
			}else{xmriaba = true;}
		}
		if(Botoes.mvDir == "d"){
			if(AvatarA.pxd < xe || AvatarA.pxe >= xd && AvatarA.pxd > xd || AvatarA.pyc >= yb || AvatarA.pyb <= yc){
				xmriiaba = false;
			}else{xmriiaba = true;}
		}
		if(Botoes.mvDir == "c"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyc > yb || AvatarA.pyb <= yc && AvatarA.pyc < yc){
				ymriaba = false;
			}else{ymriaba = true;}
		}
		if(Botoes.mvDir == "b"){
			if(AvatarA.pxd <= xe || AvatarA.pxe >= xd || AvatarA.pyb < yc || AvatarA.pyc >= yb && AvatarA.pyb > yb){
				ymriiaba = false;
			}else{ymriiaba = true;}
		}
	}
}