
public class Carro implements Transporte{

	@Override
	public void calcularTempo(double distancia) {
		double velocidade = 50;
		System.out.println("VOce chegara ao seu destino em: "+(distancia/velocidade)* 60);
	}

}
