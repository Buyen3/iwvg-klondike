package klondike.views.console.menu.movefrom;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.models.enums.Error;
import klondike.views.console.menu.command.Command;
import klondike.views.console.menu.command.CommandTitle;

public class MoveFromWasteToStockCommand extends Command {

    public MoveFromWasteToStockCommand(MoveController moveController) {
        super(CommandTitle.WASTE2STOCK_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        return this.moveController.moveFromWasteToStock();
    }
}
