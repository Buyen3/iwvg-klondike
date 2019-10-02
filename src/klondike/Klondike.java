package klondike;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.controllers.klondlike.imple.ResumeController;
import klondike.controllers.klondlike.imple.StartController;
import klondike.models.Game;
import klondike.views.console.superclass.View;
import klondike.views.console.superclass.subclass.ConsoleView;

public class Klondike{

    private final StartController startController;
    private final MoveController moveController;
    private final ResumeController resumeController;
    private View view;
    private Game game;

    private Klondike() {
        this.game = new Game();
        this.startController = new StartController(this.game);
        this.moveController = new MoveController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.view = new ConsoleView(startController, moveController, resumeController);
    }

    public static void main(String[] args) {
        new Klondike().play();
    }

    public void play() {
        view.interact();
    }
}