package model;

public class SalaEconomia extends Ambiente implements SalaState{

	@Override
	public SalaState modoFesta() {
		System.out.println("Sala Festa");
		return new SalaFesta();
	}

	@Override
	public SalaState ModoEconomia() {
		System.out.println("Ja sou sala economia!");
		return this;
	}

	@Override
	public SalaState modoFamilia() {
		System.out.println("Sala Familia");
		return new SalaFamilia();
	}

}
