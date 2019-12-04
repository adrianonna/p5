import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada extends Lista{

	List<String> lista = new ArrayList<String>();
	
	public ListaOrdenada(Ponte ponte) {
		super(ponte);
	}

	public void adicionar(String s) {
		this.lista.add(s);
	};
	
	@Override
	public List<String> imprimir() {
		Collections.sort(lista, Collator.getInstance());
		return lista;
	}

	@Override
	public String toString() {
		return "ListaOrdenada [lista=" + lista + "]";
	}

}
