package d_interfaces.b_homework.h3.concrete;

import d_interfaces.b_homework.h3.abstracts.GameService;
import d_interfaces.b_homework.h3.entities.Game;

public class GameManager implements GameService {

	@Override
	public void gameAddition(Game game) {
		System.out.println("Game added: " + game.getGameName());
	}

	@Override
	public void multipleGameAddition(Game[] games) {

		for (Game game2 : games) {
			this.gameAddition(game2);
		}

	}

}
