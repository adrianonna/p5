package app;

import model.Congresso;
import model.Individuo;
import model.Instituicao;
import model.Participantes;

public class app {

	public static void main(String[] args) {
		Congresso c = new Congresso();
		c.setQtdeAssentos(100);
		Participantes p = new Participantes();
		
		Individuo ind = new Individuo();
		ind.setNome("Adriano");
		ind.setAssento(1);
		p.setParticipantes(ind);
		
		Instituicao inst = new Instituicao();
		inst.setNomeInst("IFPB");
		
		Individuo ind2 = new Individuo();
		ind2.setNome("Samuel");
		ind2.setAssento(2);
		inst.setListaInd(ind2);
		
		Individuo ind3 = new Individuo();
		ind3.setNome("Renatha");
		ind3.setAssento(3);
		inst.setListaInd(ind3);
		
		p.setParticipantes(inst);
		c.setParticipantes(p);
		
		System.out.println(c.getTotalParticipantes());
		System.out.println(c.getQtdeAssentosVagos()+" assentos vagos!");
	}

}
