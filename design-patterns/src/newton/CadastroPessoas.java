package newton;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public void imprimeCadastro() {
		for (Pessoa p : pessoas) {
			System.out.println(p.toString());
		}
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
}
