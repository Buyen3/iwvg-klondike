package klondike.models.stack.superclass;

import java.util.Stack;

import klondike.models.Card;

public abstract class CardStack {

    protected Stack<Card> cards;

    public CardStack() {
        this.cards = new Stack<>();
    }

    public boolean empty() {
        return this.cards.empty();
    }

    public Card peek() {
        return this.cards.peek();
    }

    public Card pop() {
        return this.cards.pop();
    }

    public void push(Card card) {
        this.cards.push(card);
    }

}
