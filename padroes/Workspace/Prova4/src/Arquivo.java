public class Arquivo extends Arquivos{

	String nome;
	double tamanho;

	public Arquivo() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", tamanho=" + tamanho + "]";
	}
	
}
