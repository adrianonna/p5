
public class Adaptador extends SomadorExistente implements SomadorEsperado{

	public int somaVetor(int[] vetor) {
		int soma = 0;
		for (int i : vetor) {
			soma += i;
		}
		return soma;
	}

}
