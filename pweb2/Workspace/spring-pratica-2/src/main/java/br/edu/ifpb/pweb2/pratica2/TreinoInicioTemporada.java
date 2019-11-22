package br.edu.ifpb.pweb2.pratica2;

import org.springframework.stereotype.Component;

@Component
public class TreinoInicioTemporada implements TreinoIntf{

	@Override
	public void preparoFisico() {
		System.out.println("Preparo f�sico leve com sess�o se alongamentos no final");
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo com a equipe de juniores");	
	}

	@Override
	public void treinoTatico() {
		System.out.println("Cobran�a de escanteios e faltas");
	}

}
