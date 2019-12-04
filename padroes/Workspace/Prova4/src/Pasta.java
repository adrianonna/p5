import java.util.ArrayList;
import java.util.List;

public class Pasta extends Arquivos{
	
	String nome;
	List<Pasta> listaSubpastas = new ArrayList<Pasta>();
	List<Arquivo> listaArquivos = new ArrayList<Arquivo>();
	
	public Pasta() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pasta> getSubPastas() {
		return listaSubpastas;
	}

	public void setSubPasta(Pasta pasta) {
		this.listaSubpastas.add(pasta);
	}

	public List<Arquivo> getListaArquivos() {
		return listaArquivos;
	}

	public void setArquivo(Arquivo arquivo) {
		this.listaArquivos.add(arquivo);
	}

	@Override
	public String toString() {
		return "Pasta [nome=" + nome + ", listaPastas=" + listaSubpastas + ", listaArquivos=" + listaArquivos + "]";
	}
	
}
