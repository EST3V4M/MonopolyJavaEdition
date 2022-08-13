package BackEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import FrontEnd.casas;
import FrontEnd.gameWindow;
import FrontEnd.menuBar;

public class events implements ActionListener{
	public static void play() {
		if (players.inPrison[dados.turn] == true) {
			if(dados.dados[0] == dados.dados[1]) {
				players.inPrison[dados.turn] = false;
				gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
				JOptionPane.showMessageDialog(Main.f,"Saiste da prisão","Prisão",JOptionPane.INFORMATION_MESSAGE);
				players.setPosition(dados.dadoFinal);
  			gameWindow.cardsCl.show(gameWindow.cardsPanel,("local"+String.valueOf(players.plPosition[dados.turn])));
  			properties.setState(players.plPosition[dados.turn]);
			} else if (dados.dados[0] != dados.dados[1]){
				gameWindow.cardsCl.show(gameWindow.cardsPanel,("local"+String.valueOf(players.plPosition[dados.turn])));
				if(dados.turn == 0) {
					if (players.inPrison[1] == true) {
						casas.localCl[10].show(casas.local[10],"PPrisioner");
					}
				} else if (dados.turn == 1) {
					if (players.inPrison[0] == true) {
						casas.localCl[10].show(casas.local[10],"PPrisioner");
					}
				}
				casas.localCl[10].show(casas.local[10],"PPrisioner1");
				JOptionPane.showMessageDialog(Main.f,"Constinuas na prisao","Prisão",JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (players.inPrison[dados.turn] == false) {
			players.setPosition(dados.dadoFinal);
		}
	}
	
	public static void chance() {
		int card = (int) (Math.random() * 5);
		switch (card) {
			case 0:
				JOptionPane.showMessageDialog(Main.f,"paga $15","Chance",JOptionPane.INFORMATION_MESSAGE);
				players.setMoney(-15);
				gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
				dados.changeTurn();
				break;
			case 1:
				JOptionPane.showMessageDialog(Main.f,"paga 50","Chance",JOptionPane.INFORMATION_MESSAGE);
				players.setMoney(-50);
				gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
				dados.changeTurn();
				break;
			case 2:
				JOptionPane.showMessageDialog(Main.f,"recebe 50","Chance",JOptionPane.INFORMATION_MESSAGE);
				players.setMoney(50);
				gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
				dados.changeTurn();
				break;
			case 3:
				JOptionPane.showMessageDialog(Main.f,"recebe 150","Chance",JOptionPane.INFORMATION_MESSAGE);
				players.setMoney(150);
				gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
				dados.changeTurn();
				break;
			case 4:
				JOptionPane.showMessageDialog(Main.f,"moveste 3 casa para tras","Chance",JOptionPane.INFORMATION_MESSAGE);
				players.setPosition(-3);
				break;
			case 5:
				JOptionPane.showMessageDialog(Main.f,"vai para a prisao","Chance",JOptionPane.INFORMATION_MESSAGE);
				goToPrison();
				break;
			/*case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			case 13:
				break;
			case 14:
				break;
			case 15:
				break;*/
		}
	}
	
	public static void chest() {
		int card = (int) (Math.random() * 4);
		switch (card) {
			case 0:
				JOptionPane.showMessageDialog(Main.f,"paga 15","Sorte",JOptionPane.INFORMATION_MESSAGE);
				players.setMoney(-15);
				gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
				dados.changeTurn();
				break;
			case 1:
				JOptionPane.showMessageDialog(Main.f,"paga 50","Sorte",JOptionPane.INFORMATION_MESSAGE);
				players.setMoney(-50);
				gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
				dados.changeTurn();
				break;
			case 2:
				JOptionPane.showMessageDialog(Main.f,"recebe 50","Sorte",JOptionPane.INFORMATION_MESSAGE);
				players.setMoney(50);
				gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
				dados.changeTurn();
				break;
			case 3:
				JOptionPane.showMessageDialog(Main.f,"recebe 150","Sorte",JOptionPane.INFORMATION_MESSAGE);
				players.setMoney(150);
				gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
				dados.changeTurn();
				break;
			case 4:
				JOptionPane.showMessageDialog(Main.f,"anda 3 casas para tras","Sorte",JOptionPane.INFORMATION_MESSAGE);
				players.setPosition(-3);
				break;
			case 5:
				JOptionPane.showMessageDialog(Main.f,"vai para a prisao","Sorte",JOptionPane.INFORMATION_MESSAGE);
				goToPrison();
				break;
			/*case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			case 13:
				break;
			case 14:
				break;
			case 15:
				break;*/
		}
	}
	
	public static void goToPrison() {
		players.inPrison[dados.turn] = true;
		players.setPosition((40-players.plPosition[dados.turn])+10);
		gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
	}
	
	public static void setBuy(int propertie) {
		if (players.plMoney[dados.turn] >= propertieValue(propertie)) {
			JOptionPane.showMessageDialog(Main.f,"Parabem!\nEsta propriedade agora é tua.","Propriedade adquirida",JOptionPane.INFORMATION_MESSAGE);
			properties.buy(dados.turn,propertie);
			players.plMoney[dados.turn] = players.plMoney[dados.turn] - propertieValue(propertie);
			gameWindow.plMoney[dados.turn].setText("$"+String.valueOf(players.plMoney[dados.turn]));
		} else {
			JOptionPane.showMessageDialog(Main.f,"Não tens dinheiro suficiente para comprar esta propriedade","Fundos insuficientes",JOptionPane.INFORMATION_MESSAGE);
		}
		gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
		dados.changeTurn();
	}
	
	public static int propertieValue(int propertie) {
		int value = 0;
		switch (propertie) {
			case 0:
				value = 60;
				break;
			case 1:
				value = 60;
				break;
			case 2:
				value = 200;
				break;
			case 3:
				value = 100;
				break;
			case 4:
				value = 100;
				break;
			case 5:
				value = 120;
				break;
			case 6:
				value = 140;
				break;
			case 7:
				value = 150;
				break;
			case 8:
				value = 140;
				break;
			case 9:
				value = 160;
				break;
			case 10:
				value = 200;
				break;
			case 11:
				value = 180;
				break;
			case 12:
				value = 180;
				break;
			case 13:
				value = 200;
				break;
			case 14:
				value = 220;
				break;
			case 15:
				value = 220;
				break;
			case 16:
				value = 240;
				break;
			case 17:
				value = 200;
				break;
			case 18:
				value = 260;
				break;
			case 19:
				value = 260;
				break;
			case 20:
				value = 150;
				break;
			case 21:
				value = 280;
				break;
			case 22:
				value = 300;
				break;
			case 23:
				value = 300;
				break;
			case 24:
				value = 320;
				break;
			case 25:
				value = 200;
				break;
			case 26:
				value = 350;
				break;
			case 27:
				value = 400;
				break;
		}
		return value;
	}

	public static boolean haveHouse[] = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
	public void buyHouse(int propertie){
		haveHouse[propertie] = true;
		JOptionPane.showMessageDialog(Main.f,"Compraste uma casa por $50\n\nAs casa duplicam o valor\no valor da renda das\ntuas propriedades","Casa",JOptionPane.INFORMATION_MESSAGE);
		players.setMoney(-50);
	}
	
	public static void payRent(int propertie){
		if (dados.turn == 0) {
			players.plMoney[0] = players.plMoney[0] - rentValue(propertie);
			players.plMoney[1] = players.plMoney[1] + rentValue(propertie);
		} else if (dados.turn == 1) {
			players.plMoney[1] = players.plMoney[1] - rentValue(propertie);
			players.plMoney[0] = players.plMoney[0] + rentValue(propertie);
		}
		JOptionPane.showMessageDialog(Main.f,"Pagaste $"+rentValue(propertie),"Pagamento da renda",JOptionPane.INFORMATION_MESSAGE);
		gameWindow.plMoney[0].setText(String.valueOf(players.plMoney[0]));
		gameWindow.plMoney[1].setText(String.valueOf(players.plMoney[1]));
		gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
		dados.changeTurn();
	}
	
	public static int rentValue(int propertie) {
		int selected = propertie;
		int totalStations = 0;
		int totalServices = 0;
		switch (propertie) {
			case 0:
				propertie = 2;
				break;
			case 1:
				propertie = 4;
				break;
			case 3:
				propertie = 6;
				break;
			case 4:
				propertie = 6;
				break;
			case 5:
				propertie = 8;
				break;
			case 6:
				propertie = 10;
				break;
			case 8:
				propertie = 10;
				break;
			case 9:
				propertie = 12;
				break;
			case 11:
				propertie = 14;
				break;
			case 12:
				propertie = 14;
				break;
			case 13:
				propertie = 16;
				break;
			case 14:
				propertie = 18;
				break;
			case 15:
				propertie = 18;
				break;
			case 16:
				propertie = 20;
				break;
			case 18:
				propertie = 22;
				break;
			case 19:
				propertie = 22;
				break;
			case 21:
				propertie = 24;
				break;
			case 22:
				propertie = 26;
				break;
			case 23:
				propertie = 26;
				break;
			case 24:
				propertie = 28;
				break;
			case 26:
				propertie = 35;
				break;
			case 27:
				propertie = 50;
				break;
			default:
				if (propertie == 2 || propertie == 10 || propertie == 17 || propertie == 25) {
					if (dados.turn == 0) {
						if (properties.pl2Properties[2] == true) {
							totalStations++;
						}
						if (properties.pl2Properties[10] == true) {
							totalStations++;				
						}
						if (properties.pl2Properties[17] == true) {
							totalStations++;
						}
						if (properties.pl2Properties[25] == true) {
							totalStations++;
						}
			
					} else if (dados.turn == 1) {
						if (properties.pl1Properties[2] == true) {
							totalStations++;
						}
						if (properties.pl1Properties[10] == true) {
							totalStations++;				
						}
						if (properties.pl1Properties[17] == true) {
							totalStations++;
						}
						if (properties.pl1Properties[25] == true) {
							totalStations++;
						}
						
					}
				}
				if (totalStations == 1) {
					propertie = 25;
				} else if (totalStations == 2) {
					propertie = 50;
				} else if (totalStations == 3) {
					propertie = 100;
				} else if (totalStations == 4) {
					propertie = 200;
				}
				totalStations = 0;
				
				if (propertie == 7 || propertie == 20) {
					if (dados.turn == 0) {
						if (properties.pl2Properties[7] == true) {
							totalServices++;
						}
						if (properties.pl2Properties[20] == true) {
							totalServices++;				
						}
					} else if (dados.turn == 1) {
						if (properties.pl1Properties[7] == true) {
							totalServices++;
						}
						if (properties.pl1Properties[20] == true) {
							totalServices++;				
						}
					}
				}
				if (totalServices == 1) {
					propertie = 4*dados.dadoFinal;
				} else if (totalServices == 2) {
					propertie = 10*dados.dadoFinal;
				}
				totalServices = 0;
				
				break;
		}
		if (haveHouse[selected] == true)propertie = propertie * 2;
		return propertie;	
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuBar.exit) {
			System.gc();
			System.exit(0);
		}

		if (e.getSource() == menuBar.about) {
			JOptionPane.showMessageDialog(Main.f,"Monopoly Java Edition\n\nFeito por:\nAntónio Estevam, Francisco Enguiça e Ivo Sousa\nATEC - PI0919\n\nDesenvolvido no Eclipse IDE\nBaseado em Swing utilizando o JDK 14","Sobre",JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == menuBar.rules) {
			JOptionPane.showMessageDialog(Main.f,"Regras –\n" +
					"\n\n" +
					"\n\t1.\tCada jogador recebe $1500.\n" +
					"\n\t2.\tExistem 32 cartas no jogo, sendo elas 16 do cofre e 16 da sorte.\n" +
					"\n\t3.\tCada Jogador deverá colocar o seu nome e escolher 1 peão\n" +
					"\n\t4.\tSempre que cair numa propriedade sem dono tem a opção de a comprar ou passar.\n" +
					"\n\t5.\tCada vez que o jogador cai na propriedade do outro jogador, paga uma renda.\n" +
					"\n\t6.\tAo cair em casas com simbolos ( “?” ou “bau”) irá receber uma carta de Sorte do Cofre.\n" +
					"\n\t7.\tQuando o jogador cair na casa “Income Tax” tem de pagar ao banco $200.\n" +
					"\n\t8.\tQuando o jogodaor cair na casa “Luxury Tax” tem de pagar $100 ao banco.\n" +
					"\n\t9.\tNa casa “Free Parking” não é cobrada nenhuma taxa.\n" +
					"\n\t10.\tEnquanto o jogador estiver na Cadeia não consegue se mover da casa, só consegue sair de lá quando pagar $50 ou sair Dados Duplos.\n" +
					"\n\t11.\tNa casa “Ponto de Partida” o jogador sempre que passer por lá recebe um bonus de $200.\n" +
					"\n\t12.\tO jogo termina quando um dos jogadores tiver saldo igual ou menor que $0.","Regras",JOptionPane.INFORMATION_MESSAGE);
		}

		if(e.getSource() == gameWindow.dado) {
			dados.rollDice();
		}
		
		if (e.getSource() == casas.passar[0] || e.getSource() == casas.passar[1] || e.getSource() == casas.passar[2] || e.getSource() == casas.passar[3] || e.getSource() == casas.passar[4] || e.getSource() == casas.passar[5] || e.getSource() == casas.passar[6] || e.getSource() == casas.passar[7] || e.getSource() == casas.passar[8] || e.getSource() == casas.passar[9] || e.getSource() == casas.passar[10] || e.getSource() == casas.passar[11] || e.getSource() == casas.passar[12] || e.getSource() == casas.passar[13] || e.getSource() == casas.passar[14] || e.getSource() == casas.passar[15] || e.getSource() == casas.passar[16] || e.getSource() == casas.passar[17] || e.getSource() == casas.passar[18] || e.getSource() == casas.passar[19] || e.getSource() == casas.passar[20] || e.getSource() == casas.passar[21] || e.getSource() == casas.passar[22] || e.getSource() == casas.passar[23] || e.getSource() == casas.passar[24] || e.getSource() == casas.passar[25] || e.getSource() == casas.passar[26] || e.getSource() == casas.passar[27]) {
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
		}
		
		if (e.getSource() == casas.comprar[0]) {
			setBuy(0);
		}
		if (e.getSource() == casas.comprar[1]) {
			setBuy(1);
		}
		if (e.getSource() == casas.comprar[2]) {
			setBuy(2);
		}
		if (e.getSource() == casas.comprar[3]) {
			setBuy(3);
		}
		if (e.getSource() == casas.comprar[4]) {
			setBuy(4);
		}
		if (e.getSource() == casas.comprar[5]) {
			setBuy(5);
		}
		if (e.getSource() == casas.comprar[6]) {
			setBuy(6);
		}
		if (e.getSource() == casas.comprar[7]) {
			setBuy(7);
		}
		if (e.getSource() == casas.comprar[8]) {
			setBuy(8);
		}
		if (e.getSource() == casas.comprar[9]) {
			setBuy(9);
		}
		if (e.getSource() == casas.comprar[10]) {
			setBuy(10);
		}
		if (e.getSource() == casas.comprar[11]) {
			setBuy(11);
		}
		if (e.getSource() == casas.comprar[12]) {
			setBuy(12);
		}
		if (e.getSource() == casas.comprar[13]) {
			setBuy(13);
		}
		if (e.getSource() == casas.comprar[14]) {
			setBuy(14);
		}
		if (e.getSource() == casas.comprar[15]) {
			setBuy(15);
		}
		if (e.getSource() == casas.comprar[16]) {
			setBuy(16);
		}
		if (e.getSource() == casas.comprar[17]) {
			setBuy(17);
		}
		if (e.getSource() == casas.comprar[18]) {
			setBuy(18);
		}
		if (e.getSource() == casas.comprar[19]) {
			setBuy(19);
		}
		if (e.getSource() == casas.comprar[20]) {
			setBuy(20);
		}
		if (e.getSource() == casas.comprar[21]) {
			setBuy(21);
		}
		if (e.getSource() == casas.comprar[22]) {
			setBuy(22);
		}
		if (e.getSource() == casas.comprar[23]) {
			setBuy(23);
		}
		if (e.getSource() == casas.comprar[24]) {
			setBuy(24);
		}
		if (e.getSource() == casas.comprar[25]) {
			setBuy(25);
		}
		if (e.getSource() == casas.comprar[26]) {
			setBuy(26);
		}
		if (e.getSource() == casas.comprar[27]) {
			setBuy(27);
		}
		
		
		if(e.getSource() == casas.hisContinuar[0]) {
			payRent(0);
		}
		if(e.getSource() == casas.hisContinuar[1]) {
			payRent(1);
		}
		if(e.getSource() == casas.hisContinuar[2]) {
			payRent(2);
		}
		if(e.getSource() == casas.hisContinuar[3]) {
			payRent(3);
		}
		if(e.getSource() == casas.hisContinuar[4]) {
			payRent(4);
		}
		if(e.getSource() == casas.hisContinuar[5]) {
			payRent(5);
		}
		if(e.getSource() == casas.hisContinuar[6]) {
			payRent(6);
		}
		if(e.getSource() == casas.hisContinuar[7]) {
			payRent(7);
		}
		if(e.getSource() == casas.hisContinuar[8]) {
			payRent(8);
		}
		if(e.getSource() == casas.hisContinuar[9]) {
			payRent(9);
		}
		if(e.getSource() == casas.hisContinuar[10]) {
			payRent(10);
		}
		if(e.getSource() == casas.hisContinuar[11]) {
			payRent(11);
		}
		if(e.getSource() == casas.hisContinuar[12]) {
			payRent(12);
		}
		if(e.getSource() == casas.hisContinuar[13]) {
			payRent(13);
		}
		if(e.getSource() == casas.hisContinuar[14]) {
			payRent(14);
		}
		if(e.getSource() == casas.hisContinuar[15]) {
			payRent(15);
		}
		if(e.getSource() == casas.hisContinuar[16]) {
			payRent(16);
		}
		if(e.getSource() == casas.hisContinuar[17]) {
			payRent(17);
		}
		if(e.getSource() == casas.hisContinuar[18]) {
			payRent(18);
		}
		if(e.getSource() == casas.hisContinuar[19]) {
			payRent(19);
		}
		if(e.getSource() == casas.hisContinuar[20]) {
			payRent(20);
		}
		if(e.getSource() == casas.hisContinuar[21]) {
			payRent(21);
		}
		if(e.getSource() == casas.hisContinuar[22]) {
			payRent(22);
		}
		if(e.getSource() == casas.hisContinuar[23]) {
			payRent(23);
		}
		if(e.getSource() == casas.hisContinuar[24]) {
			payRent(24);
		}
		if(e.getSource() == casas.hisContinuar[25]) {
			payRent(25);
		}
		if(e.getSource() == casas.hisContinuar[26]) {
			payRent(26);
		}
		if(e.getSource() == casas.hisContinuar[27]) {
			payRent(27);
		}
		
		
		if (e.getSource() == casas.mineContinuar[0] || e.getSource() == casas.mineContinuar[1] || e.getSource() == casas.mineContinuar[2] || e.getSource() == casas.mineContinuar[3] || e.getSource() == casas.mineContinuar[4] || e.getSource() == casas.mineContinuar[5] || e.getSource() == casas.mineContinuar[6] || e.getSource() == casas.mineContinuar[7] || e.getSource() == casas.mineContinuar[8] || e.getSource() == casas.mineContinuar[9] || e.getSource() == casas.mineContinuar[10] || e.getSource() == casas.mineContinuar[11] || e.getSource() == casas.mineContinuar[12] || e.getSource() == casas.mineContinuar[13] || e.getSource() == casas.mineContinuar[14] || e.getSource() == casas.mineContinuar[15] || e.getSource() == casas.mineContinuar[16] || e.getSource() == casas.mineContinuar[17] || e.getSource() == casas.mineContinuar[18] || e.getSource() == casas.mineContinuar[19] || e.getSource() == casas.mineContinuar[20] || e.getSource() == casas.mineContinuar[21] || e.getSource() == casas.mineContinuar[22] || e.getSource() == casas.mineContinuar[23] || e.getSource() == casas.mineContinuar[24] || e.getSource() == casas.mineContinuar[25] || e.getSource() == casas.mineContinuar[26] || e.getSource() == casas.mineContinuar[27]) {
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
		}
		
		if(e.getSource() == casas.mineBuyHouse[0]) {
			buyHouse(0);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[0].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[0].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[1]) {
			buyHouse(1);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[1].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[1].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[2]) {
			buyHouse(3);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[2].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[2].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[3]) {
			buyHouse(4);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[3].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[3].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[4]) {
			buyHouse(5);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[4].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[4].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[5]) {
			buyHouse(6);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[5].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[5].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[6]) {
			buyHouse(8);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[6].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[6].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[7]) {
			buyHouse(9);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[7].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[7].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[8]) {
			buyHouse(11);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[8].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[8].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[9]) {
			buyHouse(12);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[9].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[9].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[10]) {
			buyHouse(13);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[10].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[10].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[11]) {
			buyHouse(14);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[11].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[11].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[12]) {
			buyHouse(15);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[12].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[12].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[13]) {
			buyHouse(16);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[13].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[13].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[14]) {
			buyHouse(18);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[14].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[14].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[15]) {
			buyHouse(19);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[15].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[15].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[16]) {
			buyHouse(21);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[16].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[16].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[17]) {
			buyHouse(22);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[17].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[17].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[18]) {
			buyHouse(23);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[18].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[18].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[19]) {
			buyHouse(24);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[19].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[19].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[20]) {
			buyHouse(26);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[20].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[20].setEnabled(false);
		}
		if(e.getSource() == casas.mineBuyHouse[21]) {
			buyHouse(27);
			JLabel houseImg = new JLabel();
			houseImg.setIcon(new ImageIcon(dados.class.getResource("/res/house.png")));
			gameWindow.houseContainer[21].add(houseImg);
			gameWindow.tabuleiro.validate();
			gameWindow.tabuleiro.repaint();
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
			casas.mineBuyHouse[21].setEnabled(false);
		}
		
		if (e.getSource() == casas.conerBt[0]) {
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
		}
		if (e.getSource() == casas.conerBt[1]) {
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
		}
		if (e.getSource() == casas.conerBt[2]) {
			JOptionPane.showMessageDialog(Main.f,"Vai para a prisao","Prisão",JOptionPane.INFORMATION_MESSAGE);
			goToPrison();
		}
		
		if (e.getSource() == casas.prisonContinuar[0]) {
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
		}
		if (e.getSource() == casas.pagar) {
			players.inPrison[dados.turn] = false;
			players.setMoney(-50);
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.rollDice();
		}
		if (e.getSource() == casas.prisonContinuar[1]) {
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.rollDice();
		}
		
		if (e.getSource() == casas.prisonContinuar[2]) {
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
		}
		
		if (e.getSource() == casas.sorteBt[0]) {
			chance();
		}
		if (e.getSource() == casas.sorteBt[1]) {
			chance();		
		}
		if (e.getSource() == casas.sorteBt[2]) {
			chance();
		}
		
		if (e.getSource() == casas.caixaBt[0]) {
			chest();
		}
		if (e.getSource() == casas.caixaBt[1]) {
			chest();
		}
		if (e.getSource() == casas.caixaBt[2]) {
			chest();
		}
		
		if (e.getSource()== casas.taxBt[0]) {
			JOptionPane.showMessageDialog(Main.f,"Pagaste $200 de taxa","Taxa",JOptionPane.INFORMATION_MESSAGE);
			players.setMoney(-200);
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
		}
		if (e.getSource()== casas.taxBt[1]) {
			JOptionPane.showMessageDialog(Main.f,"Pagaste $75 de taxa","Inposto",JOptionPane.INFORMATION_MESSAGE);
			players.setMoney(-75);
			gameWindow.cardsCl.show(gameWindow.cardsPanel,"blank");
			dados.changeTurn();
		}
		
	}
	
	public static void endGame() {
		JOptionPane.showMessageDialog(Main.f,"O jogo acabou\n"+players.plName[dados.turn]+" ficou sem dinheiro.","Fim do jogo",JOptionPane.INFORMATION_MESSAGE);
		System.gc();
		System.exit(0);
	}
}
