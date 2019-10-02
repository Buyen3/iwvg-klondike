package klondike.views.console.superclass.subclass;

import klondike.controllers.klondlike.Controller;
import klondike.views.console.superclass.CardStackView;
import klondike.views.console.superclass.Message;

public class StockView extends CardStackView {

    public StockView(Controller controller) {
        super(controller, Message.STOCK_TITLE);
    }

    public void writeln() {
        super.writeln(this.controller.peekStock());
    }
}
