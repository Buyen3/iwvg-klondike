package klondike.controllers;

import java.util.Stack;

import klondike.models.Card;
import klondike.models.enums.Suit;

public interface IController {

	public Card peekStock();

	public Card peekWaste();

	public Card peekFoundation(Suit suit);

	public Stack<Card> getPileCards(int index);

	public int getNumberOfFaceUpCardsInPile(int index);

}
