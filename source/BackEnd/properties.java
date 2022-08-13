package BackEnd;

import FrontEnd.casas;
import FrontEnd.gameWindow;

public class properties {
	static boolean[] pl1Properties = {
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
	};
	static boolean[] pl2Properties = {
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
			false,
	};
	
	public static void buy(int who,int propertie) {
		if(who==0) {
			pl1Properties[propertie] = true;
			checkPropertie(propertie);
			casas.owner[propertie].setText(players.plName[0]);
		}else if(who==1) {
			pl2Properties[propertie] = true;	
			checkPropertie(propertie);
			casas.owner[propertie].setText(players.plName[1]);
		}
	}
	
	public static void setState(int where) {
		int propertie = 0;
		switch (where) {
			case 1:
				propertie = 0;
				break;
			case 3:
				propertie = 1;
				break;
			case 5:
				propertie = 2;
				break;
			case 6:
				propertie = 3;
				break;
			case 8:
				propertie = 4;
				break;
			case 9:
				propertie = 5;
				break;
			case 11:
				propertie = 6;
				break;
			case 12:
				propertie = 7;
				break;
			case 13:
				propertie = 8;
				break;
			case 14:
				propertie = 9;
				break;
			case 15:
				propertie = 10;
				break;
			case 16:
				propertie = 11;
				break;
			case 18:
				propertie = 12;
				break;
			case 19:
				propertie = 13;
				break;
			case 21:
				propertie = 14;
				break;
			case 23:
				propertie = 15;
				break;
			case 24:
				propertie = 16;
				break;
			case 25:
				propertie = 17;
				break;
			case 26:
				propertie = 18;
				break;
			case 27:
				propertie = 19;
				break;
			case 28:
				propertie = 20;
				break;
			case 29:
				propertie = 21;
				break;
			case 31:
				propertie = 22;
				break;
			case 32:
				propertie = 23;
				break;
			case 34:
				propertie = 24;
				break;
			case 35:
				propertie = 25;
				break;
			case 37:
				propertie = 26;
				break;
			case 39:
				propertie = 27;
				break;
		}
		casas.rentPrice[propertie].setText("$"+events.rentValue(propertie));
		if (where == 10) {
			if (players.inPrison[dados.turn] == true) {
				casas.localCl[where].show(casas.local[where],"PPrisioner");
			} else if (players.inPrison[dados.turn] == false) {
				casas.localCl[where].show(casas.local[where],"PVisitant");
			}
		} else {
			if(dados.turn == 0) {
				if(pl1Properties[propertie] == true) {
					casas.localCl[where].show(casas.local[where],"mine");
				} else if (pl2Properties[propertie] == true) {
					casas.localCl[where].show(casas.local[where],"his");
				} else if (pl1Properties[propertie] == false &&  pl2Properties[propertie] == false) {
					casas.localCl[where].show(casas.local[where],"notOwned");
				}
			}
			if(dados.turn == 1) {
				if(pl2Properties[propertie] == true) {
					casas.localCl[where].show(casas.local[where],"mine");
				} else if (pl1Properties[propertie] == true) {
					casas.localCl[where].show(casas.local[where],"his");
				} else if (pl1Properties[propertie] == false &&  pl2Properties[propertie] == false) {
					casas.localCl[where].show(casas.local[where],"notOwned");
				}
			}
		}
	}
	
	public static void checkPropertie(int where) {
		switch (where) {
			case 0:
				where = 0;
				break;
			case 1:
				where = 1;
				break;
			case 2:
				where = 22;
				break;
			case 3:
				where = 2;
				break;
			case 4:
				where = 3;
				break;
			case 5:
				where = 4;
				break;
			case 6:
				where = 5;
				break;
			case 7:
				where = 26;
				break;
			case 8:
				where = 6;
				break;
			case 9:
				where = 7;
				break;
			case 10:
				where = 23;
				break;
			case 11:
				where = 8;
				break;
			case 12:
				where = 9;
				break;
			case 13:
				where = 10;
				break;
			case 14:
				where = 11;
				break;
			case 15:
				where = 12;
				break;
			case 16:
				where = 13;
				break;
			case 17:
				where = 24;
				break;
			case 18:
				where = 14;
				break;
			case 19:
				where = 15;
				break;
			case 20:
				where = 27;
				break;
			case 21:
				where = 16;
				break;
			case 22:
				where = 17;
				break;
			case 23:
				where = 18;
				break;
			case 24:
				where = 19;
				break;
			case 25:
				where = 20;
				break;
			case 26:
				where = 21;
				break;
			case 27:
				where = 22;
				break;
		}
		if(dados.turn==0) {
			gameWindow.pl1OwnedProperties[where].setSelected(true);
		}
		
		if(dados.turn==1) {
			gameWindow.pl2OwnedProperties[where].setSelected(true);
		}
	}
}
