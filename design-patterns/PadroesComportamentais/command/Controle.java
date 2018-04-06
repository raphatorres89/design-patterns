package command;

public class Controle {

	private Command[] comandos;
	private Command ultimoComando;

	public Controle(Command abrirCommand, Command fecharCommand) {
		this.comandos = new Command[2];
		this.comandos[0] = abrirCommand;
		this.comandos[1] = fecharCommand;

		this.ultimoComando = new SemAcaoCommand();
	}

	public void abrirPortao() {
		comandos[0].execute();
		ultimoComando = comandos[0];
	}

	public void fecharPortal() {
		comandos[1].execute();
		ultimoComando = comandos[1];
	}

	public void desfazer() {
		ultimoComando.undo();
	}
}