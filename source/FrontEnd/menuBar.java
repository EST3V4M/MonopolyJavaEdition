package FrontEnd;

import javax.swing.*;

import BackEnd.Main;
import BackEnd.events;

public class menuBar {
	public static JMenuBar mnb;
	public static JMenu menu;
	public static JMenuItem about,rules,reset,exit;
	
	public static void buildMenu() {
		mnb = new JMenuBar();
		
		menu=new JMenu("Menu");
		
		about=new JMenuItem("Sobre");
		about.addActionListener(new events());
		menu.add(about);
		
		rules=new JMenuItem("Regras");
		rules.addActionListener(new events());
		menu.add(rules);
		
		exit=new JMenuItem("Sair");
		exit.addActionListener(new events());
		menu.add(exit);
		
		mnb.add(menu);
		
		Main.f.setJMenuBar(mnb);
	}
}
