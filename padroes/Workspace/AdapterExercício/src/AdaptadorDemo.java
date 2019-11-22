import java.util.ArrayList;
import java.util.List;

public class AdaptadorDemo {
	
	public static void main(String[] args) {
		int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		Adaptador a = new Adaptador();
		
		System.out.println(a.somaVetor(vetor));
		System.out.println(a.somaLista(lista));
	}
	
}
