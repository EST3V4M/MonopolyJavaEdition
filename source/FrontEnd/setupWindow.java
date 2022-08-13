package FrontEnd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import BackEnd.*;

public class setupWindow {
	static JPanel setupBasePanel;
	static JLabel background;
	
	static Font font1 = new Font("Arial",Font.BOLD,40);
	static Font font2 = new Font("Arial",Font.BOLD,30);
	static JPanel pl1Panel, pl2Panel;
	static JLabel text;
	public static JTextField plName[] = new JTextField[2];
	static JPanel pl1Tokens, pl2Tokens;
	public static JButton pl1TokenBts[] = new JButton[9];
	public static JButton pl2TokenBts[] = new JButton[9];
	
	static ImageIcon[] tokenImg = {
			new ImageIcon(setupWindow.class.getResource("/res/tokens/dogImg_trans.png")),//null button
			new ImageIcon(setupWindow.class.getResource("/res/tokens/dogImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/catImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/pinguImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/dinoImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/duckImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/shipImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/carImg_trans.png")),
			new ImageIcon(setupWindow.class.getResource("/res/tokens/hatImg_trans.png")),
	};
	
	public static JButton comecar;
	public static JButton voltar;
	
	//construtor
	public static void buildSetup() {
		setupBasePanel = new JPanel(null);
			//opcoes jogador 1
			pl1Panel = new JPanel(null);
			pl1Panel.setBounds(100,100,760,660);
			pl1Panel.setBackground(new Color(0f,0f,0f,.5f));
			
				text = new JLabel("Jogador 1");
				text.setBounds(290,10,190,50);
				text.setFont(font1);
				text.setForeground(Color.yellow);
				pl1Panel.add(text);
				
				text = new JLabel("Nome");
				text.setBounds(320,120,120,50);
				text.setFont(font1);
				text.setForeground(Color.white);
				pl1Panel.add(text);
			
				//escolha nome jogador 1
				plName[0] = new JTextField(5);
				plName[0].setBounds(760/2-200/2,170,200,50);
				plName[0].setFont(font1);
				pl1Panel.add(plName[0]);
				
				text = new JLabel("Pião");
				text.setBounds(330,290,100,50);
				text.setFont(font1);
				text.setForeground(Color.white);
				pl1Panel.add(text);
			
				//escolha do token jogador 1
				pl1Tokens = new JPanel(new GridLayout(2,4));
				pl1Tokens.setBounds(760/2-520/2,340,520,260);
					pl1TokenBts[0] = new JButton("null");
					for (int ct= 1; ct<9; ct++) {
						pl1TokenBts[ct] = new JButton(tokenImg[ct]);
						pl1TokenBts[ct].setBackground(Color.white);
						pl1TokenBts[ct].addActionListener((ActionListener) new setupWindowControl());
						pl1Tokens.add(pl1TokenBts[ct]);
					}
				pl1Panel.add(pl1Tokens);
			setupBasePanel.add(pl1Panel);
			
			//opcoes jogador 2
			pl2Panel = new JPanel(null);
			pl2Panel.setBounds(1060,100,760,660);
			pl2Panel.setBackground(new Color(0f,0f,0f,.5f));
			
				text = new JLabel("Jogador 2");
				text.setBounds(290,10,190,50);
				text.setFont(font1);
				text.setForeground(Color.green);
				pl2Panel.add(text);
				
				text = new JLabel("Nome");
				text.setBounds(320,120,120,50);
				text.setFont(font1);
				text.setForeground(Color.white);
				pl2Panel.add(text);
				
				//escolha nome jogador 2
				plName[1] = new JTextField();
				plName[1].setBounds(760/2-200/2,170,200,50);
				plName[1].setFont(font1);
				pl2Panel.add(plName[1]);
				
				text = new JLabel("Pião");
				text.setBounds(330,290,100,50);
				text.setFont(font1);
				text.setForeground(Color.white);
				pl2Panel.add(text);
			
				//escolha do token jogador 2
				pl2Tokens = new JPanel(new GridLayout(2,4));
				pl2Tokens.setBounds(760/2-520/2,340,520,260);
					pl2TokenBts[0] = new JButton("null");
					for (int ct= 1; ct<9; ct++) {
						pl2TokenBts[ct] = new JButton(tokenImg[ct]);
						pl2TokenBts[ct].setBackground(Color.white);
						pl2TokenBts[ct].addActionListener((ActionListener) new setupWindowControl());
						pl2Tokens.add(pl2TokenBts[ct]);
					}
				pl2Panel.add(pl2Tokens);
			setupBasePanel.add(pl2Panel);
			
			//butao voltar
			voltar = new JButton("Voltar");
			voltar.setIcon(new ImageIcon(setupWindow.class.getResource("/res/exitImg.png")));
			voltar.setFont(font2);
			voltar.setHorizontalAlignment(SwingConstants.LEFT);
			voltar.setHorizontalTextPosition(SwingConstants.RIGHT);
			voltar.setBackground(Color.red);
			voltar.setForeground(Color.white);
			voltar.setBounds(100,850,300,100);
			voltar.addActionListener((ActionListener) new setupWindowControl());
			setupBasePanel.add(voltar);
			
			//butao comecar
			comecar = new JButton("Começar");
			comecar.setIcon(new ImageIcon(setupWindow.class.getResource("/res/playImg.png")));
			comecar.setFont(font2);
			comecar.setHorizontalAlignment(SwingConstants.LEFT);
			comecar.setHorizontalTextPosition(SwingConstants.RIGHT);
			comecar.setBackground(Color.red);
			comecar.setForeground(Color.white);
			comecar.setBounds(1520,850,300,100);
			comecar.addActionListener((ActionListener) new setupWindowControl());
			setupBasePanel.add(comecar);
			
			background = new JLabel();
			background.setIcon(new ImageIcon(setupWindow.class.getResource("/res/backgroundImg.png")));
			background.setBounds(0,0,1920,1080);
			setupBasePanel.add(background);
			Main.p.add(setupBasePanel,"2");
	}
}
