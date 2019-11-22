package br.edu.ifpb.pweb2.pratica2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //singleton aponta para o mesmo endereço de memória, prototype endereços de memória diferentes
public class Treinamento implements TreinamentoIntf {

//	@Autowired
//	@Qualifier("treinoInicioTemporada")
	private TreinoIntf treino;
	
	@Autowired
	public Treinamento(@Qualifier("treinoInicioTemporada") TreinoIntf treino) {
		this.treino = treino;
	}
	
	public Treinamento() {}
	
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

	public TreinoIntf getTreino() {
		return treino;
	}

//	@Autowired
//	@Qualifier("treinoInicioTemporada")
	public void setTreino(TreinoIntf treino) {
		this.treino = treino;
	}
	
	

}
