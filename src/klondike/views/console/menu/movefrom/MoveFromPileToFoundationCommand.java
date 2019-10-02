package klondike.views.console.menu.movefrom;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.models.enums.Error;
import klondike.models.enums.Suit;
import klondike.models.stack.subclass.Pile;
import klondike.utils.SuitUtils;
import klondike.views.console.menu.Message;
import klondike.views.console.menu.command.Command;
import klondike.views.console.menu.command.CommandTitle;

public class MoveFromPileToFoundationCommand extends Command {

    public MoveFromPileToFoundationCommand(MoveController moveController) {
        super(CommandTitle.PILE2FOUNDATION_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        int pileIndex = Pile.readIndex(Message.ORIGIN);
        Suit suit = SuitUtils.read();
        return this.moveController.moveFromPileToFoundation(pileIndex, suit);
    }
}
