package strategy;

public class PromocaoDiaDosNamorados implements Promocao {

    @Override
    public int desconto() {
        return 15;
    }
}