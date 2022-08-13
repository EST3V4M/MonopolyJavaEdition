package FrontEnd;

import java.awt.*;

import javax.swing.*;

import BackEnd.dados;
import BackEnd.events;

public class casas {
	static JPanel blank;
	public static JPanel[]  local = new JPanel[40];
	public static CardLayout[] localCl = new CardLayout[40];
	
	static Font font1 = new Font("Arial",Font.BOLD,40);
	static Font font2 = new Font("Arial",Font.BOLD,20);
	static JLabel text;
	static JLabel img;
	
	static JPanel[] notOwned= new JPanel[28];
	static ImageIcon[] propertiesImg = {
			new ImageIcon(dados.class.getResource("/res/cards/1.png")),
			new ImageIcon(dados.class.getResource("/res/cards/3.png")),
			new ImageIcon(dados.class.getResource("/res/cards/5.png")),
			new ImageIcon(dados.class.getResource("/res/cards/6.png")),
			new ImageIcon(dados.class.getResource("/res/cards/8.png")),
			new ImageIcon(dados.class.getResource("/res/cards/9.png")),
			new ImageIcon(dados.class.getResource("/res/cards/11.png")),
			new ImageIcon(dados.class.getResource("/res/cards/12.png")),
			new ImageIcon(dados.class.getResource("/res/cards/13.png")),
			new ImageIcon(dados.class.getResource("/res/cards/14.png")),
			new ImageIcon(dados.class.getResource("/res/cards/15.png")),
			new ImageIcon(dados.class.getResource("/res/cards/16.png")),
			new ImageIcon(dados.class.getResource("/res/cards/18.png")),
			new ImageIcon(dados.class.getResource("/res/cards/19.png")),
			new ImageIcon(dados.class.getResource("/res/cards/21.png")),
			new ImageIcon(dados.class.getResource("/res/cards/23.png")),
			new ImageIcon(dados.class.getResource("/res/cards/24.png")),
			new ImageIcon(dados.class.getResource("/res/cards/25.png")),
			new ImageIcon(dados.class.getResource("/res/cards/26.png")),
			new ImageIcon(dados.class.getResource("/res/cards/27.png")),
			new ImageIcon(dados.class.getResource("/res/cards/28.png")),
			new ImageIcon(dados.class.getResource("/res/cards/29.png")),
			new ImageIcon(dados.class.getResource("/res/cards/31.png")),
			new ImageIcon(dados.class.getResource("/res/cards/32.png")),
			new ImageIcon(dados.class.getResource("/res/cards/34.png")),
			new ImageIcon(dados.class.getResource("/res/cards/35.png")),
			new ImageIcon(dados.class.getResource("/res/cards/37.png")),
			new ImageIcon(dados.class.getResource("/res/cards/39.png")),
	};
	public static JLabel[] propertiePrice = new JLabel[28];
	public static JButton[] comprar = new JButton[28];
	public static JButton[] passar = new JButton[28];
	static JPanel[]	his= new JPanel[28];
	public static JLabel[] owner = new JLabel[28];
	public static JLabel[] rentPrice = new JLabel[28];
	public static JButton[] hisContinuar = new JButton[28];
	static JPanel[] mine= new JPanel[28];
	public static JButton[] mineBuyHouse = new JButton[22];
	public static JButton[] mineContinuar = new JButton[28];
	
	static JPanel cantos[] = new JPanel[3];
	static ImageIcon[] conerImg = {
			new ImageIcon(dados.class.getResource("/res/cards/0.png")),
			new ImageIcon(dados.class.getResource("/res/cards/20.png")),
			new ImageIcon(dados.class.getResource("/res/cards/30.png")),
			
	};
	public static JButton conerBt[] = new JButton[3];
	
	static ImageIcon[] prisonImg = {
			new ImageIcon(dados.class.getResource("/res/cards/10_prisioner.png")),
			new ImageIcon(dados.class.getResource("/res/cards/10_visitant.png")),
	};
	static JPanel prison[] = new JPanel[3];
	public static JButton prisonContinuar[] = new JButton[3];
	public static JButton pagar;
	
