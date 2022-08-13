package BackEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import FrontEnd.casas;
import FrontEnd.gameWindow;

public class movementControl {
	static int ct = 0;
	static int delay = 150;
	static ActionListener taskPerformer = new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  if (players.movement[dados.turn] < 0)ct = ct - 1;
	    	  if (players.movement[dados.turn] > 0)ct = ct + 1;
	    	  
	    	  if(ct<0) {
	    		  move(40 + ct);
	    	  }else if(ct>=40) {
	    		  move(ct - 40);
	    	  } else {
	    		  move(ct);
	    	  }
    		  if(ct == players.plPosition[dados.turn]) {
	    		  properties.setState(players.plPosition[dados.turn]);
	    		  if (players.inPrison[dados.turn] == true) {
	    			  gameWindow.cardsCl.show(gameWindow.cardsPanel,("local"+String.valueOf(players.plPosition[dados.turn])));
	    			  casas.localCl[10].show(casas.local[10],"PPrisioner1");
	    			  JOptionPane.showMessageDialog(Main.f,"Estás na prisao.\n\nPaga $50 ou tira um double na tua vez\npara saires.","Prisão",JOptionPane.INFORMATION_MESSAGE);
	    		  } else {
	    			  gameWindow.cardsCl.show(gameWindow.cardsPanel,("local"+String.valueOf(players.plPosition[dados.turn])));
	    		  }
	    		  timer.stop();
	    	  }
	      }
	};
	static Timer timer = new Timer(delay, taskPerformer);
	
	public static void move(int where) {
		int b=0,l=0,t=0,r=0,c1x=0,c1y=0,c2x=0,c2y=0,c3x=0,c3y=0,c4x=0,c4y=0,c2xp=0,c2yp=0;
		
		if (dados.turn == 0) {b = 30;l = 0;	t = 0;r = 30;c1x = 80;c1y = 40;c2x = 0;c2y = 40;c3x = 40;c3y = 0;c4x = 40;c4y = 0; c2xp = 70; c2yp = 5;}
		if (dados.turn == 1) {b = 75;l = 45;t = 45;r = 75;c1x = 40;c1y = 80;c2x = 40;c2y = 80;c3x = 0;c3y = 40;c4x = 80;c4y = 40; c2xp = 35; c2yp = 40;}
		
		if (where == 0) {
			gameWindow.pl[dados.turn].setBounds(c1x,c1y,45,45);
			gameWindow.tabLocalConners[0].add(gameWindow.pl[dados.turn]);
			
			//melhorar
			if (players.inPrison[dados.turn] == true || players.movement[dados.turn] < 0) {
			} else {
				players.setMoney(200);
				JOptionPane.showMessageDialog(Main.f,"Recebeste $200 por passares pela casa de partida","Casa de partida",JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (where < 10) {
			where = where - 1;
			gameWindow.pl[dados.turn].setBounds(15,b,45,45);
			gameWindow.tabLocalBotton[where].add(gameWindow.pl[dados.turn]);
		} else if (where == 10) {
			if(players.inPrison[dados.turn] == false) {
				gameWindow.pl[dados.turn].setBounds(c2x,c2y,45,45);
				gameWindow.tabLocalConners[1].add(gameWindow.pl[dados.turn]);
			} else if(players.inPrison[dados.turn] == true) {
				gameWindow.pl[dados.turn].setBounds(c2xp,c2yp,45,45);
				gameWindow.tabLocalConners[1].add(gameWindow.pl[dados.turn]);
			}
		} else  if (where < 20) {
			where = where - 11;
			gameWindow.pl[dados.turn].setBounds(l,15,45,45);
			gameWindow.tabLocalLeft[where].add(gameWindow.pl[dados.turn]);
		} else if (where == 20) {
			gameWindow.pl[dados.turn].setBounds(c3x,c3y,45,45);
			gameWindow.tabLocalConners[2].add(gameWindow.pl[dados.turn]);
		} else  if (where < 30) {
			where = where - 21;
			gameWindow.pl[dados.turn].setBounds(15,t,45,45);
			gameWindow.tabLocalTop[where].add(gameWindow.pl[dados.turn]);
		} else if (where == 30) {
			gameWindow.pl[dados.turn].setBounds(c4x,c4y,45,45);
			gameWindow.tabLocalConners[3].add(gameWindow.pl[dados.turn]);
		} else  if (where < 40) {
			where = where - 31;
			gameWindow.pl[dados.turn].setBounds(r,15,45,45);
			gameWindow.tabLocalRight[where].add(gameWindow.pl[dados.turn]);
		}
		gameWindow.tabuleiro.validate();
		gameWindow.tabuleiro.repaint();
	}
}


