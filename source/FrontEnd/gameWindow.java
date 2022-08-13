package FrontEnd;

import java.awt.*;
import javax.swing.*;

import BackEnd.Main;
import BackEnd.dados;
import BackEnd.events;
import BackEnd.players;

public class gameWindow {
	static Font font1 = new Font("Arial",Font.BOLD,40);
	static Font font2 = new Font("Arial",Font.BOLD,20);
	
	static JPanel gameBasePanel;
	static JLabel background;
	
	static JPanel tabContainer;
	public static JPanel tabuleiro;
	static JLabel tabuleiroImg;
	public static JPanel tabLocalTop[] = new JPanel[9];
	public static JPanel tabLocalBotton[] = new JPanel[9];
	public static JPanel tabLocalLeft[] = new JPanel[9];
	public static JPanel tabLocalRight[] = new JPanel[9];
	public static JPanel tabLocalConners[] = new JPanel[4];
	public static JPanel houseContainer[] = new JPanel[22];
	public static JLabel houseImg;
	public static JPanel pl[] = new JPanel[2];
	static JLabel tokenBgColor;
	public static JLabel token[] = new JLabel[2];
	public static ImageIcon[] tokenIcon = {
			new ImageIcon(setupWindow.class.getResource("/res/tokens/dogImg_mini.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/catImg_mini.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/pinguImg_mini.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/dinoImg_mini.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/duckImg_mini.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/shipImg_mini.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/carImg_mini.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/hatImg_mini.png")),
	};
	
	static JPanel plContainer;
	static JPanel plUI[] = new JPanel[2];
	public static JPanel[] colors = new JPanel[2];
	public static JLabel plImage[] = new JLabel[2];
	public static ImageIcon[] tokenImg = {
			new ImageIcon(setupWindow.class.getResource("/res/tokens/dogImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/catImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/pinguImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/dinoImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/duckImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/shipImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/carImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/hatImg_trans.png")),
	};
	public static JLabel plName[] = new JLabel[2];
	public static JLabel plMoney[] = new JLabel[2];
	public static JPanel plPropertiesPanelContainer;
	public static JCheckBox[] pl1OwnedProperties = new JCheckBox[28];
	public static JCheckBox[] pl2OwnedProperties = new JCheckBox[28];
	
	static JPanel cardsContainer;
	public static JPanel cardsPanel;
	public static CardLayout cardsCl = new CardLayout();
	
	static JPanel dadosContainer;
	public static JPanel dadosP;
	public static JLabel dadosImg[] = new JLabel[2];
	public static ImageIcon diceImg[] = {
			new ImageIcon(dados.class.getResource("/res/dados/1.png")),
			new ImageIcon(dados.class.getResource("/res/dados/2.png")),
			new ImageIcon(dados.class.getResource("/res/dados/3.png")),
			new ImageIcon(dados.class.getResource("/res/dados/4.png")),
			new ImageIcon(dados.class.getResource("/res/dados/5.png")),
			new ImageIcon(dados.class.getResource("/res/dados/6.png")),
	};
	public static JButton dado;
	public static JLabel valorDados;
	
