package adapter;

import adapter.ControleDePontoAdapter;
import adapter.Funcionario;
import adapter.ControleDePonto;

/**
 * aqui está a manha do negócio:
 * ControleDePonto controleDePonto = new ControleDePontoAdapter();
 * 
 * @URL https://cezbatistao.wordpress.com/2016/05/21/design-pattern-adapter/
 */

public class MainControleDePontoAdapter {

    public static void main(String[] args) throws InterruptedException {
        ControleDePonto controleDePonto = new ControleDePontoAdapter();
        Funcionario funcionarioCarlos = new Funcionario("Carlos");

        controleDePonto.registrarEntrada(funcionarioCarlos);
        Thread.sleep(3000);
        controleDePonto.registrarSaida(funcionarioCarlos);
    }
}