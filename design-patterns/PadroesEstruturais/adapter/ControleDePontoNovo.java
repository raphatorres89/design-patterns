package adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * Created by ceb on 18/05/16.
 */
public class ControleDePontoNovo {

    private SimpleDateFormat simpleDateFormat;
    private Multimap<Funcionario, Ponto> registro;

    public ControleDePontoNovo() {
        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
        registro = ArrayListMultimap.create();
    }

    public void registrar(Funcionario funcionario, boolean entrada) {
        Date dataRegistro = new Date();

        String format = simpleDateFormat.format(dataRegistro);
        if (entrada) {
            registro.put(funcionario, new Ponto(Ponto.Tipo.ENTRADA, dataRegistro));
            System.out.println("[ControleDePontoNovo] Entrada do(a) funcionário(a): " + funcionario.getNome() + " às " + format);
        } else {
            registro.put(funcionario, new Ponto(Ponto.Tipo.SAIDA, dataRegistro));
            System.out.println("[ControleDePontoNovo] Saída do(a) funcionário(a): " + funcionario.getNome() + " às " + format);
        }
    }

    public Multimap<Funcionario, Ponto> getRegistro() {
        return registro;
    }
}