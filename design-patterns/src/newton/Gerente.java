package newton;

public class Gerente extends Funcionario{

	private String area;

	@Override
	public Double calculaImposto() {
		return this.getSalario() * 0.95;
	}
	
	@Override
	public void imprimeDados() {
		System.out.println("Imprimindo dados de gerente.");
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Gerente [area=" + area + "]";
	}
	
}
