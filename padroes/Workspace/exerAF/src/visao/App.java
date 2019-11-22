package visao;

import modelo.Carro;
import modelo.CarroFactory;
import modelo.CarroLuxoFactory;
import modelo.CarroPopularFactory;

public class App {
	
	private static Carro montarCarro(String tipo){
		CarroFactory cf = null;
		if (tipo.compareTo("luxo") == 0)
			cf = new CarroLuxoFactory();
		
		else if (tipo.compareTo("popular") == 0) 
			cf = new CarroPopularFactory();
	
		Carro c = new Carro();
		c.setRoda(cf.montarRoda());
		c.setSom(cf.montarSom());
		return c;
	}

	
	public static void main(String[] args){
		Carro c1 = montarCarro("luxo");
		Carro c2 = montarCarro("popular");
		
		System.out.println("Luxo: "+c1);
		System.out.println("Popular: "+c2);
	}

}
