package model;

public class RedCircle implements DrawAPI {

	public RedCircle() {}
	
	public String drawCircle(int radius, int x, int y) {
		return("Desenho o circulo[ cor: vermelho, raio: " + radius + ", x: " + x + ", y:" + y + "]");
	}

}
