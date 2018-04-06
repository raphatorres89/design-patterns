package polimorfismo;

/**
 * Animal é a classe mãe
 * Mamífero herda Animal e seus métodos
 * Animal se locomove correndo
 * Canguru herda Mamífero
 * Canguru se locomove pulando
 * 
 * @author raphael.torres
 * @URL https://www.youtube.com/watch?v=9-3-RMEMcq4
 */
public class Main {

	public static void main(String[] args) {

		Mamifero m = new Mamifero();

		m.setPeso(20);
		m.setIdade(2);
		m.setMembros(4);
		m.alimentar();
		m.locomover();
		m.emitirSom();

		Canguru c = new Canguru();
		
		c.locomover();
	}
}
