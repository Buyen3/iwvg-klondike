package klondike.models.stack.subclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import klondike.models.Card;
import klondike.models.enums.Number;
import klondike.models.enums.Suit;
import klondike.models.stack.superclass.CardStack;

public class Stock extends CardStack {

    public Stock() {
        super();
        for (Suit suit : Suit.values()) {
            for (Number number : Number.values()) {
                this.cards.add(new Card(suit, number));
            }
        }
        Collections.shuffle(this.cards);
    }

    public List<Card> takeTop(int quantity) {
        assert 0 < quantity && quantity <= this.cards.size();
        List<Card> cardsToReturn = new ArrayList<>(this.cards.subList(0, quantity));
        this.cards.removeAll(cardsToReturn);
        return cardsToReturn;
    }

}
