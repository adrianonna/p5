package model;

public class SalaFamilia extends Ambiente implements SalaState{

	@Override
	public SalaState modoFesta() {
		System.out.println("Sala Festa");
		return new SalaFesta();
	}

	@Override
	public SalaState ModoEconomia() {
		System.out.println("Sala Economia");
		return new SalaEconomia();
	}

	@Override
	public SalaState modoFamilia() {
		System.out.println("Ja sou sala familia!");
		return this;
	}

}
