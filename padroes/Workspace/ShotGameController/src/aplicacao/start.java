package aplicacao;

import controller.PontuacaoController;
import model.Espiao;
import model.ExercitoInimigo;
import model.Inimigos;
import model.Pontuacao;
import model.SoldadoGuerrilha;

public class start {

	public static void main(String[] args) {
		
		PontuacaoController po = new PontuacaoController();

		Pontuacao pSoldado = new Pontuacao(1000);
		Inimigos s1 = new SoldadoGuerrilha(5, 8, 8, pSoldado);
		
		Pontuacao pEspiao = new Pontuacao(1000);
		Inimigos es1 = new Espiao(10, 7, 10, pEspiao);
		
		Pontuacao pExercito = new Pontuacao(1000);
		Inimigos ex1 = new ExercitoInimigo(2, 7, 10, pExercito);
				
		po.atacar(es1,s1);		
		po.atacar(es1,s1);		
		po.atacar(es1,s1);		
		po.atacar(es1,s1);		
		po.atacar(es1,s1);		
		po.atacar(es1,s1);		
		po.atacar(es1,s1);		
		po.atacar(es1,s1);		
		po.atacar(es1,s1);		
		po.atacar(es1,s1);
		

	}

}
