package klondike.views.console.superclass;

import klondike.controllers.klondlike.Controller;
import klondike.models.Card;
import klondike.utils.IO;

public abstract class CardStackView {

    protected final Controller controller;

    private final String title;

    protected CardStackView(Controller controller, String title) {
        this.controller = controller;
        this.title = title;
    }

    protected void writeln(Card card) {
        IO.write(title);
        if (card == null)
            IO.writeln(Message.EMPTY);
        else
            new CardView(card).writeln();
    }

    public abstract void writeln();
}
