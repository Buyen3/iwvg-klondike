package klondike.views.console.menu;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.utils.Menu;
import klondike.views.console.menu.movefrom.MoveFromFoundationToPileCommand;
import klondike.views.console.menu.movefrom.MoveFromPileToFoundationCommand;
import klondike.views.console.menu.movefrom.MoveFromPileToPileCommand;
import klondike.views.console.menu.movefrom.MoveFromStockToWasteCommand;
import klondike.views.console.menu.movefrom.MoveFromWasteToFoundationCommand;
import klondike.views.console.menu.movefrom.MoveFromWasteToPileCommand;
import klondike.views.console.menu.movefrom.MoveFromWasteToStockCommand;

public class PlayMenu extends Menu {

    public PlayMenu(MoveController moveController) {
        this.addCommand(new MoveFromStockToWasteCommand(moveController));
        this.addCommand(new MoveFromWasteToStockCommand(moveController));
        this.addCommand(new MoveFromWasteToFoundationCommand(moveController));
        this.addCommand(new MoveFromWasteToPileCommand(moveController));
        this.addCommand(new MoveFromFoundationToPileCommand(moveController));
        this.addCommand(new MoveFromPileToFoundationCommand(moveController));
        this.addCommand(new MoveFromPileToPileCommand(moveController));

    }

}
