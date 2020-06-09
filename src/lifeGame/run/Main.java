package lifeGame.run;

import lifeGame.model.vo.Player;
import lifeGame.view.GameMenu;

public class Main {
	public static void main(String[] args) {
		Player user = new Player();
		GameMenu gm = new GameMenu(user);
		gm.menu();
	}

}
