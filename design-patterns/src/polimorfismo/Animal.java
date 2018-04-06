package polimorfismo;

public abstract class Animal {

	protected Integer peso;
	protected Integer idade;
	protected Integer membros;

	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getMembros() {
		return membros;
	}

	public void setMembros(Integer membros) {
		this.membros = membros;
	}

}
