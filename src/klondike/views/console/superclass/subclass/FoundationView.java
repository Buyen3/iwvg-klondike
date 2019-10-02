package klondike.views.console.superclass.subclass;

import klondike.controllers.klondlike.Controller;
import klondike.models.enums.Suit;
import klondike.utils.IO;
import klondike.views.console.superclass.CardStackView;
import klondike.views.console.superclass.Message;

public class FoundationView extends CardStackView {


    private final Suit suit;

    public FoundationView(Controller controller, Suit suit) {
        super(controller, Message.FOUNDATION_TITLE.replace(Message.FOUNDATION_TAG, suit.toString().toLowerCase()));
        this.suit = suit;
    }


    public void writeln() {
        IO.writetab();
        super.writeln(this.controller.peekFoundation(suit));
    }
}
