package klondike.controllers.klondlike;

import klondike.controllers.IController;
import klondike.models.Card;
import klondike.models.Game;
import klondike.models.enums.Suit;

import java.util.Stack;

public abstract class Controller implements IController {

	protected final Game game;

	public Controller(Game game) {
		this.game = game;
	}

	@Override
	public Card peekStock() {
		return this.game.peekStock();
	}

	@Override
	public Card peekWaste() {
		return this.game.peekWaste();
	}

	@Override
	public Card peekFoundation(Suit suit) {
		return this.game.peekFoundation(suit);
	}

	@Override
	public Stack<Card> getPileCards(int index) {
		return this.game.getPileCards(index);
	}

	@Override
	public int getNumberOfFaceUpCardsInPile(int index) {
		return this.game.getNumberOfFaceUpCardsInPile(index);
	}
}
