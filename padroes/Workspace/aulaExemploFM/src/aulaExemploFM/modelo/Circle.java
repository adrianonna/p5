package aulaExemploFM.modelo;

public class Circle extends Shape{

	public Circle(String tipo) {
		super(tipo);
		System.out.println("Circulo");
	}

	
	public String draw(){
		return "Desenhou Circulo";
	}
	
	
}
