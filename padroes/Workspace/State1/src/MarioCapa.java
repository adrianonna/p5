
public class MarioCapa implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Ganhou 1000 pontos!");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario Grande com Fogo!");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Ganhou 1000 pontos!");
		return this;
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario Grande!");
		return new MarioGrande();
	}

}
