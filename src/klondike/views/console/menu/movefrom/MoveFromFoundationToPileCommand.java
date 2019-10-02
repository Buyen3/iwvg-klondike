package klondike.views.console.menu.movefrom;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.models.enums.Error;
import klondike.models.enums.Suit;
import klondike.models.stack.subclass.Pile;
import klondike.utils.SuitUtils;
import klondike.views.console.menu.Message;
import klondike.views.console.menu.command.Command;
import klondike.views.console.menu.command.CommandTitle;

public class MoveFromFoundationToPileCommand extends Command {

    public MoveFromFoundationToPileCommand(MoveController moveController) {
        super(CommandTitle.FOUNDATION2PILE_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        Suit suit = SuitUtils.read();
        int pileIndex = Pile.readIndex(Message.DESTINATION);
        return this.moveController.moveFromFoundationToPile(suit, pileIndex);
    }
}
