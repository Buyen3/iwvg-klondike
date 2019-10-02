package klondike.views.console.menu.movefrom;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.models.enums.Error;
import klondike.models.stack.subclass.Pile;
import klondike.views.console.menu.Message;
import klondike.views.console.menu.command.Command;
import klondike.views.console.menu.command.CommandTitle;

public class MoveFromWasteToPileCommand extends Command {

    public MoveFromWasteToPileCommand(MoveController moveController) {
        super(CommandTitle.WASTE2PILE_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        int pileIndex = Pile.readIndex(Message.DESTINATION);
        return this.moveController.moveFromWasteToPile(pileIndex);
    }
}