	public static void buildGame() {
		gameBasePanel = new JPanel(null);
			//painel do tabuelrio
			tabContainer = new JPanel(null);
			tabContainer.setBackground(new Color(0f,0f,0f,.5f));
			tabContainer.setBounds(500,30,920,920);
			gameBasePanel.add(tabContainer);
			
				tabuleiro = new JPanel(null);
				tabuleiro.setBackground(Color.white);
				tabuleiro.setBounds(10,10,900,900);
				tabContainer.add(tabuleiro);
				
					tabLocalConners[0] = new JPanel(null);
					tabLocalConners[0].setBounds(780,780,120,120);
					tabLocalConners[0].setOpaque(false);
					tabuleiro.add(tabLocalConners[0]);
					
					tabLocalConners[1] = new JPanel(null);
					tabLocalConners[1].setBounds(0,780,120,120);
					tabLocalConners[1].setOpaque(false);
					tabuleiro.add(tabLocalConners[1]);
					
					tabLocalConners[2] = new JPanel(null);
					tabLocalConners[2].setBounds(0,0,120,120);
					tabLocalConners[2].setOpaque(false);
					tabuleiro.add(tabLocalConners[2]);
					
					tabLocalConners[3] = new JPanel(null);
					tabLocalConners[3].setBounds(780,0,120,120);
					tabLocalConners[3].setOpaque(false);
					tabuleiro.add(tabLocalConners[3]);
				
					int X = 120;
					for (int ct = 0; ct<9;ct++) {
			
						tabLocalTop[ct] = new JPanel(null);
						tabLocalTop[ct].setBounds(X,0,74,120);
						tabuleiro.add(tabLocalTop[ct]);
						tabLocalTop[ct].setOpaque(false);
						X = X + 74;
					}
					
					X = 710;
					for (int ct = 0; ct<9;ct++) {
				
						tabLocalBotton[ct] = new JPanel(null);
						tabLocalBotton[ct].setBounds(X,780,74,120);
						tabuleiro.add(tabLocalBotton[ct]);
						tabLocalBotton[ct].setOpaque(false);
						X = X - 74;
					}
					
					int Y = 710;
					for (int ct = 0 ; ct<9;ct++) {
				
						tabLocalLeft[ct] = new JPanel(null);
						tabLocalLeft[ct].setBounds(0,Y,120,74);
						tabuleiro.add(tabLocalLeft[ct]);
						tabLocalLeft[ct].setOpaque(false);
						Y = Y - 74;
					}
					
					Y = 120;
					for (int ct = 0; ct<9;ct++) {
		
						tabLocalRight[ct] = new JPanel(null);
						tabLocalRight[ct].setBounds(780,Y,120,74);
						tabuleiro.add(tabLocalRight[ct]);
						tabLocalRight[ct].setOpaque(false);
						Y = Y + 74;
					}
					
					for (int ct = 0; ct<5; ct++) {
						houseContainer[ct] = new JPanel(new GridLayout(1,3,2,10));
						houseContainer[ct].setBounds(0,-10,74,50);
						houseContainer[ct].setOpaque(false);
					}
					for (int ct = 11; ct<17; ct++) {
						houseContainer[ct] = new JPanel(new GridLayout(1,3,2,10));
						houseContainer[ct].setBounds(0,80,74,50);
						houseContainer[ct].setOpaque(false);
					}	
					for (int ct = 5; ct<11; ct++) {
						houseContainer[ct] = new JPanel(new GridLayout(3,1,10,2));
						houseContainer[ct].setBounds(95,0,50,74);
						houseContainer[ct].setOpaque(false);
					}
					for (int ct = 17; ct<22; ct++) {
						houseContainer[ct] = new JPanel(new GridLayout(3,1,10,2));
						houseContainer[ct].setBounds(5,0,50,74);
						houseContainer[ct].setOpaque(false);
					}
					tabLocalBotton[0].add(houseContainer[0]);
					tabLocalBotton[2].add(houseContainer[1]);
					tabLocalBotton[5].add(houseContainer[2]);
					tabLocalBotton[7].add(houseContainer[3]);
					tabLocalBotton[8].add(houseContainer[4]);
					tabLocalLeft[0].add(houseContainer[5]);
					tabLocalLeft[2].add(houseContainer[6]);
					tabLocalLeft[3].add(houseContainer[7]);
					tabLocalLeft[5].add(houseContainer[8]);
					tabLocalLeft[7].add(houseContainer[9]);
					tabLocalLeft[8].add(houseContainer[10]);
					tabLocalTop[0].add(houseContainer[11]);
					tabLocalTop[2].add(houseContainer[12]);
					tabLocalTop[3].add(houseContainer[13]);
					tabLocalTop[5].add(houseContainer[14]);
					tabLocalTop[6].add(houseContainer[15]);
					tabLocalTop[8].add(houseContainer[16]);
					tabLocalRight[0].add(houseContainer[17]);
					tabLocalRight[1].add(houseContainer[18]);
					tabLocalRight[3].add(houseContainer[19]);
					tabLocalRight[6].add(houseContainer[20]);
					tabLocalRight[8].add(houseContainer[21]);
					
					pl[0] = new JPanel(null);
					pl[0].setOpaque(false);
					pl[0].setBounds(80,40,45,45);
					tabLocalConners[0].add(pl[0]);
					
						token[0] = new JLabel();
						token[0].setBounds(0,0,45,45);
						pl[0].add(token[0]);
						
						tokenBgColor = new JLabel(new ImageIcon(gameWindow.class.getResource("/res/pl1.png")));
						tokenBgColor.setBounds(0,0,45,45);
						pl[0].add(tokenBgColor);
						
					pl[1] = new JPanel(null);
					pl[1].setBounds(40,80,45,45);
					pl[1].setOpaque(false);
					tabLocalConners[0].add(pl[1]);
					
						token[1] = new JLabel();
						token[1].setBounds(0,0,45,45);
						pl[1].add(token[1]);
					
						tokenBgColor = new JLabel(new ImageIcon(gameWindow.class.getResource("/res/pl2.png")));
						tokenBgColor.setBounds(0,0,45,45);
						pl[1].add(tokenBgColor);
					
					tabuleiroImg = new JLabel();
					tabuleiroImg.setIcon(new ImageIcon(gameWindow.class.getResource("/res/tabuleiro.jpg")));
					tabuleiroImg.setBounds(0,0,900,900);
					tabuleiro.add(tabuleiroImg);
			
			//painel dos jogadores
			plContainer = new JPanel(null);
			plContainer.setBackground(new Color(0f,0f,0f,.5f));
			plContainer.setBounds(20,30,460,670);
			gameBasePanel.add(plContainer);
				
				plUI[0] = new JPanel(null);
				plUI[0].setBackground(new Color(24, 174, 209));
				plUI[0].setBounds(10,10,440,320);
				plContainer.add(plUI[0]);
				
					colors[0] = new JPanel();
					colors[0].setBounds(0,0,100,100);
					plUI[0].add(colors[0]);
					
						plImage[0] = new JLabel();
						plImage[0].setBounds(0,-5,100,100);
						colors[0].add(plImage[0]);
					
					plName[0] = new JLabel("");
					plName[0].setFont(font1);
					plName[0].setForeground(Color.white);
					plName[0].setBounds(110,25,320,50);
					plUI[0].add(plName[0]);
					
					plMoney[0] = new JLabel("$"+players.plMoney[0]);
					plMoney[0].setFont(font1);
					plMoney[0].setForeground(Color.white);
					plMoney[0].setBounds(10,110,440,50);
					plUI[0].add(plMoney[0]);
					
					plPropertiesPanelContainer = new JPanel(new GridLayout(4,7,5,5));
					plPropertiesPanelContainer.setBounds(10,170,420,140);
					plPropertiesPanelContainer.setOpaque(false);
					plUI[0].add(plPropertiesPanelContainer);
					
						for(int ct = 0; ct<28; ct++) {
							pl1OwnedProperties[ct] = new JCheckBox();
							pl1OwnedProperties[ct].setEnabled(false);
							plPropertiesPanelContainer.add(pl1OwnedProperties[ct]);

						}
						pl1OwnedProperties[0].setBackground(new Color(149, 83, 59));
						pl1OwnedProperties[1].setBackground(new Color(149, 83, 59));
						pl1OwnedProperties[2].setBackground(new Color(168, 222, 248));
						pl1OwnedProperties[3].setBackground(new Color(168, 222, 248));
						pl1OwnedProperties[4].setBackground(new Color(168, 222, 248));
						pl1OwnedProperties[5].setBackground(new Color(211, 64, 144));
						pl1OwnedProperties[6].setBackground(new Color(211, 64, 144));
						pl1OwnedProperties[7].setBackground(new Color(211, 64, 144));
						pl1OwnedProperties[8].setBackground(new Color(243, 147, 35));
						pl1OwnedProperties[9].setBackground(new Color(243, 147, 35));
						pl1OwnedProperties[10].setBackground(new Color(243, 147, 35));
						pl1OwnedProperties[11].setBackground(new Color(231, 38, 43));
						pl1OwnedProperties[12].setBackground(new Color(231, 38, 43));
						pl1OwnedProperties[13].setBackground(new Color(231, 38, 43));
						pl1OwnedProperties[14].setBackground(new Color(247, 230, 39));
						pl1OwnedProperties[15].setBackground(new Color(247, 230, 39));
						pl1OwnedProperties[16].setBackground(new Color(247, 230, 39));
						pl1OwnedProperties[17].setBackground(new Color(45, 171, 90));
						pl1OwnedProperties[18].setBackground(new Color(45, 171, 90));
						pl1OwnedProperties[19].setBackground(new Color(45, 171, 90));
						pl1OwnedProperties[20].setBackground(new Color(0, 114, 191));
						pl1OwnedProperties[21].setBackground(new Color(0, 114, 191));
						pl1OwnedProperties[22].setBackground(new Color(51, 53, 52));
						pl1OwnedProperties[23].setBackground(new Color(51, 53, 52));
						pl1OwnedProperties[24].setBackground(new Color(51, 53, 52));
						pl1OwnedProperties[25].setBackground(new Color(51, 53, 52));
						pl1OwnedProperties[26].setBackground(new Color(231, 220, 50));
						pl1OwnedProperties[27].setBackground(new Color(251, 255, 252));
				
				plUI[1] = new JPanel(null);
				plUI[1].setBackground(new Color(24, 174, 209));
				plUI[1].setBounds(10,340,440,320);
				plContainer.add(plUI[1]); 
				
					colors[1] = new JPanel();
					colors[1].setBounds(0,0,100,100);
					plUI[1].add(colors[1]);
						
						plImage[1] = new JLabel();
						plImage[1].setBounds(0,-5,100,100);
						colors[1].add(plImage[1]);
					
					
					plName[1] = new JLabel("");
					plName[1].setFont(font1);
					plName[1].setForeground(Color.white);
					plName[1].setBounds(110,25,320,50);
					plUI[1].add(plName[1]);
					
					plMoney[1] = new JLabel("$"+players.plMoney[1]);
					plMoney[1].setFont(font1);
					plMoney[1].setForeground(Color.white);
					plMoney[1].setBounds(10,110,440,50);
					plUI[1].add(plMoney[1]);
					
					plPropertiesPanelContainer = new JPanel(new GridLayout(4,7,5,5));
					plPropertiesPanelContainer.setBounds(10,170,420,140);
					plPropertiesPanelContainer.setOpaque(false);
					plUI[1].add(plPropertiesPanelContainer);
					
						for(int ct = 0; ct<28; ct++) {
							pl2OwnedProperties[ct] = new JCheckBox();
							pl2OwnedProperties[ct].setEnabled(false);
							plPropertiesPanelContainer.add(pl2OwnedProperties[ct]);

						}
						pl2OwnedProperties[0].setBackground(new Color(149, 83, 59));
						pl2OwnedProperties[1].setBackground(new Color(149, 83, 59));
						pl2OwnedProperties[2].setBackground(new Color(168, 222, 248));
						pl2OwnedProperties[3].setBackground(new Color(168, 222, 248));
						pl2OwnedProperties[4].setBackground(new Color(168, 222, 248));
						pl2OwnedProperties[5].setBackground(new Color(211, 64, 144));
						pl2OwnedProperties[6].setBackground(new Color(211, 64, 144));
						pl2OwnedProperties[7].setBackground(new Color(211, 64, 144));
						pl2OwnedProperties[8].setBackground(new Color(243, 147, 35));
						pl2OwnedProperties[9].setBackground(new Color(243, 147, 35));
						pl2OwnedProperties[10].setBackground(new Color(243, 147, 35));
						pl2OwnedProperties[11].setBackground(new Color(231, 38, 43));
						pl2OwnedProperties[12].setBackground(new Color(231, 38, 43));
						pl2OwnedProperties[13].setBackground(new Color(231, 38, 43));
						pl2OwnedProperties[14].setBackground(new Color(247, 230, 39));
						pl2OwnedProperties[15].setBackground(new Color(247, 230, 39));
						pl2OwnedProperties[16].setBackground(new Color(247, 230, 39));
						pl2OwnedProperties[17].setBackground(new Color(45, 171, 90));
						pl2OwnedProperties[18].setBackground(new Color(45, 171, 90));
						pl2OwnedProperties[19].setBackground(new Color(45, 171, 90));
						pl2OwnedProperties[20].setBackground(new Color(0, 114, 191));
						pl2OwnedProperties[21].setBackground(new Color(0, 114, 191));
						pl2OwnedProperties[22].setBackground(new Color(51, 53, 52));
						pl2OwnedProperties[23].setBackground(new Color(51, 53, 52));
						pl2OwnedProperties[24].setBackground(new Color(51, 53, 52));
						pl2OwnedProperties[25].setBackground(new Color(51, 53, 52));
						pl2OwnedProperties[26].setBackground(new Color(231, 220, 50));
						pl2OwnedProperties[27].setBackground(new Color(251, 255, 252));		
			
			//painel das cartas
			cardsContainer = new JPanel(null);
			cardsContainer.setBackground(new Color(0f,0f,0f,.5f));
			cardsContainer.setBounds(1440,30,440,800);
			gameBasePanel.add(cardsContainer);
			
				cardsPanel = new JPanel(cardsCl);
				cardsPanel.setBounds(10,10,420,780);
				cardsContainer.add(cardsPanel);
				
					casas.buildBase();
				
			//dados
			dadosContainer = new JPanel(null);
			dadosContainer.setBackground(new Color(0f,0f,0f,.5f));
			dadosContainer.setBounds(1440,830,440,120);
			gameBasePanel.add(dadosContainer);
			
				dadosP = new JPanel(null);
				dadosP.setBounds(10,0,420,110);
				dadosP.setBackground(new Color(40, 148, 1));
				dadosContainer.add(dadosP);
				
					dadosImg[0] = new JLabel();
					dadosImg[0].setIcon(new ImageIcon(gameWindow.class.getResource("/res/dados/1.png")));
					dadosImg[0].setCursor(Cursor.getPredefinedCursor (Cursor.HAND_CURSOR));
					dadosImg[0].setBounds(5,5,100,100);
					dadosP.add(dadosImg[0]);
					
					dadosImg[1] = new JLabel();
					dadosImg[1].setIcon(new ImageIcon(gameWindow.class.getResource("/res/dados/1.png")));
					dadosImg[1].setCursor(Cursor.getPredefinedCursor (Cursor.HAND_CURSOR));
					dadosImg[1].setBounds(103,5,100,100);
					dadosP.add(dadosImg[1]);
					
					dado = new JButton();
					dado.setBounds(5,5,198,100);
					dado.setOpaque(false);
					dado.setBackground(Color.white);
					dado.addActionListener(new events());
					dadosP.add(dado);
					
					valorDados = new JLabel();
					valorDados.setBounds(205,5,100,100);
					valorDados.setHorizontalAlignment(JLabel.CENTER);
					valorDados.setVerticalAlignment(JLabel.CENTER);
					valorDados.setFont(font1);
					valorDados.setForeground(Color.white);
					dadosP.add(valorDados);
	
				//imagem de backgorund
				background = new JLabel();
				background.setIcon(new ImageIcon(gameWindow.class.getResource("/res/backgroundImg.png")));
				background.setBounds(0,0,1920,1080);
				gameBasePanel.add(background);
		Main.p.add(gameBasePanel,"3");
	}
}
