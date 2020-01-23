package model;

public class SalaFesta extends Ambiente implements SalaState{

	@Override
	public SalaState modoFesta() {
		System.out.println("Já sou sala festa!");
		return this;
	}

	@Override
	public SalaState ModoEconomia() {
		System.out.println("Sala Economia");
		return new SalaEconomia();
	}

	@Override
	public SalaState modoFamilia() {
		System.out.println("Sala Familia");
		return new SalaFamilia();
	}

}
