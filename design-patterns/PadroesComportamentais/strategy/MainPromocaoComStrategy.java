package strategy;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Tudo está encapsulado em classes que implementem a interface Promocao e 
 * basta informamos a promoção que quermos conceder que 
 * ao chamar o método concederPromocao e o método valorCompra calculará o valor final
 * 
 * @URL https://cezbatistao.wordpress.com/2016/05/22/design-pattern-strategy/
 *
 */
public class MainPromocaoComStrategy {

	public static void main(String[] args) {
		Produto celularMotoGPlus = new Produto("Smartphone Moto G 4 Plus", 1499.00);
		CompraComStrategy comprarNoLancamento = new CompraComStrategy();
		comprarNoLancamento.comprar(celularMotoGPlus, 1);
		out.println(format("Valor do %s: R$ %g", celularMotoGPlus.getNome(), comprarNoLancamento.valorCompra()));

		CompraComStrategy comprarNoDiaDosNamorados = new CompraComStrategy();
		comprarNoDiaDosNamorados.comprar(celularMotoGPlus, 1);
		comprarNoDiaDosNamorados.concederPromocao(new PromocaoDiaDosNamorados());
		out.println(format("Valor do %s: no Dia dos Namorados R$ %g", celularMotoGPlus.getNome(), comprarNoDiaDosNamorados.valorCompra()));

		CompraComStrategy comprarNoNatal = new CompraComStrategy();
		comprarNoNatal.comprar(celularMotoGPlus, 1);
		comprarNoNatal.concederPromocao(new PromocaoDeNatal());
		out.println(format("Valor do %s: no Natal R$ %g", celularMotoGPlus.getNome(), comprarNoNatal.valorCompra()));

		CompraComStrategy comprarQuandoForSairProximoModelo = new CompraComStrategy();
		comprarQuandoForSairProximoModelo.comprar(celularMotoGPlus, 1);
		comprarQuandoForSairProximoModelo.concederPromocao(new PromocaoQueimaDeEstoque());
		out.println(format("Valor do %s: daqui um ano R$ %g", celularMotoGPlus.getNome(), comprarQuandoForSairProximoModelo.valorCompra()));

		int quantidadeComprada = 3;
		CompraComStrategy comprarMaisDeDoisDeUmaVezPeca = new CompraComStrategy();
		comprarMaisDeDoisDeUmaVezPeca.comprar(celularMotoGPlus, quantidadeComprada);
		comprarMaisDeDoisDeUmaVezPeca.concederPromocao(new PromocaoDescontoProgressivo(quantidadeComprada));
		out.println(format("Valor do %s: daqui um ano R$ %g", celularMotoGPlus.getNome(), comprarMaisDeDoisDeUmaVezPeca.valorCompra()));
	}
}