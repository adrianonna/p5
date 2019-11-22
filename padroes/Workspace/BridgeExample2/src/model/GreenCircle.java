package model;

public class GreenCircle implements DrawAPI {
	
	public GreenCircle() {}
	
	public String drawCircle(int radius, int x, int y) {
		return("Desenho o circulo[ cor: verde, raio: " + radius + ", x: " + x + ", y:" + y + "]");
	}
	

}
