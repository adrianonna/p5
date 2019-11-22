package aulaExemploFM.modelo;

public class Rectangle extends Shape{

	public Rectangle(String tipo) {
		super(tipo);
		System.out.println("Rectangle");
	}
	
	public String draw(){
		return "Desenhou Retangulo";
	}

}
