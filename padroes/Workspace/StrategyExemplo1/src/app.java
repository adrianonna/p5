import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)){
			System.out.println("Informe a distancia: ");
			int distancia = entrada.nextInt();
			System.out.println("Qual o tipo de frete? (1) Normal, (2) Sedex");
			int opcaoFrete = entrada.nextInt();
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
			
			Frete frete = null;
			if (tipoFrete.equals(TipoFrete.NORMAL)) {
				frete = new Normal();
			}
			double preco = frete.calcularPreco(distancia);
			System.out.printf("O valor total é de: R$%.2f", preco);
		}
	}

}
