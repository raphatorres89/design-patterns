package newton;

public class Cliente extends Pessoa {

	private Integer codigo;

	@Override
	public void imprimeDados() {
		System.out.println("Imprimindo dados de Cliente.");
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + "]";
	}
}
