package com.logicofbs.fbsuper.game.Logica;
import android.content.*;
import com.logicofbs.fbsuper.game.Players.*;
import com.logicofbs.fbsuper.game.Principal.*;

public class ColisoesI{
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
	public ColisoesI(Context ctx){
		t = 30;
		n = 70;
	}
	public void Cenarioi(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(CidadaoA.mv == "e"){
			if(CidadaoA.pxd <= xe && CidadaoA.pxe < xe|| CidadaoA.pxe > xd || CidadaoA.pyc >= yb-t || CidadaoA.pyb <= yc+n){
				xprdi = false;
			}else{xprdi = true;}
		}
		if(CidadaoA.mv == "d"){
			if(CidadaoA.pxd < xe || CidadaoA.pxe >= xd && CidadaoA.pxd > xd || CidadaoA.pyc >= yb-t || CidadaoA.pyb <= yc+n){
				xprdii = false;
			}else{xprdii = true;}
		}
		if(CidadaoA.mv == "c"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyc > yb-t || CidadaoA.pyb <= yc+n && CidadaoA.pyc < yc+n){
				yprdi = false;
			}else{yprdi = true;}
		}
		if(CidadaoA.mv == "b"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyb < yc+n || CidadaoA.pyc >= yb-t && CidadaoA.pyb > yb){
				yprdii = false;
			}else{yprdii = true;}
		}
	}
	public void Cenarioia(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(CidadaoA.mv == "e"){
			if(CidadaoA.pxd <= xe && CidadaoA.pxe < xe|| CidadaoA.pxe > xd || CidadaoA.pyc >= yb-t || CidadaoA.pyb <= yc+n){
				xprdia = false;
			}else{xprdia = true;}
		}
		if(CidadaoA.mv == "d"){
			if(CidadaoA.pxd < xe || CidadaoA.pxe >= xd && CidadaoA.pxd > xd || CidadaoA.pyc >= yb-t || CidadaoA.pyb <= yc+n){
				xprdiia = false;
			}else{xprdiia = true;}
		}
		if(CidadaoA.mv == "c"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyc > yb-t || CidadaoA.pyb <= yc+n && CidadaoA.pyc < yc+n){
				yprdia = false;
			}else{yprdia = true;}
		}
		if(CidadaoA.mv == "b"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyb < yc+n || CidadaoA.pyc >= yb-t && CidadaoA.pyb > yb){
				yprdiia = false;
			}else{yprdiia = true;}
		}
	}
	public void Cenarioiaa(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(CidadaoA.mv == "e"){
			if(CidadaoA.pxd <= xe && CidadaoA.pxe < xe|| CidadaoA.pxe > xd || CidadaoA.pyc >= yb-t || CidadaoA.pyb <= yc+n){
				xprdiaa = false;
			}else{xprdiaa = true;}
		}
		if(CidadaoA.mv == "d"){
			if(CidadaoA.pxd < xe || CidadaoA.pxe >= xd && CidadaoA.pxd > xd || CidadaoA.pyc >= yb-t || CidadaoA.pyb <= yc+n){
				xprdiiaa = false;
			}else{xprdiiaa = true;}
		}
		if(CidadaoA.mv == "c"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyc > yb-t || CidadaoA.pyb <= yc+n && CidadaoA.pyc < yc+n){
				yprdiaa = false;
			}else{yprdiaa = true;}
		}
		if(CidadaoA.mv == "b"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyb < yc+n || CidadaoA.pyc >= yb-t && CidadaoA.pyb > yb){
				yprdiiaa = false;
			}else{yprdiiaa = true;}
		}
	}
	public void Cenarioib(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(CidadaoA.mv == "e"){
			if(CidadaoA.pxd <= xe && CidadaoA.pxe < xe|| CidadaoA.pxe > xd || CidadaoA.pyc >= yb-t || CidadaoA.pyb <= yc+n){
				xprdib = false;
			}else{xprdib = true;}
		}
		if(CidadaoA.mv == "d"){
			if(CidadaoA.pxd < xe || CidadaoA.pxe >= xd && CidadaoA.pxd > xd || CidadaoA.pyc >= yb-t || CidadaoA.pyb <= yc+n){
				xprdiib = false;
			}else{xprdiib = true;}
		}
		if(CidadaoA.mv == "c"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyc > yb-t || CidadaoA.pyb <= yc+n && CidadaoA.pyc < yc+n){
				yprdib = false;
			}else{yprdib = true;}
		}
		if(CidadaoA.mv == "b"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyb < yc+n || CidadaoA.pyc >= yb-t && CidadaoA.pyb > yb){
				yprdiib = false;
			}else{yprdiib = true;}
		}
	}
	public void Cenarioiba(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(CidadaoA.mv == "e"){
			if(CidadaoA.pxd <= xe && CidadaoA.pxe < xe|| CidadaoA.pxe > xd || CidadaoA.pyc >= yb-t || CidadaoA.pyb <= yc+n){
				xprdiba = false;
			}else{xprdiba = true;}
		}
		if(CidadaoA.mv == "d"){
			if(CidadaoA.pxd < xe || CidadaoA.pxe >= xd && CidadaoA.pxd > xd || CidadaoA.pyc >= yb-t || CidadaoA.pyb <= yc+n){
				xprdiiba = false;
			}else{xprdiiba = true;}
		}
		if(CidadaoA.mv == "c"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyc > yb-t || CidadaoA.pyb <= yc+n && CidadaoA.pyc < yc+n){
				yprdiba = false;
			}else{yprdiba = true;}
		}
		if(CidadaoA.mv == "b"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyb < yc+n || CidadaoA.pyc >= yb-t && CidadaoA.pyb > yb){
				yprdiiba = false;
			}else{yprdiiba = true;}
		}
	}
	public void Cenariomi(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(CidadaoA.mv == "e"){
			if(CidadaoA.pxd <= xe && CidadaoA.pxe < xe|| CidadaoA.pxe > xd+20 || CidadaoA.pyc >= yb || CidadaoA.pyb <= yc){
				xmri = false;
			}else{xmri = true;}
		}
		if(CidadaoA.mv == "d"){
			if(CidadaoA.pxd < xe || CidadaoA.pxe >= xd && CidadaoA.pxd > xd || CidadaoA.pyc >= yb || CidadaoA.pyb <= yc){
				xmrii = false;
			}else{xmrii = true;}
		}
		if(CidadaoA.mv == "c"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyc > yb || CidadaoA.pyb <= yc && CidadaoA.pyc < yc){
				ymri = false;
			}else{ymri = true;}
		}
		if(CidadaoA.mv == "b"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyb < yc || CidadaoA.pyc >= yb && CidadaoA.pyb > yb){
				ymrii = false;
			}else{ymrii = true;}
		}
	}
	public void Cenariomia(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(CidadaoA.mv == "e"){
			if(CidadaoA.pxd <= xe && CidadaoA.pxe < xe|| CidadaoA.pxe > xd+20 || CidadaoA.pyc >= yb || CidadaoA.pyb <= yc){
				xmria = false;
			}else{xmria = true;}
		}
		if(CidadaoA.mv == "d"){
			if(CidadaoA.pxd < xe || CidadaoA.pxe >= xd && CidadaoA.pxd > xd || CidadaoA.pyc >= yb || CidadaoA.pyb <= yc){
				xmriia = false;
			}else{xmriia = true;}
		}
		if(CidadaoA.mv == "c"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyc > yb || CidadaoA.pyb <= yc && CidadaoA.pyc < yc){
				ymria = false;
			}else{ymria = true;}
		}
		if(CidadaoA.mv == "b"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyb < yc || CidadaoA.pyc >= yb && CidadaoA.pyb > yb){
				ymriia = false;
			}else{ymriia = true;}
		}
	}
	public void Cenariomiaa(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(CidadaoA.mv == "e"){
			if(CidadaoA.pxd <= xe && CidadaoA.pxe < xe|| CidadaoA.pxe > xd+20 || CidadaoA.pyc >= yb || CidadaoA.pyb <= yc){
				xmriaa = false;
			}else{xmriaa = true;}
		}
		if(CidadaoA.mv == "d"){
			if(CidadaoA.pxd < xe || CidadaoA.pxe >= xd && CidadaoA.pxd > xd || CidadaoA.pyc >= yb || CidadaoA.pyb <= yc){
				xmriiaa = false;
			}else{xmriiaa = true;}
		}
		if(CidadaoA.mv == "c"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyc > yb || CidadaoA.pyb <= yc && CidadaoA.pyc < yc){
				ymriaa = false;
			}else{ymriaa = true;}
		}
		if(CidadaoA.mv == "b"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyb < yc || CidadaoA.pyc >= yb && CidadaoA.pyb > yb){
				ymriiaa = false;
			}else{ymriiaa = true;}
		}
	}
	public void Cenariomiab(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(CidadaoA.mv == "e"){
			if(CidadaoA.pxd <= xe && CidadaoA.pxe < xe|| CidadaoA.pxe > xd+20 || CidadaoA.pyc >= yb || CidadaoA.pyb <= yc){
				xmriab = false;
			}else{xmriab = true;}
		}
		if(CidadaoA.mv == "d"){
			if(CidadaoA.pxd < xe || CidadaoA.pxe >= xd && CidadaoA.pxd > xd || CidadaoA.pyc >= yb || CidadaoA.pyb <= yc){
				xmriiab = false;
			}else{xmriiab = true;}
		}
		if(CidadaoA.mv == "c"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyc > yb || CidadaoA.pyb <= yc && CidadaoA.pyc < yc){
				ymriab = false;
			}else{ymriab = true;}
		}
		if(CidadaoA.mv == "b"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyb < yc || CidadaoA.pyc >= yb && CidadaoA.pyb > yb){
				ymriiab = false;
			}else{ymriiab = true;}
		}
	}
	public void Cenariomiaba(int xe,int xd,int yc,int yb){
		//if(AvatarA.x >= Canva.xparedei && AvatarA.x <= Canva.xparedeii && AvatarA.y >= Canva.yparedei && AvatarA.y <= Canva.yparedeii){
		if(CidadaoA.mv == "e"){
			if(CidadaoA.pxd <= xe && CidadaoA.pxe < xe|| CidadaoA.pxe > xd+20 || CidadaoA.pyc >= yb || CidadaoA.pyb <= yc){
				xmriaba = false;
			}else{xmriaba = true;}
		}
		if(CidadaoA.mv == "d"){
			if(CidadaoA.pxd < xe || CidadaoA.pxe >= xd && CidadaoA.pxd > xd || CidadaoA.pyc >= yb || CidadaoA.pyb <= yc){
				xmriiaba = false;
			}else{xmriiaba = true;}
		}
		if(CidadaoA.mv == "c"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyc > yb || CidadaoA.pyb <= yc && CidadaoA.pyc < yc){
				ymriaba = false;
			}else{ymriaba = true;}
		}
		if(CidadaoA.mv == "b"){
			if(CidadaoA.pxd <= xe || CidadaoA.pxe >= xd || CidadaoA.pyb < yc || CidadaoA.pyc >= yb && CidadaoA.pyb > yb){
				ymriiaba = false;
			}else{ymriiaba = true;}
		}
	}
}