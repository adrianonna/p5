import java.util.Observable;
import java.util.Observer;

public class CarroPolicia implements Observer, Carro{



	@Override
	public void frente() {
		System.out.println("Viatura segue em frente!");
	}

	@Override
	public void direita() {
		System.out.println("Viatura vira a direita!");		
	}

	@Override
	public void esquerda() {
		System.out.println("Viatura vira a esquerda!");		
	}

	@Override
	public void para() {
		System.out.println("Viatura para!");		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		CarroRoubado carroObservado = (CarroRoubado)o;
		String acao = String.valueOf(arg);
		if(acao.equalsIgnoreCase("frente")) {
			this.frente();
		}
		else if(acao.equalsIgnoreCase("direita")) {
			this.direita();
		}
		else if(acao.equalsIgnoreCase("esquerda")) {
			this.esquerda();
		}
		else if(acao.equalsIgnoreCase("para")) {
			this.para();
		}
	}

}
