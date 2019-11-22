package br.edu.ifpb.pweb2.pratica1;

public class TreinoMeioTemporada implements TreinoIntf {

	@Override
	public void preparoFisico() {
		System.out.println("Preparo físico pesado com sessão se alongamentos no final.");
		
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo com a equipe de master.");
		
	}

	@Override
	public void treinoTatico() {
		System.out.println("Dibles e penaltis.");
		
	}

}
