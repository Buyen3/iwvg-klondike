package klondike.views.console.menu.movefrom;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.models.enums.Error;
import klondike.views.console.menu.command.Command;
import klondike.views.console.menu.command.CommandTitle;

public class MoveFromStockToWasteCommand extends Command {

    public MoveFromStockToWasteCommand(MoveController moveController) {
        super(CommandTitle.STOCK2WASTE_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        return this.moveController.moveFromStockToWaste();
    }
}
