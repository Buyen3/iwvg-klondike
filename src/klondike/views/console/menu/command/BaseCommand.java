package klondike.views.console.menu.command;

public abstract class BaseCommand {

    protected String title;

    protected BaseCommand(String title) {
        this.title = title;
    }

    public abstract void execute();

    public String getTitle() {
        return this.title;
    }

}
