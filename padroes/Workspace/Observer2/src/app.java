
public class app {

	public static void main(String[] args) {
		//posso passar o nome da variável por parâmetro
		//e determinar cada ação para cada uma delas dentro do CarroPolicia
		CarroPolicia carroP1 = new CarroPolicia();
		CarroRoubado carroR1 = new CarroRoubado();
		
		carroR1.addObserver(carroP1);
		
		carroR1.frente();
		carroR1.direita();
		carroR1.esquerda();
		carroR1.para();
	}

}
