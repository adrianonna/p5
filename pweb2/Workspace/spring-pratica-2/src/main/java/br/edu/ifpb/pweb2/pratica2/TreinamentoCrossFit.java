package br.edu.ifpb.pweb2.pratica2;

public class TreinamentoCrossFit implements TreinamentoIntf{

	
	private TreinoIntf treino;

	public TreinamentoCrossFit(TreinoIntf treino) {
		this.treino = treino;
	}

	@Override
	public void fazTreinamento() {
		System.out.println("Vamos lá, moçada, sem moleza");
		System.out.println("Primeiro: ");
		treino.preparoFisico();
		System.out.println("Agora quero: ");
		treino.jogoTreino();
		System.out.println("Para terminar: ");
		treino.treinoTatico();
	}
}
