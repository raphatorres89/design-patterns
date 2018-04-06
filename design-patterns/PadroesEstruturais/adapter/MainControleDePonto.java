package adapter;

import adapter.ControleDePonto;
import adapter.Funcionario;

public class MainControleDePonto {

    public static void main(String[] args) throws InterruptedException {
        ControleDePonto controleDePonto = new ControleDePonto();
        Funcionario funcionarioCarlos = new Funcionario("Carlos");

        controleDePonto.registrarEntrada(funcionarioCarlos);
        Thread.sleep(3000);
        controleDePonto.registrarSaida(funcionarioCarlos);
    }
}