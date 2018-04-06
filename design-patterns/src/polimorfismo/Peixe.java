package polimorfismo;

public class Peixe extends Animal {

	private String corEscama;
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo algas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de peixe");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	
}
