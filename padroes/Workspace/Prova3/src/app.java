
public class app {

	public static void main(String[] args) {
		Lista lista1 = new ListaOrdenada(new Marcador());
		lista1.adicionar("s");
		lista1.adicionar("a");
		lista1.adicionar("-");
		lista1.adicionar("b");
		System.out.println(lista1.imprimir());
		
//		Lista lista2 = new ListaOrdenada(new Numero());
//		lista2.adicionar(1);
//		lista2.adicionar("a");
//		lista2.adicionar("-");
//		lista2.adicionar("b");
	}

}
