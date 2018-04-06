package builder;

public class Main {
	public static void main(String[] args) {
		Cozinha c = new Cozinha();
		
		SanduicheBuilder s = new HamburguerBuilder();
		SanduicheBuilder f = new FishburguerBuilder();
		
		c.fazSanduiche(s);
		s.getSanduiche();
		c.fazSanduiche(f);
		f.getSanduiche();
	}
}
