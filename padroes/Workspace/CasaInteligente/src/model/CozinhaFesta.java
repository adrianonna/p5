package model;

public class CozinhaFesta implements CozinhaState{

	@Override
	public CozinhaState modoFesta() {
		System.out.println("Já sou cozinha festa!");
		return this;
	}

	@Override
	public CozinhaState ModoEconomia() {
		System.out.println("Cozinha Economia!");
		return new CozinhaEconomia();
	}

	@Override
	public CozinhaState modoFamilia() {
		System.out.println("Cozinha Familia");
		return new CozinhaFamilia();
	}

}
