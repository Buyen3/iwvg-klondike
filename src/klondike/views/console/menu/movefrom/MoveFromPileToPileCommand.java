package klondike.views.console.menu.movefrom;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.models.enums.Error;
import klondike.models.stack.subclass.Pile;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;
import klondike.views.console.menu.Message;
import klondike.views.console.menu.command.Command;
import klondike.views.console.menu.command.CommandTitle;

public class MoveFromPileToPileCommand extends Command {

	public MoveFromPileToPileCommand(MoveController moveController) {
		super(CommandTitle.PILE2PILE_COMMAND.getTitle(), moveController);
	}

	@Override
	protected Error move() {
		int originIndex = Pile.readIndex(Message.ORIGIN);
		int destinationIndex = Pile.readIndex(Message.DESTINATION);
		int numberOfCards = IO.readInt(Message.READ_NUMBER_OF_CARDS, new ClosedInterval(1, 13));
		return this.moveController.moveFromPileToPile(originIndex, destinationIndex, numberOfCards);
	}
}
