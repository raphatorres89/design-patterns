package proxy;

/**
 * Padrão Proxy é uma classe representando a funcionalidade de outra classe
 * Criamos um objeto tendo o objeto original, para conectar sua funcionalidade ao mundo externo.
 * 
 * @URL https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm
 *
 */
public class MainProxyPattern {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}
