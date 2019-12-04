import java.util.ArrayList;
import java.util.List;

public class ListaNaoOrdenada extends Lista{

	List<String> lista= new ArrayList<String>();
	
	public ListaNaoOrdenada(Ponte ponte) {
		super(ponte);
	}
	
	public void adicionar(String s) {
		this.lista.add(s);
	};

	@Override
	public List<String> imprimir() {
		return lista;
	}

	@Override
	public String toString() {
		return "ListaNaoOrdenada [lista=" + lista + "]";
	}

}
