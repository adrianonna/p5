package aulaExemploFM.modelo;

public class Polygon extends Shape {

	public Polygon(String tipo) {
		super(tipo);
		System.out.println("Polygon");
	}
	
	public String draw(){
		return "Desenhou Poligono";
	}

}
