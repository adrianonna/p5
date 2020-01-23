package model;

import java.util.ArrayList;
import java.util.List;

public class Quarto extends Ambiente {
	String nome;
	String descricao;
	Integer qtdePessoas;
	protected QuartoState estado;
	List<Dispositivo> dispositivos = new ArrayList<Dispositivo>();
	
	public Quarto() {
		nome = "Quarto";
		descricao = "Sou uma suite";
		estado = new QuartoFamilia();
	}
	
	public void modoFesta() {
		System.out.println("Ativou modoFesta Quarto!");
		estado = estado.modoFesta();
	}
	
	public void ModoEconomia() {
		System.out.println("Ativou modoEconomia Quarto!");
		estado = estado.ModoEconomia();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQtdePessoasQuarto() {
		return qtdePessoas;
	}

	public void setQtdePessoasQuarto(Integer qtdePessoasQuarto) {
		this.qtdePessoas = qtdePessoasQuarto;
	}

	public List<Dispositivo> getDispositivos() {
		return this.dispositivos;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivos.add(dispositivo);
	}	
}
