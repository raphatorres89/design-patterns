package command2;

import static java.lang.String.format;
import static java.lang.System.out;

public class SmsCommand implements Command {

    private String numeroCelular;

    public SmsCommand(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public void execute() {
        out.println(format("Enviando SMS para: %s", numeroCelular));
    }
}