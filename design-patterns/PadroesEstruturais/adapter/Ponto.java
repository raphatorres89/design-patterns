package adapter;

import java.util.Date;

public class Ponto {

    public enum Tipo {
        ENTRADA, SAIDA
    }

    private Tipo tipo;
    private Date dataRegistro;

    public Ponto(Tipo tipo, Date dataRegistro) {
        this.tipo = tipo;
        this.dataRegistro = dataRegistro;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }
}
