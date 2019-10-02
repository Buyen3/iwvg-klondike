package klondike.utils;

import java.util.ArrayList;

import klondike.views.console.menu.command.BaseCommand;



public abstract class Menu {

    private static final String OPTION = "Choose an option: ";
    private ArrayList<BaseCommand> commandList;

    public Menu() {
        this.commandList = new ArrayList<BaseCommand>();
    }

    public void execute() {
        ArrayList<BaseCommand> commands = new ArrayList<BaseCommand>();
        for (int i = 0; i < this.commandList.size(); i++) {
            commands.add(this.commandList.get(i));
        }
        boolean error;
        int option;
        do {
            error = false;
            for (int i = 0; i < commands.size(); i++) {
                IO.writeln((i + 1) + ") " + commands.get(i).getTitle());
            }
            IO.write(OPTION);
            option = IO.readInt("") - 1;
            if (!new ClosedInterval(0, commands.size() - 1).includes(option)) {
                error = true;
            }
            IO.writeln();
        } while (error);
        commands.get(option).execute();
    }

    protected void addCommand(BaseCommand command) {
        this.commandList.add(command);
    }

}
