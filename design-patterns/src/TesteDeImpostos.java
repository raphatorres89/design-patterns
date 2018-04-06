
public class TesteDeImpostos {

	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();
	
		Orcamento orcamento = new Orcamento(500);
		
		CalculadorDeImposto calcular = new CalculadorDeImposto();
		
		calcular.realizaCalculo(orcamento, icms);
		calcular.realizaCalculo(orcamento, iss);
	}

}
