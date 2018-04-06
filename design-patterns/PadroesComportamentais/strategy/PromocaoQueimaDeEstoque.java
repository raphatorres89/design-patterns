package strategy;

public class PromocaoQueimaDeEstoque implements Promocao {

	@Override
	public int desconto() {
		return 25;
	}
}
