package model;

public class QuartoFesta extends Ambiente implements QuartoState{

	@Override
	public QuartoState modoFesta() {
		System.out.println("Já sou quarto festa!");
		return this;
	}

	@Override
	public QuartoState ModoEconomia() {
		System.out.println("Quarto Economia!");
		return new QuartoEconomia();
	}

	@Override
	public QuartoState modoFamilia() {
		System.out.println("Quarto Familia!");
		return new QuartoFamilia();
	}

}
