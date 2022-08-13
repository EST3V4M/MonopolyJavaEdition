package BackEnd;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import FrontEnd.casas;
import FrontEnd.gameWindow;

public class dados {	
	static int[] dados = {0,0};;
	static int dadoFinal = 0;
	
	public static int turn = 0;
	
	static int ct = 0;
	static int delay = 100;
	static ActionListener taskPerformer = new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  switch (ct) {
	    	  	case 0:
	    	  		gameWindow.dadosImg[0].setIcon(gameWindow.diceImg[1]);
	    	  		gameWindow.dadosImg[1].setIcon(gameWindow.diceImg[4]);
	    	  		break;
	      		case 1:
	      			gameWindow.dadosImg[0].setIcon(gameWindow.diceImg[3]);
	      			gameWindow.dadosImg[1].setIcon(gameWindow.diceImg[2]);
	      			break;
	      		case 2:
	      			gameWindow.dadosImg[0].setIcon(gameWindow.diceImg[5]);
	      			gameWindow.dadosImg[1].setIcon(gameWindow.diceImg[0]);
	      			break;
	      		case 3:
	      			gameWindow.dadosImg[0].setIcon(gameWindow.diceImg[0]);
	      			gameWindow.dadosImg[1].setIcon(gameWindow.diceImg[4]);
	      			break;
	      		case 4:
	      			gameWindow.dadosImg[0].setIcon(gameWindow.diceImg[2]);
	      			gameWindow.dadosImg[1].setIcon(gameWindow.diceImg[3]);
	      			break;
	      		case 5:
	      			gameWindow.dadosImg[0].setIcon(gameWindow.diceImg[4]);
	      			gameWindow.dadosImg[1].setIcon(gameWindow.diceImg[1]);
	      			break;
	      		case 6:
	      			gameWindow.dadosImg[0].setIcon(gameWindow.diceImg[dados[0]-1]);
	      			gameWindow.dadosImg[1].setIcon(gameWindow.diceImg[dados[1]-1]);
	      			gameWindow.valorDados.setText(""+dadoFinal);
	      			events.play();
	      			timer.stop();
	      		}
	    	  ct++;
	    	  if (ct == 7) ct = 0;
	      }
	};
	static Timer timer = new Timer(delay, taskPerformer);
	
	public static void rollDice() {
		gameWindow.dado.setEnabled(false);
		gameWindow.dadosP.setBackground(new Color(148, 1, 1));
		dados[0] = (int) (1+ (Math.random() * 6));
		dados[1] = (int) (1+ (Math.random() * 6));
		dadoFinal = dados[0] + dados[1];
		timer.start();
	}
	
	public static void changeTurn() {
		gameWindow.dado.setEnabled(true);
		gameWindow.dadosP.setBackground(new Color(40, 148, 1));
		turn++;
		if (turn == 2)turn = 0;
		if (turn == 0) {
			gameWindow.colors[0].setBackground(new Color(255, 255, 0));
			gameWindow.colors[1].setBackground(new Color(0, 160, 0));
		}else if (turn == 1) {
			gameWindow.colors[1].setBackground(new Color(0, 255, 0));
			gameWindow.colors[0].setBackground(new Color(160, 160, 0));
		}
		
		//melhorar
		if (players.inPrison[turn] == true) {
			casas.localCl[10].show(casas.local[10],"PPrisioner");
			gameWindow.cardsCl.show(gameWindow.cardsPanel,("local"+String.valueOf(players.plPosition[turn])));

		}

		
	}
	
	public static void setTurn() {
		int d1,d2;
		int[] pl = {0,0};
		for (int ct = 0; ct<2; ct++) {
			d1 = (int) (1+ (Math.random() * 6));
			d2 = (int) (1+ (Math.random() * 6));
			pl[ct] = d1 + d2;
		}
		if (pl[0] > pl[1]) {
			turn = 1;
		}
		if (pl[0] < pl[1]) {
			turn = 0;
		}
		changeTurn();
	}
}
