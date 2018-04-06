package strategy;

public class PromocaoDeNatal implements Promocao {

    @Override
    public int desconto() {
        return 10;
    }
}