package model;

public class JogoRV extends JogoDigital {

	private String tipoCapacete;
	private String estereoscopia;
	
	public JogoRV(int anoCriacao, String produtora, int idJogo, String nome, int quantidadeJogos, float precoAluguel,
			int quantidadePessoas, String tipoCapacete, String estereoscopia) {
		super(anoCriacao, produtora, idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		this.tipoCapacete = tipoCapacete;
		this.estereoscopia = estereoscopia;
	}

	public JogoRV() {}
	
	public float calcularTotal() {
		return (float) (super.getPrecoAluguel() / super.getQuantidadePessoas() * 1.2);
	}

	public String getTipoCapacete() {
		return tipoCapacete;
	}

	public void setTipoCapacete(String tipoCapacete) {
		this.tipoCapacete = tipoCapacete;
	}

	public String getEstereoscopia() {
		return estereoscopia;
	}

	public void setEstereoscopia(String estereoscopia) {
		this.estereoscopia = estereoscopia;
	}

	@Override
	public String toString() {
		return "jogoRV [tipoCapacete=" + tipoCapacete + ", estereoscopia=" + estereoscopia + "]";
	}
	
	
	
}
