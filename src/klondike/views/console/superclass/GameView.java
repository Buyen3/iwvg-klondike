package klondike.views.console.superclass;

import klondike.controllers.klondlike.Controller;
import klondike.models.Game;
import klondike.models.enums.Suit;
import klondike.utils.IO;
import klondike.views.console.superclass.subclass.FoundationView;
import klondike.views.console.superclass.subclass.StockView;
import klondike.views.console.superclass.subclass.WasteView;

public class GameView {


    private final Controller controller;

    public GameView(Controller controller) {
        this.controller = controller;
    }

    public void writeln() {
        IO.writeln();
        IO.writeln(Message.GAME_TITLE);
        new StockView(this.controller).writeln();
        new WasteView(this.controller).writeln();
        IO.writeln(Message.FOUNDATIONS_TITLE);
        for (Suit suit : Suit.values()) {
            new FoundationView(this.controller, suit).writeln();
        }
        IO.writeln(Message.PILES_TITLE);
        for (int i = 0; i < Game.NUMBER_OF_PILES; i++) {
            new PileView(this.controller, i).writeln();
        }
        IO.writeln(Message.GAME_END);
        IO.writeln();
    }
}
