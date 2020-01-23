package model;

import java.util.ArrayList;
import java.util.List;

public class Sala extends Ambiente {
	String nome;
	String descricao;
	Integer qtdePessoas;
	protected SalaState estado;
	List<Dispositivo> dispositivos = new ArrayList<Dispositivo>();
	
	public Sala() {
		nome = "Sala";
		descricao = "Sou uma sala de estar";
		estado = new SalaFamilia();
	}
	
	public void modoFesta() {
		System.out.println("Ativou modoFesta Sala!");
		estado = estado.modoFesta();
	}
	
	public void modoEconomia() {
		System.out.println("Ativou modoEconomia Sala!");
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

	public Integer getQtdePessoasSala() {
		return qtdePessoas;
	}

	public void setQtdePessoasSala(Integer qtdePessoasSala) {
		this.qtdePessoas = qtdePessoasSala;
	}

	public List<Dispositivo> getDispositivos() {
		return this.dispositivos;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivos.add(dispositivo);
	}
}
