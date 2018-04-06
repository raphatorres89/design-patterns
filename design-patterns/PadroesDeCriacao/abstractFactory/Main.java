package abstractFactory;

/**
 * Inteface FabricaDeCarro implementa CarroSedan e CarroPopular
 * Interface CarroSedan implementa exibirInfoSedan
 * Interface CarroPopular implementa exibirInfoPopular
 * Siena exibe info de carro Sedan
 * Palio exibe info de carro Popular
 * 
 * @URL https://brizeno.wordpress.com/category/padroes-de-projeto/abstract-factory/
 * 
 */
public class Main {

	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaFiat();
	    CarroSedan sedan = fabrica.criarCarroSedan();
	    CarroPopular popular = fabrica.criarCarroPopular();
	    sedan.exibirInfoSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	    System.out.println();
	 
	    fabrica = new FabricaFord();
	    sedan = fabrica.criarCarroSedan();
	    popular = fabrica.criarCarroPopular();
	    sedan.exibirInfoSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	}
}
