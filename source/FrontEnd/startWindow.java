package FrontEnd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import BackEnd.Main;

public class startWindow {
	static JPanel startBasePanel;
	static JLabel background;
	static JLabel logo;
	static ImageIcon logoImg = new ImageIcon();
	static JButton sair, jogar;
	static Font font1 = new Font("Arial",Font.BOLD,40);
	
	//constutor
	public static void buildStart() {
		startBasePanel = new JPanel(null);
			logo = new JLabel("logo");
			logo.setIcon(new ImageIcon(startWindow.class.getResource("/res/logoImg.png")));
			logo.setBounds(660,190,600,300);
			startBasePanel.add(logo);
			
			sair = new JButton("Sair");
			sair.setIcon(new ImageIcon(startWindow.class.getResource("/res/exitImg.png")));
			sair.setFont(font1);
			sair.setHorizontalAlignment(SwingConstants.LEFT);
			sair.setHorizontalTextPosition(SwingConstants.RIGHT);
			sair.setBackground(Color.red);
			sair.setForeground(Color.white);
			sair.setBounds(560,700,300,100);
			sair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.gc();
					System.exit(0);
				  }
			});
			startBasePanel.add(sair);
			
			jogar = new JButton("Jogar");
			jogar.setIcon(new ImageIcon(startWindow.class.getResource("/res/playImg.png")));
			jogar.setFont(font1);
			jogar.setHorizontalAlignment(SwingConstants.LEFT);
			jogar.setHorizontalTextPosition(SwingConstants.RIGHT);
			jogar.setBackground(Color.red);
			jogar.setForeground(Color.white);
			jogar.setBounds(1060,700,300,100);
			jogar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Main.cl.show(Main.p, "2");
				}
			});
			startBasePanel.add(jogar);
			
			background = new JLabel();
			background.setIcon(new ImageIcon(startWindow.class.getResource("/res/backgroundImg.png")));
			background.setBounds(0,0,1920,1080);
			startBasePanel.add(background);
		Main.p.add(startBasePanel,"1");
	}
}
