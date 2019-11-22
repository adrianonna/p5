package controller;

import model.Espiao;
import model.ExercitoInimigo;
import model.Inimigos;
import model.SoldadoGuerrilha;

public class PontuacaoController {

	public PontuacaoController() {}
	
	public void atacar(Inimigos primeiro, Inimigos segundo) {
		
		if (primeiro.getInteligencia() == 10) {//espiao
			if (segundo.getInteligencia() == 5) {//soldado
				((SoldadoGuerrilha) segundo).getPontos().setPontualcao(100);
				System.out.println("A vida do Soldado Guerrilha é: "+ ((SoldadoGuerrilha) segundo).getPontos().getPontualcao());
				if (((SoldadoGuerrilha) segundo).getPontos().getPontualcao() <= 0) {
					System.out.println(primeiro.getClass().getSimpleName() +" ganhou");
				}
			}
			else if (segundo.getInteligencia() == 2) {//exercito
				((ExercitoInimigo) segundo).getPontos().setPontualcao(50);
				System.out.println("A vida do Exercito Inimigo é: "+ ((ExercitoInimigo) segundo).getPontos().getPontualcao());
				if (((ExercitoInimigo) segundo).getPontos().getPontualcao() <= 0) {
					System.out.println(primeiro.getClass().getSimpleName() +" ganhou");
				}
			}
		}
		else if (primeiro.getInteligencia() == 5) {//soldado
			if (segundo.getInteligencia() == 10) {//espiao
				((SoldadoGuerrilha) primeiro).getPontos().setPontualcao(100);
				System.out.println("A vida do Soldado Guerrilha é: "+ ((SoldadoGuerrilha) primeiro).getPontos().getPontualcao());
				if (((SoldadoGuerrilha) primeiro).getPontos().getPontualcao() <= 0) {
					System.out.println(segundo.getClass().getSimpleName() +" ganhou");
				}
			}
			else if (segundo.getInteligencia() == 2) {//exercito
				((ExercitoInimigo) segundo).getPontos().setPontualcao(50);
				System.out.println("A vida do Exercito Inimigo é: "+ ((ExercitoInimigo) segundo).getPontos().getPontualcao());
				if (((ExercitoInimigo) segundo).getPontos().getPontualcao() <= 0) {
					System.out.println(primeiro.getClass().getSimpleName() +" ganhou");
				}
			}
		}
		else if (primeiro.getInteligencia() == 2) {//exercito
			if (segundo.getInteligencia() == 10) {//espiao
				((ExercitoInimigo) primeiro).getPontos().setPontualcao(100);
				System.out.println("A vida do Exercito Inimigo é: "+ ((ExercitoInimigo) primeiro).getPontos().getPontualcao());
				if (((ExercitoInimigo) primeiro).getPontos().getPontualcao() <= 0) {
					System.out.println(segundo.getClass().getSimpleName() +" ganhou");
				}
			}
			else if (segundo.getInteligencia() == 5) {//soldado
				((ExercitoInimigo) primeiro).getPontos().setPontualcao(50);
				System.out.println("A vida do Exercito Inimigo é: "+ ((ExercitoInimigo) primeiro).getPontos().getPontualcao());
				if (((ExercitoInimigo) primeiro).getPontos().getPontualcao() <= 0) {
					System.out.println(segundo.getClass().getSimpleName() +" ganhou");
				}
			}
		}
		
	}	
}
