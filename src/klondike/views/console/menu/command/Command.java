package klondike.views.console.menu.command;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.models.enums.Error;
import klondike.utils.IO;
import klondike.views.console.menu.Message;

public abstract class Command extends BaseCommand {

    protected MoveController moveController;

    protected Command(String title, MoveController moveController) {
        super(title);
        this.moveController = moveController;
    }

    @Override
	public void execute() {
        Error error = this.move();
        if (error != null) {
            IO.writeError(Message.INVALID_MOVE, error.getMessage());
        }
    }

    protected abstract Error move();
}
