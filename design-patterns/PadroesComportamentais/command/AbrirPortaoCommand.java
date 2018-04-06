package command;

public class AbrirPortaoCommand implements Command {

	private Portao portao;

	public AbrirPortaoCommand(Portao portao) {
		this.portao = portao;
	}

	@Override
	public void execute() {
		portao.abrir();
	}

	@Override
	public void undo() {
		portao.fechar();
	}
}
