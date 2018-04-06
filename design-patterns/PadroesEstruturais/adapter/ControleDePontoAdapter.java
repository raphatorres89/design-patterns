package adapter;

import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

public class ControleDePontoAdapter extends ControleDePonto {

    private ControleDePontoNovo controleDePontoNovo;

    public ControleDePontoAdapter() {
        this.controleDePontoNovo = new ControleDePontoNovo();
    }

    @Override
    public void registrarEntrada(Funcionario funcionario) {
        controleDePontoNovo.registrar(funcionario, true);
    }

    @Override
    public void registrarSaida(Funcionario funcionario) {
        controleDePontoNovo.registrar(funcionario, false);
    }

    @Override
    public List<Ponto> getListaPontos(Funcionario funcionario) {
    	Multimap<Funcionario, Ponto> registrosDePonto = controleDePontoNovo.getRegistro();
        return Lists.newArrayList(registrosDePonto.get(funcionario));
    }
}