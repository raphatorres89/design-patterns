package command2;

import java.util.ArrayList;
import java.util.List;

/**
 * qualquer outra tarefa nova basta implementar a interface Command 
 * e colocarmos na lista que ele será executada
 * 
 * @URL https://cezbatistao.wordpress.com/2016/05/21/design-pattern-command/
 *
 */
public class MainBonusCommand {

    public static void main(String[] args) {
        List<Command> comandos = new ArrayList<>();
        String texto = "Encadeando processos com o Design Pattern Command!";
        comandos.add(new EmailCommand("remetente@email.com.br", "destinatario@email.com.br", "Command Queue", texto));
        comandos.add(new FileIOCommand(texto));
        comandos.add(new LogCommand());
        comandos.add(new SmsCommand("(99) 99999-9999"));

        for (Command comando : comandos) {
            comando.execute();
        }
    }
}