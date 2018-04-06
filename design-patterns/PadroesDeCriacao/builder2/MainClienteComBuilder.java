package builder2;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * Subclasse criada no ClienteComBuilder que torna mais flexível o construtor
 * 
 * @URL https://cezbatistao.wordpress.com/2016/05/21/design-pattern-builder/
 */
public class MainClienteComBuilder {

    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, 1982);
        calendario.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 15);
        Date dataNascimento = calendario.getTime();

        ClienteComBuilder clienteComBuilder = new ClienteComBuilder.Builder()
        		.comNome("Carlos")
        		.comDataNascimento(dataNascimento)
        		.comEmail("carlos@email.com.br")
                .noLogradouro("Rua Sem Nome")
                .noNumero(10)
                .noBairro("Nome do Bairro")
                .noCep("11.111-99")
                .naUf("SP")
                .naCidade("Campinas")
                .comTelefoneCelular("19-91111-1111")
                .build();


        System.out.println("Dados do Cliente: " + clienteComBuilder.toString());
    }
}
