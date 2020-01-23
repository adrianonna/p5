package model;

public class CozinhaEconomia implements CozinhaState{

	@Override
	public CozinhaState modoFesta() {
		System.out.println("Cozinha Festa!");
		return new CozinhaFesta();
	}

	@Override
	public CozinhaState ModoEconomia() {
		System.out.println("Já sou cozinha economia!");
		return this;
	}

	@Override
	public CozinhaState modoFamilia() {
		System.out.println("Cozinha Familia");
		return new CozinhaFamilia();
	}

}
