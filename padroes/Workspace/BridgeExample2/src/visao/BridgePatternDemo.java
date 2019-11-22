package visao;
import model.Circle;
import model.GreenCircle;
import model.RedCircle;
import model.Shape;

public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		System.out.println(redCircle.draw());
		System.out.println(greenCircle.draw());
	}

}
