package aulaExemploFM.modelo;

public class FactoryShape {
	
	
	public FactoryShape(){}
	
	
	public Shape getShape(String tipo){
		if (tipo.equals("retangulo"))
			return new Rectangle("retangulo");
		
		else if (tipo.equals("poligono"))
			return new Polygon("poligono");
		
		else if (tipo.equals("circulo"))
			return new Circle("circulo");
		
		else return null;
			
	}
	

}
			