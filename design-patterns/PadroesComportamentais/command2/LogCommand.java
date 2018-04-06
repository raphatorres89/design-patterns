package command2;

import static java.lang.System.out;

public class LogCommand implements Command {

    @Override
    public void execute() {
        out.println("Escrevendo no log...");
    }
}