package model;

public class QuartoFamilia extends Ambiente implements QuartoState{

	@Override
	public QuartoState modoFesta() {
		System.out.println("Quarto Festa!");
		return new QuartoFesta();
	}

	@Override
	public QuartoState ModoEconomia() {
		System.out.println("Quarto Economia!");
		return new QuartoEconomia();
	}

	@Override
	public QuartoState modoFamilia() {
		System.out.println("Já sou quarto familia!");
		return this;
	}

}
