
public class app {

	public static void main(String[] args) {
		double distancia = 100;
		
		Transporte transp = new Carro();
		transp.calcularTempo(distancia);
		
		transp = new Onibus();
		transp.calcularTempo(distancia);
		
		transp = new Bicicleta();
		transp.calcularTempo(distancia);
	}

}
