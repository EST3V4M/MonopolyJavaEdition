package BackEnd;

import java.awt.CardLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import FrontEnd.gameWindow;
import FrontEnd.menuBar;
import FrontEnd.setupWindow;
import FrontEnd.startWindow;

public class Main {
	public static JFrame f;
	public static CardLayout cl = new CardLayout();
	public static JPanel p;
	
	static public void base() {
		f = new JFrame();
		f.setLayout(null);
		f.setTitle("Monopoly Java Edition");
		f.setBounds(0,0,1920,1040);
		f.setVisible(true);
		f.setResizable(false);
		f.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/res/iconImg.png")));
		
		p = new JPanel(cl);
		p.setBounds(0,0,1920,1080);
		f.add(p);
		
		startWindow.buildStart();
		setupWindow.buildSetup();
		gameWindow.buildGame();
		menuBar.buildMenu();
	}

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(f,"Bem Vindo ao Monopoly Java Edtion\n\nEste programa requer pelo menos um monitor\nFullHD.","Aviso",JOptionPane.INFORMATION_MESSAGE);
		base();
	}
}