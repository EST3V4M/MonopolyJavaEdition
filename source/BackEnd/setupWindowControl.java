package BackEnd;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

import FrontEnd.gameWindow;
import FrontEnd.setupWindow;

public class setupWindowControl implements ActionListener{
	static int toLockPl1 = 0, toUnlockPl1 = 0;
	static int toLockPl2 = 0, toUnlockPl2 = 0;
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == setupWindow.pl1TokenBts[1]) {
			tokenLock(1,1);
			setupWindow.pl1TokenBts[1].setBackground(Color.yellow);
			setupWindow.pl1TokenBts[toUnlockPl1].setBackground(Color.white);
			setupWindow.pl2TokenBts[toLockPl1].setEnabled(false);
			setupWindow.pl2TokenBts[toUnlockPl1].setEnabled(true);
			setLast();
			players.plToken[0] = 1;
		}
        if (e.getSource() == setupWindow.pl1TokenBts[2]) {
			tokenLock(1,2);
			setupWindow.pl1TokenBts[2].setBackground(Color.yellow);
			setupWindow.pl1TokenBts[toUnlockPl1].setBackground(Color.white);
			setupWindow.pl2TokenBts[toLockPl1].setEnabled(false);
			setupWindow.pl2TokenBts[toUnlockPl1].setEnabled(true);
			setLast();
			players.plToken[0] = 2;
		}
        if (e.getSource() == setupWindow.pl1TokenBts[3]) {
			tokenLock(1,3);
			setupWindow.pl1TokenBts[3].setBackground(Color.yellow);
			setupWindow.pl1TokenBts[toUnlockPl1].setBackground(Color.white);
			setupWindow.pl2TokenBts[toLockPl1].setEnabled(false);
			setupWindow.pl2TokenBts[toUnlockPl1].setEnabled(true);
			setLast();
			players.plToken[0] = 3;
		}
        if (e.getSource() == setupWindow.pl1TokenBts[4]) {
			tokenLock(1,4);
			setupWindow.pl1TokenBts[4].setBackground(Color.yellow);
			setupWindow.pl1TokenBts[toUnlockPl1].setBackground(Color.white);
			setupWindow.pl2TokenBts[toLockPl1].setEnabled(false);
			setupWindow.pl2TokenBts[toUnlockPl1].setEnabled(true);
			setLast();
			players.plToken[0] = 4;
		}
        if (e.getSource() == setupWindow.pl1TokenBts[5]) {
			tokenLock(1,5);
			setupWindow.pl1TokenBts[5].setBackground(Color.yellow);
			setupWindow.pl1TokenBts[toUnlockPl1].setBackground(Color.white);
			setupWindow.pl2TokenBts[toLockPl1].setEnabled(false);
			setupWindow.pl2TokenBts[toUnlockPl1].setEnabled(true);
			setLast();
			players.plToken[0] = 5;
		}
        if (e.getSource() == setupWindow.pl1TokenBts[6]) {
			tokenLock(1,6);
			setupWindow.pl1TokenBts[6].setBackground(Color.yellow);
			setupWindow.pl1TokenBts[toUnlockPl1].setBackground(Color.white);
			setupWindow.pl2TokenBts[toLockPl1].setEnabled(false);
			setupWindow.pl2TokenBts[toUnlockPl1].setEnabled(true);
			setLast();
			players.plToken[0] = 6;
		}
        if (e.getSource() == setupWindow.pl1TokenBts[7]) {
			tokenLock(1,7);
			setupWindow.pl1TokenBts[7].setBackground(Color.yellow);
			setupWindow.pl1TokenBts[toUnlockPl1].setBackground(Color.white);
			setupWindow.pl2TokenBts[toLockPl1].setEnabled(false);
			setupWindow.pl2TokenBts[toUnlockPl1].setEnabled(true);
			setLast();
			players.plToken[0] = 7;
		}
        if (e.getSource() == setupWindow.pl1TokenBts[8]) {
			tokenLock(1,8);
			setupWindow.pl1TokenBts[8].setBackground(Color.yellow);
			setupWindow.pl1TokenBts[toUnlockPl1].setBackground(Color.white);
			setupWindow.pl2TokenBts[toLockPl1].setEnabled(false);
			setupWindow.pl2TokenBts[toUnlockPl1].setEnabled(true);
			setLast();
			players.plToken[0] = 8;
		}
        
        
        
        if (e.getSource() == setupWindow.pl2TokenBts[1]) {
			tokenLock(2,1);
			setupWindow.pl2TokenBts[1].setBackground(Color.green);
			setupWindow.pl2TokenBts[toUnlockPl2].setBackground(Color.white);
			setupWindow.pl1TokenBts[toLockPl2].setEnabled(false);
			setupWindow.pl1TokenBts[toUnlockPl2].setEnabled(true);
			setLast();
			players.plToken[1] = 1;
		} 
        if (e.getSource() == setupWindow.pl2TokenBts[2]) {
			tokenLock(2,2);
			setupWindow.pl2TokenBts[2].setBackground(Color.green);
			setupWindow.pl2TokenBts[toUnlockPl2].setBackground(Color.white);
			setupWindow.pl1TokenBts[toLockPl2].setEnabled(false);
			setupWindow.pl1TokenBts[toUnlockPl2].setEnabled(true);
			setLast();
			players.plToken[1] = 2;
		} 
        if (e.getSource() == setupWindow.pl2TokenBts[3]) {
			tokenLock(2,3);
			setupWindow.pl2TokenBts[3].setBackground(Color.green);
			setupWindow.pl2TokenBts[toUnlockPl2].setBackground(Color.white);
			setupWindow.pl1TokenBts[toLockPl2].setEnabled(false);
			setupWindow.pl1TokenBts[toUnlockPl2].setEnabled(true);
			setLast();
			players.plToken[1] = 3;
		} 
        if (e.getSource() == setupWindow.pl2TokenBts[4]) {
			tokenLock(2,4);
			setupWindow.pl2TokenBts[4].setBackground(Color.green);
			setupWindow.pl2TokenBts[toUnlockPl2].setBackground(Color.white);
			setupWindow.pl1TokenBts[toLockPl2].setEnabled(false);
			setupWindow.pl1TokenBts[toUnlockPl2].setEnabled(true);
			setLast();
			players.plToken[1] = 4;
		} 
        if (e.getSource() == setupWindow.pl2TokenBts[5]) {
			tokenLock(2,5);
			setupWindow.pl2TokenBts[5].setBackground(Color.green);
			setupWindow.pl2TokenBts[toUnlockPl2].setBackground(Color.white);
			setupWindow.pl1TokenBts[toLockPl2].setEnabled(false);
			setupWindow.pl1TokenBts[toUnlockPl2].setEnabled(true);
			setLast();
			players.plToken[1] = 5;
		}
        if (e.getSource() == setupWindow.pl2TokenBts[6]) {
			tokenLock(2,6);
			setupWindow.pl2TokenBts[6].setBackground(Color.green);
			setupWindow.pl2TokenBts[toUnlockPl2].setBackground(Color.white);
			setupWindow.pl1TokenBts[toLockPl2].setEnabled(false);
			setupWindow.pl1TokenBts[toUnlockPl2].setEnabled(true);
			setLast();
			players.plToken[1] = 6;
		} 
        if (e.getSource() == setupWindow.pl2TokenBts[7]) {
			tokenLock(2,7);
			setupWindow.pl2TokenBts[7].setBackground(Color.green);
			setupWindow.pl2TokenBts[toUnlockPl2].setBackground(Color.white);
			setupWindow.pl1TokenBts[toLockPl2].setEnabled(false);
			setupWindow.pl1TokenBts[toUnlockPl2].setEnabled(true);
			setLast();
			players.plToken[1] = 7;
		}
        if (e.getSource() == setupWindow.pl2TokenBts[8]) {
			tokenLock(2,8);
			setupWindow.pl2TokenBts[8].setBackground(Color.green);
			setupWindow.pl2TokenBts[toUnlockPl2].setBackground(Color.white);
			setupWindow.pl1TokenBts[toLockPl2].setEnabled(false);
			setupWindow.pl1TokenBts[toUnlockPl2].setEnabled(true);
			setLast();
			players.plToken[1] = 8;
		}
        
        
        if (e.getSource() == setupWindow.voltar) {
        	Main.cl.show(Main.p, "1");
        }
        if (e.getSource() == setupWindow.comecar) {
			if (setupWindow.plName[0].getText().equals("") || players.plToken[0] == 0 || setupWindow.plName[1].getText().equals("") || players.plToken[1] == 0 || setupWindow.plName[0].getText().equals(setupWindow.plName[1].getText())) {
				String pl1n_erro = "",pl1t_erro = "",pl2n_erro = "",pl2t_erro = "", equaln_erro = "";
				if (setupWindow.plName[0].getText().equals("")) {
					pl1n_erro = "\nO Jogador 1 não tem nome.";
				}
				if (players.plToken[0] == 0) {
					pl1t_erro = "\nO Jogador 1 não tem token.";
				}
				if (setupWindow.plName[1].getText().equals("")) {
					pl2n_erro = "\nO Jogador 2 não tem nome.";
				}
				if (players.plToken[1] == 0) {
					pl2t_erro = "\nO Jogador 2 não tem token.";	
				}
				if (!setupWindow.plName[0].getText().equals("") && !setupWindow.plName[1].getText().equals("")) {
					if (setupWindow.plName[0].getText().equals(setupWindow.plName[1].getText()) ) {
						equaln_erro = "\nOs jogadores tem o nome igual.";
					}
				}
				JOptionPane.showMessageDialog(Main.f,pl1n_erro+pl1t_erro+pl2n_erro+pl2t_erro+equaln_erro,"Dados Inválidos",JOptionPane.ERROR_MESSAGE);
			} else { 
				players.setName();
				players.setToken();
				dados.setTurn();
				gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
				Main.cl.show(Main.p, "3");
				JOptionPane.showMessageDialog(Main.f,players.plName[dados.turn]+" é o(a) primeiro(a) a jogar!\n(Gerado aleatoriamente)","Primeiro a  jogar",JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
	
	static public void tokenLock(int player, int token) {
		if (player == 1) {
			if (token == toUnlockPl1) {
				toUnlockPl1 = 0;
			} else {
				switch (token) {
					case 1:
						toLockPl1 = 1;
						break;
					case 2:
						toLockPl1 = 2;
						break;
					case 3:
						toLockPl1 = 3;
						break;
					case 4:
						toLockPl1 = 4;
						break;
					case 5:
						toLockPl1 = 5;
						break;
					case 6:
						toLockPl1 = 6;
						break;
					case 7:
						toLockPl1 = 7;
						break;
					case 8:
						toLockPl1 = 8;
						break;
				}
			}
		} else if (player == 2) {
			if (token == toUnlockPl2) {
				toUnlockPl2 = 0;
			} else {
				switch (token) {
					case 1:
						toLockPl2 = 1;
						break;
					case 2:
						toLockPl2 = 2;
						break;
					case 3:
						toLockPl2 = 3;
						break;
					case 4:
						toLockPl2 = 4;
						break;
					case 5:
						toLockPl2 = 5;
						break;
					case 6:
						toLockPl2 = 6;
						break;
					case 7:
						toLockPl2 = 7;
						break;
					case 8:
						toLockPl2 = 8;
						break;
				}
			}
		}
	}
	
	public static void setLast() {
		toUnlockPl1 = toLockPl1;
		toUnlockPl2 = toLockPl2;
	}
}
