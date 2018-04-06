package command2;

import static java.lang.String.format;
import static java.lang.System.out;

public class EmailCommand implements Command {

	private String remetente;
	private String destinatario;
	private String assunto;
	private String texto;

	public EmailCommand(String remetente, String destinatario, String assunto, String texto) {
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.assunto = assunto;
		this.texto = texto;
	}

	@Override
	public void execute() {
		out.println(format("Enviando e-mail de: %s, para: %s, com assunto: %s, com o texto: %s", remetente, destinatario, assunto, texto));
	}
	
}