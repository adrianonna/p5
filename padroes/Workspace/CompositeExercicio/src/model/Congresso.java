package model;

import java.util.List;

public class Congresso {

	Participantes p;
	private int qtdeAssentos;
	
	public Congresso() {}
	
	public void setParticipantes(Participantes p) {
		this.p = p;
	}
	
	public List<Participantes> getTotalParticipantes() {
		int qtdeInst = 0;
		int qtdeInd = 0;
		int soma = 0;
		for (int i = 0; i < p.getParticipantes().size(); i++) {
			if (p.getParticipantes().get(i).getClass().getName() == "model.Instituicao") {				
				Instituicao inst = (Instituicao) p.getParticipantes().get(i);
				qtdeInst += inst.listaInd.size();
			}
			if (p.getParticipantes().get(i).getClass().getName() == "model.Individuo") {				
				qtdeInd += 1;
			}
		}
		soma = qtdeInst + qtdeInd;
		System.out.println(soma+" Participantes ao total!");
		System.out.println(qtdeInst+" participantes de instituições!");
		System.out.println(qtdeInd+" participantes alone!");
		return this.p.getParticipantes();
	}

	public int getQtdeAssentosVagos() {
		int qtdeInst = 0;
		int qtdeInd = 0;
		int soma = 0;
		for (int i = 0; i < p.getParticipantes().size(); i++) {
			if (p.getParticipantes().get(i).getClass().getName() == "model.Instituicao") {				
				Instituicao inst = (Instituicao) p.getParticipantes().get(i);
				qtdeInst += inst.listaInd.size();
			}
			if (p.getParticipantes().get(i).getClass().getName() == "model.Individuo") {				
				qtdeInd += 1;
			}
		}
		soma = qtdeInst + qtdeInd;
		return qtdeAssentos - soma;
	}

	public void setQtdeAssentos(int qtdeAssentos) {
		this.qtdeAssentos = qtdeAssentos;
	}

	@Override
	public String toString() {
		return "Congresso [p=" + p + ", qtdeAssentos=" + qtdeAssentos + "]";
	}
	
}
