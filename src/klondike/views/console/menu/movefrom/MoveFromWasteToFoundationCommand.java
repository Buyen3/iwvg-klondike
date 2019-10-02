package klondike.views.console.menu.movefrom;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.models.enums.Error;
import klondike.models.enums.Suit;
import klondike.utils.SuitUtils;
import klondike.views.console.menu.command.Command;
import klondike.views.console.menu.command.CommandTitle;

public class MoveFromWasteToFoundationCommand extends Command {

    public MoveFromWasteToFoundationCommand(MoveController moveController) {
        super(CommandTitle.WASTE2FOUNDATION_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        Suit suit = SuitUtils.read();
        return this.moveController.moveFromWasteToFoundation(suit);
    }
}
