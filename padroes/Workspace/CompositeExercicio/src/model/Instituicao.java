package model;

import java.util.ArrayList;
import java.util.List;

public class Instituicao extends Participantes{

	List<Individuo> listaInd = new ArrayList<Individuo>();
	private String nomeInst;
	
	public Instituicao() {
		super();
	}

	public List<Individuo> getListaInd() {
		return listaInd;
	}
	
	public void setListaInd(Individuo listaInd) {
		this.listaInd.add(listaInd);
	}

	public String getNomeInst() {
		return nomeInst;
	}

	public void setNomeInst(String nomeInst) {
		this.nomeInst = nomeInst;
	}

	@Override
	public String toString() {
		return "Instituicao [listaInd=" + listaInd + ", nomeInst=" + nomeInst + "]";
	}
	
}
