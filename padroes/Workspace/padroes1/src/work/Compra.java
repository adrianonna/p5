package work;

import java.util.List;

import model.Jogo;


public class Compra {
	private List<Jogo> jogos;
	private int tempo;
	private List<Cliente> clientes;
	private Funcionario funcionatio;
	
	public Compra(List<Jogo> jogos, int tempo, List<Cliente> cliente, Funcionario funcionatio) {
		super();
		this.jogos = jogos;
		this.tempo = tempo;
		this.clientes = cliente;
		this.funcionatio = funcionatio;
	}
	
	public Compra() {}
	
	public float calcularCompra() {
		float total = 0;
		for(Jogo j : getJogos()) {
			total += j.calcularTotal();
		}
		return total;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogo(Jogo jogo) {
		this.jogos.add(jogo);
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public Funcionario getFuncionatio() {
		return funcionatio;
	}

	public void setFuncionatio(Funcionario funcionatio) {
		this.funcionatio = funcionatio;
	}

	@Override
	public String toString() {
		return "Compra [jogo=" + jogos + ", tempo=" + tempo + ", cliente=" + clientes + ", funcionatio=" + funcionatio
				+ "]";
	}
	
	
	
}
