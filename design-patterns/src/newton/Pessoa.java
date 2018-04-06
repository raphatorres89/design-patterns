package newton;

import java.util.Date;

public abstract class Pessoa {

	protected String nome;

	protected Date nascimento;

	public void imprimeDados() {
		System.out.println("Imprimindo dados");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nascimento=" + nascimento + "]";
	}

}
