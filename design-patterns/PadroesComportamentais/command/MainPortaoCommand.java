package command;

/**
 * O Design Pattern Command tem como objetivo criar objetos que encapsulam uma solicitação
 * para executar um objeto específico.
 * 
 * @URL https://cezbatistao.wordpress.com/2016/05/21/design-pattern-command/
 * 
 */
public class MainPortaoCommand {

	public static void main(String[] args) {
		Portao portaoDeCasa = new Portao();
		Controle controle = new Controle(new AbrirPortaoCommand(portaoDeCasa), new FecharPortaoCommand(portaoDeCasa));

		System.out.println(portaoDeCasa.toString());

		controle.abrirPortao();

		System.out.println(portaoDeCasa.toString());

		controle.fecharPortal();

		System.out.println(portaoDeCasa.toString());

		controle.abrirPortao();

		System.out.println(portaoDeCasa.toString());

		controle.desfazer();

		System.out.println(portaoDeCasa.toString());
	}
}