package br.edu.ifpb.pweb2.pratica2;

import org.springframework.stereotype.Component;

@Component
public class TreinoInicioTemporada implements TreinoIntf{

	@Override
	public void preparoFisico() {
		System.out.println("Preparo físico leve com sessão se alongamentos no final");
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo com a equipe de juniores");	
	}

	@Override
	public void treinoTatico() {
		System.out.println("Cobrança de escanteios e faltas");
	}

}
