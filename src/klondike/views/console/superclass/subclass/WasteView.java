package klondike.views.console.superclass.subclass;

import klondike.controllers.klondlike.Controller;
import klondike.views.console.superclass.CardStackView;
import klondike.views.console.superclass.Message;

public class WasteView extends CardStackView {


    public WasteView(Controller controller) {
        super(controller, Message.WASTE_TITLE);
    }

    public void writeln() {
        super.writeln(this.controller.peekWaste());
    }
}
