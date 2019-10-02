package klondike.views.console.superclass.subclass;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.controllers.klondlike.imple.ResumeController;
import klondike.controllers.klondlike.imple.StartController;
import klondike.utils.YesNoDialog;
import klondike.views.console.menu.PlayMenu;
import klondike.views.console.superclass.GameView;
import klondike.views.console.superclass.Message;
import klondike.views.console.superclass.View;

public class ConsoleView extends View {

    private PlayMenu playMenu;

    public ConsoleView(StartController startController, MoveController moveController, ResumeController resumeController) {
        super(startController, moveController, resumeController);
        this.playMenu = new PlayMenu(this.moveController);
    }

    @Override
	public void start() {
        new GameView(this.startController).writeln();
    }

    @Override
	public void move() {
        this.playMenu.execute();
        new GameView(this.moveController).writeln();
    }

    @Override
	public boolean resume() {
        return new YesNoDialog().read(Message.RESUME);
    }
}
