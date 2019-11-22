package br.edu.ifpb.pweb2.pratica2;

public class TreinoFimTemporada implements TreinoIntf{

	@Override
	public void preparoFisico() {
		System.out.println("FIM Preparo f�sico leve com sess�o se alongamentos no final");
	}

	@Override
	public void jogoTreino() {
		System.out.println("FIM Jogo com a equipe de juniores");	
	}

	@Override
	public void treinoTatico() {
		System.out.println("FIM Cobran�a de escanteios e faltas");
	}
}
