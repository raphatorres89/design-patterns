package strategy;

public class PromocaoDescontoProgressivo implements Promocao {

    public Integer desconto;

    public PromocaoDescontoProgressivo(int numeroItens) {
        if(numeroItens >= 4) {
            desconto = 40;
        } else if(numeroItens == 3) {
            desconto = 30;
        } else if(numeroItens == 2) {
            desconto = 20;
        } else if(numeroItens == 1) {
            desconto = 10;
        } else {
            desconto = 0;
        }
    }

    @Override
    public int desconto() {
        return desconto;
    }
}