	static ImageIcon[] chanceImg = {
			new ImageIcon(dados.class.getResource("/res/cards/chance.png")),
			new ImageIcon(dados.class.getResource("/res/cards/chest.png")),
	};
	static JPanel sorte[] = new JPanel[3], caixa[] = new JPanel[3];
	public static JButton sorteBt[] = new JButton[3],caixaBt[] = new JButton[3];
	
	static JPanel tax[] = new JPanel[2];
	static ImageIcon[] taxImg = {
			new ImageIcon(dados.class.getResource("/res/cards/2.png")),
			new ImageIcon(dados.class.getResource("/res/cards/38.png")),
	};
	public static JButton taxBt[] = new JButton[2];
	
	
	public static void buildBase() {
			for (int ct = 0; ct<40; ct++) {
				localCl[ct] = new CardLayout();
				local[ct] = new JPanel(localCl[ct]);
				local[ct].setBackground(new Color(51, 31, 105));
				local[ct].setBounds(0,0,420,780);
				gameWindow.cardsPanel.add(local[ct],("local"+String.valueOf(ct)));
			}
					//start/estacionamento/paraPrisao
					for (int ct = 0; ct<3; ct++) {
						cantos[ct] = new JPanel(null);
						cantos[ct].setBackground(new Color(114, 47, 212));
						
							img = new JLabel();
							img.setIcon(conerImg[ct]);
							img.setBounds(10,10,400,600);
							cantos[ct].add(img);
							
							conerBt[ct]= new JButton("Continuar");
							conerBt[ct].setBounds(10,650,400,100);
							conerBt[ct].setBackground(new Color(51, 20, 97));
							conerBt[ct].setForeground(Color.white);
							conerBt[ct].setFont(font1);
							conerBt[ct].addActionListener(new events());
							cantos[ct].add(conerBt[ct]);
					}
					
					//sorte
					for (int ct = 0; ct<3; ct++) {
						sorte[ct] = new JPanel(null);
						sorte[ct].setBackground(new Color(114, 47, 212));
						
							img = new JLabel();
							img.setIcon(chanceImg[0]);
							img.setBounds(10,10,400,600);
							sorte[ct].add(img);
							
							sorteBt[ct]= new JButton("Continuar");
							sorteBt[ct].setBounds(10,650,400,100);
							sorteBt[ct].setBackground(new Color(51, 20, 97));
							sorteBt[ct].setForeground(Color.white);
							sorteBt[ct].setFont(font1);
							sorteBt[ct].addActionListener(new events());
							sorte[ct].add(sorteBt[ct]);
					}
					//caixa
					for (int ct = 0; ct<3; ct++) {
						caixa[ct] = new JPanel(null);
						caixa[ct].setBackground(new Color(114, 47, 212));
						
							img = new JLabel();
							img.setIcon(chanceImg[1]);
							img.setBounds(10,10,400,600);
							caixa[ct].add(img);
							
							caixaBt[ct]= new JButton("Continuar");
							caixaBt[ct].setBounds(10,650,400,100);
							caixaBt[ct].setBackground(new Color(51, 20, 97));
							caixaBt[ct].setForeground(Color.white);
							caixaBt[ct].setFont(font1);
							caixaBt[ct].addActionListener(new events());
							caixa[ct].add(caixaBt[ct]);
					}
					
					//prisao
					prison[1] = new JPanel(null);
					prison[1].setBackground(new Color(114, 47, 212));
						img = new JLabel();
						img.setIcon(prisonImg[1]);
						img.setBounds(10,10,400,600);
						prison[1].add(img);
						prisonContinuar[0]= new JButton("Continuar");
						prisonContinuar[0].setBounds(10,650,400,100);
						prisonContinuar[0].setBackground(new Color(51, 20, 97));
						prisonContinuar[0].setForeground(Color.white);
						prisonContinuar[0].setFont(font1);
						prisonContinuar[0].addActionListener(new events());
						prison[1].add(prisonContinuar[0]);
						
					prison[0] = new JPanel(null);
					prison[0].setBackground(new Color(114, 47, 212));
						img = new JLabel();
						img.setIcon(prisonImg[0]);
						img.setBounds(10,10,400,600);
						prison[0].add(img);
						pagar = new JButton("pagar");
						pagar.addActionListener(new events());
						pagar.setBackground(new Color(51, 20, 97));
						pagar.setForeground(Color.white);
						pagar.setBounds(215,650,195,100);
						prison[0].add(pagar);
						prisonContinuar[1]= new JButton("lançar");
						prisonContinuar[1].setBackground(new Color(51, 20, 97));
						prisonContinuar[1].setForeground(Color.white);
						prisonContinuar[1].setBounds(10,650,195,100);
						prisonContinuar[1].addActionListener(new events());
						prison[0].add(prisonContinuar[1]);
						
					prison[2] = new JPanel(null);
					prison[2].setBackground(new Color(114, 47, 212));
						img = new JLabel();
						img.setIcon(prisonImg[0]);
						img.setBounds(10,10,400,600);
						prison[2].add(img);
						prisonContinuar[2]= new JButton("Continuar");
						prisonContinuar[2].setBounds(10,650,400,100);
						prisonContinuar[2].setBackground(new Color(51, 20, 97));
						prisonContinuar[2].setForeground(Color.white);
						prisonContinuar[2].setFont(font1);
						prisonContinuar[2].addActionListener(new events());
						prison[2].add(prisonContinuar[2]);
				
					//taxas
					for (int ct = 0; ct<2; ct++) {
						tax[ct] = new JPanel(null);
						tax[ct].setBackground(new Color(114, 47, 212));
						
							img = new JLabel();
							img.setIcon(taxImg[ct]);
							img.setBounds(10,10,400,600);
							tax[ct].add(img);
							
							taxBt[ct]= new JButton("Continuar");
							taxBt[ct].setBounds(10,650,400,100);
							taxBt[ct].setBackground(new Color(51, 20, 97));
							taxBt[ct].setForeground(Color.white);
							taxBt[ct].setFont(font1);
							taxBt[ct].addActionListener(new events());
							tax[ct].add(taxBt[ct]);
					}
					
					//propriedades
					for  (int ct = 0; ct<28 ; ct++) {
						notOwned[ct] = new JPanel(null);
						notOwned[ct].setBackground(new Color(114, 47, 212));
						his[ct] = new JPanel(null);
						his[ct].setBackground(new Color(114, 47, 212));
						mine[ct] = new JPanel(null);
						mine[ct].setBackground(new Color(114, 47, 212));
						
						//de niguem
						img = new JLabel();
						img.setIcon(propertiesImg[ct]);
						img.setBounds(10,10,400,600);
						notOwned[ct].add(img);
						
						propertiePrice[ct] = new JLabel(String.valueOf("$"+events.propertieValue(ct)));
						propertiePrice[ct].setBounds(10,615,400,50);
						propertiePrice[ct].setHorizontalAlignment(JLabel.CENTER);
						propertiePrice[ct].setForeground(Color.white);
						propertiePrice[ct].setFont(font1);
						notOwned[ct].add(propertiePrice[ct]);
						
						comprar[ct] = new JButton();
						comprar[ct].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buy.png")));
						comprar[ct].addActionListener(new events());
						comprar[ct].setBounds(215,670,195,100);
						notOwned[ct].add(comprar[ct]);
						
						passar[ct] = new JButton();
						passar[ct].setIcon(new ImageIcon(setupWindow.class.getResource("/res/pass.png")));
						passar[ct].addActionListener(new events());
						passar[ct].setBounds(10,670,195,100);
						notOwned[ct].add(passar[ct]);
						
						//dele
						text = new JLabel("Propriedade de:");
						text.setBounds(10,50,400,50);
						text.setHorizontalAlignment(JLabel.CENTER);
						text.setForeground(Color.white);
						text.setFont(font1);
						his[ct].add(text);
						
						owner[ct] = new JLabel();
						owner[ct].setBounds(10,100,400,50);
						owner[ct].setHorizontalAlignment(JLabel.CENTER);
						owner[ct].setFont(font1);
						owner[ct].setForeground(Color.white);
						his[ct].add(owner[ct]);
						
						text = new JLabel("Preço do aluguer:");
						text.setHorizontalAlignment(JLabel.CENTER);
						text.setForeground(Color.white);
						text.setBounds(10,300,400,50);
						text.setFont(font1);
						his[ct].add(text);
						
						rentPrice[ct] = new JLabel();
						rentPrice[ct].setBounds(10,350,400,50);
						rentPrice[ct].setHorizontalAlignment(JLabel.CENTER);
						rentPrice[ct].setForeground(Color.white);
						rentPrice[ct].setFont(font1);
						his[ct].add(rentPrice[ct]);
						
						hisContinuar[ct]= new JButton("Continuar");
						hisContinuar[ct].setBounds(10,550,400,100);
						hisContinuar[ct].setBackground(Color.white);
						hisContinuar[ct].setFont(font1);
						hisContinuar[ct].addActionListener(new events());
						his[ct].add(hisContinuar[ct]);
						
						//meu
						text = new JLabel("Ésta propriedade");
						text.setBounds(10,100,400,50);
						text.setForeground(Color.white);
						text.setHorizontalAlignment(JLabel.CENTER);
						text.setFont(font1);
						mine[ct].add(text);
						
						text = new JLabel("é tua");
						text.setForeground(Color.white);
						text.setHorizontalAlignment(JLabel.CENTER);
						text.setBounds(10,150,400,50);
						text.setFont(font1);
						mine[ct].add(text);
						
						mineContinuar[ct]= new JButton("Continuar");
						mineContinuar[ct].setBounds(10,670,195,100);
						mineContinuar[ct].setBackground(Color.white);
						mineContinuar[ct].setFont(font2);
						mineContinuar[ct].addActionListener(new events());
						mine[ct].add(mineContinuar[ct]);
					}
					mineBuyHouse[0] = new JButton();
					mineBuyHouse[0].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[0].addActionListener(new events());
					mineBuyHouse[0].setBounds(215,670,195,100);
					mine[0].add(mineBuyHouse[0]);
					
					mineBuyHouse[1] = new JButton();
					mineBuyHouse[1].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[1].addActionListener(new events());
					mineBuyHouse[1].setBounds(215,670,195,100);
					mine[1].add(mineBuyHouse[1]);
					
					mineBuyHouse[2] = new JButton();
					mineBuyHouse[2].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[2].addActionListener(new events());
					mineBuyHouse[2].setBounds(215,670,195,100);
					mine[3].add(mineBuyHouse[2]);
					
					mineBuyHouse[3] = new JButton();
					mineBuyHouse[3].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[3].addActionListener(new events());
					mineBuyHouse[3].setBounds(215,670,195,100);
					mine[4].add(mineBuyHouse[3]);
					
					mineBuyHouse[4] = new JButton();
					mineBuyHouse[4].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[4].addActionListener(new events());
					mineBuyHouse[4].setBounds(215,670,195,100);
					mine[5].add(mineBuyHouse[4]);
					
					mineBuyHouse[5] = new JButton();
					mineBuyHouse[5].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[5].addActionListener(new events());
					mineBuyHouse[5].setBounds(215,670,195,100);
					mine[6].add(mineBuyHouse[5]);
					
					mineBuyHouse[6] = new JButton();
					mineBuyHouse[6].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[6].addActionListener(new events());
					mineBuyHouse[6].setBounds(215,670,195,100);
					mine[8].add(mineBuyHouse[6]);
					
					mineBuyHouse[7] = new JButton();
					mineBuyHouse[7].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[7].addActionListener(new events());
					mineBuyHouse[7].setBounds(215,670,195,100);
					mine[9].add(mineBuyHouse[7]);
					
					mineBuyHouse[8] = new JButton();
					mineBuyHouse[8].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[8].addActionListener(new events());
					mineBuyHouse[8].setBounds(215,670,195,100);
					mine[11].add(mineBuyHouse[8]);
					
					mineBuyHouse[9] = new JButton();
					mineBuyHouse[9].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[9].addActionListener(new events());
					mineBuyHouse[9].setBounds(215,670,195,100);
					mine[12].add(mineBuyHouse[9]);
					
					mineBuyHouse[10] = new JButton();
					mineBuyHouse[10].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[10].addActionListener(new events());
					mineBuyHouse[10].setBounds(215,670,195,100);
					mine[13].add(mineBuyHouse[10]);
					
					mineBuyHouse[11] = new JButton();
					mineBuyHouse[11].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[11].addActionListener(new events());
					mineBuyHouse[11].setBounds(215,670,195,100);
					mine[14].add(mineBuyHouse[11]);
					
					mineBuyHouse[12] = new JButton();
					mineBuyHouse[12].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[12].addActionListener(new events());
					mineBuyHouse[12].setBounds(215,670,195,100);
					mine[15].add(mineBuyHouse[12]);
					
					mineBuyHouse[13] = new JButton();
					mineBuyHouse[13].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[13].addActionListener(new events());
					mineBuyHouse[13].setBounds(215,670,195,100);
					mine[16].add(mineBuyHouse[13]);
					
					mineBuyHouse[14] = new JButton();
					mineBuyHouse[14].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[14].addActionListener(new events());
					mineBuyHouse[14].setBounds(215,670,195,100);
					mine[18].add(mineBuyHouse[14]);
					
					mineBuyHouse[15] = new JButton();
					mineBuyHouse[15].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[15].addActionListener(new events());
					mineBuyHouse[15].setBounds(215,670,195,100);
					mine[19].add(mineBuyHouse[15]);
					
					mineBuyHouse[16] = new JButton();
					mineBuyHouse[16].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[16].addActionListener(new events());
					mineBuyHouse[16].setBounds(215,670,195,100);
					mine[21].add(mineBuyHouse[16]);
					
					mineBuyHouse[17] = new JButton();
					mineBuyHouse[17].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[17].addActionListener(new events());
					mineBuyHouse[17].setBounds(215,670,195,100);
					mine[22].add(mineBuyHouse[17]);
					
					mineBuyHouse[18] = new JButton();
					mineBuyHouse[18].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[18].addActionListener(new events());
					mineBuyHouse[18].setBounds(215,670,195,100);
					mine[23].add(mineBuyHouse[18]);
					
					mineBuyHouse[19] = new JButton();
					mineBuyHouse[19].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[19].addActionListener(new events());
					mineBuyHouse[19].setBounds(215,670,195,100);
					mine[25].add(mineBuyHouse[19]);
					
					mineBuyHouse[20] = new JButton();
					mineBuyHouse[20].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[20].addActionListener(new events());
					mineBuyHouse[20].setBounds(215,670,195,100);
					mine[26].add(mineBuyHouse[20]);
					
					mineBuyHouse[21] = new JButton();
					mineBuyHouse[21].setIcon(new ImageIcon(setupWindow.class.getResource("/res/buyHouse.png")));
					mineBuyHouse[21].addActionListener(new events());
					mineBuyHouse[21].setBounds(215,670,195,100);
					mine[27].add(mineBuyHouse[21]);
					
					local[0].add(cantos[0]);
					
					local[1].add(notOwned[0], "notOwned");
					local[1].add(his[0], "his");
					local[1].add(mine[0], "mine");
					
					local[2].add(caixa[0]);
					
					local[3].add(notOwned[1], "notOwned");
					local[3].add(his[1], "his");
					local[3].add(mine[1], "mine");
					
					local[4].add(tax[0]);
					
					local[5].add(notOwned[2], "notOwned");
					local[5].add(his[2], "his");
					local[5].add(mine[2], "mine");
					
					local[6].add(notOwned[3], "notOwned");
					local[6].add(his[3], "his");
					local[6].add(mine[3], "mine");
					
					local[7].add(sorte[0]);
					
					local[8].add(notOwned[4], "notOwned");
					local[8].add(his[4], "his");
					local[8].add(mine[4], "mine");
					
					local[9].add(notOwned[5], "notOwned");
					local[9].add(his[5], "his");
					local[9].add(mine[5], "mine");
					
					local[10].add(prison[0],"PPrisioner");
					local[10].add(prison[2],"PPrisioner1");
					local[10].add(prison[1],"PVisitant");
					
					local[11].add(notOwned[6], "notOwned");
					local[11].add(his[6], "his");
					local[11].add(mine[6], "mine");
					
					local[12].add(notOwned[7], "notOwned");
					local[12].add(his[7], "his");
					local[12].add(mine[7], "mine");
					
					local[13].add(notOwned[8], "notOwned");
					local[13].add(his[8], "his");
					local[13].add(mine[8], "mine");
					
					local[14].add(notOwned[9], "notOwned");
					local[14].add(his[9], "his");
					local[14].add(mine[9], "mine");
					
					local[15].add(notOwned[10], "notOwned");
					local[15].add(his[10], "his");
					local[15].add(mine[10], "mine");
					
					local[16].add(notOwned[11], "notOwned");
					local[16].add(his[11], "his");
					local[16].add(mine[11], "mine");
					
					local[17].add(caixa[1]);
					
					local[18].add(notOwned[12], "notOwned");
					local[18].add(his[12], "his");
					local[18].add(mine[12], "mine");
					
					local[19].add(notOwned[13], "notOwned");
					local[19].add(his[13], "his");
					local[19].add(mine[13], "mine");
					
					local[20].add(cantos[1]);
					
					local[21].add(notOwned[14], "notOwned");
					local[21].add(his[14], "his");
					local[21].add(mine[14], "mine");
					
					local[22].add(sorte[1]);
					
					local[23].add(notOwned[15], "notOwned");
					local[23].add(his[15], "his");
					local[23].add(mine[15], "mine");
					
					local[24].add(notOwned[16], "notOwned");
					local[24].add(his[16], "his");
					local[24].add(mine[16], "mine");
					
					local[25].add(notOwned[17], "notOwned");
					local[25].add(his[17], "his");
					local[25].add(mine[17], "mine");
					
					local[26].add(notOwned[18], "notOwned");
					local[26].add(his[18], "his");
					local[26].add(mine[18], "mine");
					
					local[27].add(notOwned[19], "notOwned");
					local[27].add(his[19], "his");
					local[27].add(mine[19], "mine");
					
					local[28].add(notOwned[20], "notOwned");
					local[28].add(his[20], "his");
					local[28].add(mine[20], "mine");
					
					local[29].add(notOwned[21], "notOwned");
					local[29].add(his[21], "his");
					local[29].add(mine[21], "mine");
					
					local[30].add(cantos[2]);
					
					local[31].add(notOwned[22], "notOwned");
					local[31].add(his[22], "his");
					local[31].add(mine[22], "mine");
					
					local[32].add(notOwned[23], "notOwned");
					local[32].add(his[23], "his");
					local[32].add(mine[23], "mine");
					
					local[33].add(caixa[2]);
					
					local[34].add(notOwned[24], "notOwned");
					local[34].add(his[24], "his");
					local[34].add(mine[24], "mine");
					
					local[35].add(notOwned[25], "notOwned");
					local[35].add(his[25], "his");
					local[35].add(mine[25], "mine");
					
					local[36].add(sorte[2]);
					
					local[37].add(notOwned[26], "notOwned");
					local[37].add(his[26], "his");
					local[37].add(mine[26], "mine");
					
					local[38].add(tax[1]);
					
					local[39].add(notOwned[27], "notOwned");
					local[39].add(his[27], "his");
					local[39].add(mine[27], "mine");
				
			blank = new JPanel(null);
			blank.setBounds(0,0,420,780);
			blank.setBackground(new Color(114, 47, 212));
			gameWindow.cardsPanel.add(blank,"blank");
	}
}