package klondike.models.stack.subclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import klondike.models.Card;
import klondike.models.enums.Number;
import klondike.models.stack.superclass.CardStack;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;
import klondike.views.console.menu.Message;

public class Pile extends CardStack {

    private int numberOfFaceUpCards;

    public Pile(List<Card> cards) {
        this.numberOfFaceUpCards = 0;
        this.cards.addAll(cards);
        if (!this.cards.empty()) {
            flipFirstCard();
        }
    }

    private void flipFirstCard() {
        assert !this.cards.empty() && this.numberOfFaceUpCards == 0 && this.cards.peek().isFacedUp();
        this.cards.peek().flip();
        numberOfFaceUpCards++;
    }

    public boolean fitsIn(Card card) {
        assert card != null;
        return (this.cards.empty() && card.getNumber() == Number.KING) ||
                (!this.cards.empty() && this.cards.peek().isNextTo(card) && this.cards.peek().getColor() != card.getColor());
    }

    public List<Card> getTop(int numberOfCards) {
        assert numberOfCards <= this.numberOfFaceUpCards;
        return new ArrayList<>(this.cards.subList(this.cards.size() - numberOfCards, this.cards.size()));
    }

    public void addToTop(List<Card> cards) {
        assert cards != null;
        this.cards.addAll(cards);
        numberOfFaceUpCards += cards.size();
    }

    public void removeTop(int numberOfCards) {
        assert numberOfCards <= this.numberOfFaceUpCards;
        for (int i = 0; i < numberOfCards; i++) {
            this.cards.pop();
            numberOfFaceUpCards--;
        }
        if (this.numberOfFaceUpCards == 0 && !this.cards.empty()) {
            flipFirstCard();
        }
    }

    public int numberOfFaceUpCards() {
        return this.numberOfFaceUpCards;
    }

    public boolean empty() {
        return this.cards.empty();
    }

    public Stack<Card> getCards() {
        return this.cards;
    }
    
	public static int readIndex(String title) {
		return IO.readInt(Message.READ_PILE_INDEX.replace(Message.TITLE_TAG, title), new ClosedInterval(1, 7)) - 1;
	}
}
