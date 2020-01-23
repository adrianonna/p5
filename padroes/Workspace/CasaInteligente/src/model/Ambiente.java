package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Ambiente{
	String nome;
	String descricao;
	Integer qtdePessoas;
	List<Dispositivo> dispositivos = new ArrayList<Dispositivo>();

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
	
	public List<Dispositivo> getDispositivos() {
		return this.dispositivos;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivos.add(dispositivo);
	}

}
