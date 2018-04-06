package newton;

public class Funcionario extends Pessoa {

	private Double salario;

	public Double calculaImposto() {
		return this.salario * 0.97;
	}
	
	@Override
	public void imprimeDados() {
		System.out.println("Imprimindo dados de funcionário.");
	}
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + "]";
	}
	
}
