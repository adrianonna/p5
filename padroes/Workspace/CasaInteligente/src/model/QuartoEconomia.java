package model;

public class QuartoEconomia extends Ambiente implements QuartoState{

	@Override
	public QuartoState modoFesta() {
		System.out.println("Quarto Festa!");
		return new QuartoFesta();
	}

	@Override
	public QuartoState ModoEconomia() {
		System.out.println("Já sou quarto economia!");
		return this;
	}

	@Override
	public QuartoState modoFamilia() {
		System.out.println("Quarto Familia!");
		return new QuartoFamilia();
	}

}
