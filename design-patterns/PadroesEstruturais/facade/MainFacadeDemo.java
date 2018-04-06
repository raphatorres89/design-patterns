package facade;

/**
 * O padrão envolve uma única classe que provê métodos simples para delegar chamadas a métodos existentes em outras classes
 *
 * @URL https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
 *
 */
public class MainFacadeDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}