package aulaExemploFM.visao;

import aulaExemploFM.modelo.FactoryShape;
import aulaExemploFM.modelo.Shape;

public class Cliente {

	public static void main(String[] args) {
		FactoryShape fabrica = new FactoryShape();
		Shape sh = fabrica.getShape("circulo");
		System.out.println(sh.draw());
		
		Shape sh2 = fabrica.getShape("retangulo");
		System.out.println(sh2.draw());

	}

}
