package work;

import model.Jogo;

public class Funcionario {

	private int idFunc;
	private String nomeFunc;
	private String filial;
	private Compra compra;
	
	public Funcionario(int idFunc, String nomeFunc, String filial) {
		super();
		this.idFunc = idFunc;
		this.nomeFunc = nomeFunc;
		this.filial = filial;
	}
	
	public Funcionario() {}
	
	public float solicitarAluguel(int idJogo) {
		float valor = 0;
		for (Jogo j : getCompra().getJogos()) {
			if (j.getIdJogo() == idJogo) {
				valor = j.getPrecoAluguel();
			}
		}
		return valor;
	}
	
	public float finalizarCompra() {
		float total = 0;
		int qtde = 0;
		for(Jogo j : getCompra().getJogos()) {
			total += j.calcularTotal();
		}
		for (Cliente c : getCompra().getClientes()) {
			qtde =+ 1;
		}
		return total / qtde;
	}

	public int getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	@Override
	public String toString() {
		return "Funcionario [idFunc=" + idFunc + ", nomeFunc=" + nomeFunc + ", filial=" + filial + ", compra=" + compra
				+ "]";
	}		
	
}
