package flyweight;

/**
 * É um padrão primeiramente usado para reduzir o numero de objetos criados e para 
 * diminuir o uso de memória e aumentar a performance
 * 
 * O padrão tenta reusar objetos similares guardando e criando novos quando não coincidir
 * 
 * @URL https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm
 *
 */
public class MainFlyweightPattern {
	
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args) {

		for (int i = 0; i < 20; ++i) {
			// faz o cast pra não criar um objeto novo
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}