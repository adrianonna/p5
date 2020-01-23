package model;

public class CozinhaFamilia extends Ambiente implements CozinhaState{

	@Override
	public CozinhaState modoFesta() {
		System.out.println("Cozinha Festa!");
		return new CozinhaFesta();
	}

	@Override
	public CozinhaState ModoEconomia() {
		System.out.println("Cozinha Economia!");
		return new CozinhaEconomia();
	}

	@Override
	public CozinhaState modoFamilia() {
		System.out.println("Já sou cozinha familia!");
		return this;
	}

}
