import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	List<Arquivos> listaArquivos = new ArrayList<Arquivos>();
	
	public Arquivos() {}
	
	public void setItens(Arquivos p) {
		this.listaArquivos.add(p);
	}
	
	public List<Arquivos> getListaItens(){
		return listaArquivos;
	}

	@Override
	public String toString() {
		return "Arquivos " + listaArquivos;
	}
	
}
