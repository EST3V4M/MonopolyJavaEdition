package BackEnd;

import FrontEnd.gameWindow;
import FrontEnd.setupWindow;

public class players {
	public static String[] plName = {"",""};
	
	public static int[] plToken = {0,0};
	
	public static int[] plMoney = {1500,1500};
	
	public static int[] movement = {0,0};
	public static int[]  plPosition = {0,0};
	
	public static Boolean[] inPrison = {false,false,};
	
	public static void setName(){
		plName[0] = setupWindow.plName[0].getText();
		plName[1] = setupWindow.plName[1].getText();
		gameWindow.plName[0].setText(plName[0]);
		gameWindow.plName[1].setText(plName[1]);
	}
	
	public static void setToken() {
		gameWindow.plImage[0].setIcon(gameWindow.tokenImg[plToken[0]-1]);
		gameWindow.plImage[1].setIcon(gameWindow.tokenImg[plToken[1]-1]);
		gameWindow.token[0].setIcon(gameWindow.tokenIcon[plToken[0]-1]);
		gameWindow.token[1].setIcon(gameWindow.tokenIcon[plToken[1]-1]);
	}
	
	public static void setMoney(int money){
		plMoney[dados.turn] = plMoney[dados.turn]+ money;
		gameWindow.plMoney[dados.turn].setText("$"+plMoney[dados.turn]);
		if (plMoney[dados.turn] <= 0){
			events.endGame();
		}
	}
	
	
	public static void setPosition(int position) {
		movement[dados.turn] = position;
		plPosition[dados.turn] = plPosition[dados.turn] + position;
		if (plPosition[dados.turn] < 0) {
			plPosition[dados.turn] = 40 + plPosition[dados.turn];
		} else if (plPosition[dados.turn] >= 40) {
			plPosition[dados.turn] = plPosition[dados.turn] - 40;
		}
		movementControl.ct = plPosition[dados.turn] - movement[dados.turn];
		movementControl.timer.restart();
	}
}
