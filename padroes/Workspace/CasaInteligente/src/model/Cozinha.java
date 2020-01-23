package model;

import java.util.ArrayList;
import java.util.List;

public class Cozinha extends Ambiente {
	String nome;
	String descricao;
	Integer qtdePessoas;
	protected CozinhaState estado;
	List<Dispositivo> dispositivos = new ArrayList<Dispositivo>();
	
	public Cozinha() {
		nome = "Cozinha";
		descricao = "Sou um cozinha americana";
		estado = new CozinhaFamilia();
	}
	
	public void modoFesta() {
		System.out.println("Ativou modoFesta Cozinha!");
		estado = estado.modoFesta();
	}
	
	public void modoEconomia() {
		System.out.println("Ativou modoEconomia Cozinha!");
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

	public Integer getQtdePessoasCozinha() {
		return qtdePessoas;
	}

	public void setQtdePessoasCozinha(Integer qtdePessoasCozinha) {
		this.qtdePessoas = qtdePessoasCozinha;
	}
	
	public List<Dispositivo> getDispositivos() {
		return this.dispositivos;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivos.add(dispositivo);
	}
}
