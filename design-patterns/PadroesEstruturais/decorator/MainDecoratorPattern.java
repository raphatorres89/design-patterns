package decorator;

/**
 * Padrão que adiciona novas funcionalidades à objetos existentes 
 * sem alterar sua estrutura
 * 
 * @URL https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
 *
 */
public class MainDecoratorPattern {
	public static void main(String[] args) {

		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}