package singleton;

/**
 * SingletonPattern torna o construtor privado e cria uma instância estática de si mesmo
 * para garantir que apenas um objeto seja instanciado.
 * 
 * @URL https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 *
 */
public class MainSingletonPattern {

	public static void main(String[] args) {
		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();

		// Get the only object available
		SingleObject object = SingleObject.getInstance();

		// show the message
		object.showMessage();
	}
}
