package command;

public class FecharPortaoCommand implements Command {

    private Portao portao;

    public FecharPortaoCommand(Portao portao) {
        this.portao = portao;
    }

    @Override
    public void execute() {
        portao.fechar();
    }

    @Override
    public void undo() {
        portao.abrir();
    }
}