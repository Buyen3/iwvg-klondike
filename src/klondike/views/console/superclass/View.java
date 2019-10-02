package klondike.views.console.superclass;

import klondike.controllers.klondlike.imple.MoveController;
import klondike.controllers.klondlike.imple.ResumeController;
import klondike.controllers.klondlike.imple.StartController;
import klondike.views.console.iview.IView;

public abstract class View implements IView {

    protected StartController startController;

    protected MoveController moveController;

    protected ResumeController resumeController;

    public View(StartController startController, MoveController moveController, ResumeController resumeController) {
        this.startController = startController;
        this.moveController = moveController;
        this.resumeController = resumeController;
    }

    public void interact() {
        boolean resume;
        do {
            this.start();
            boolean finished;
            do {
                this.move();
                finished = moveController.isGameFinished();
            } while (!finished);
            resume = this.resume();
            if (resume) resumeController.resume();
        } while (resume);
    }

    public abstract void start();

    public abstract void move();

    public abstract boolean resume();
}
