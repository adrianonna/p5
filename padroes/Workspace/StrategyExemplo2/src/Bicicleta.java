
public class Bicicleta implements Transporte{

	@Override
	public void calcularTempo(double distancia) {
		double velocidade = 25;
		System.out.println("VOce chegara ao seu destino em: "+(distancia/velocidade)* 60);
	}

}
