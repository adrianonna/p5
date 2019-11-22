package model;

public class Inimigos {
	private int inteligencia;
	private int forca;
	private int estrategia;
	
	public Inimigos(int i, int f, int e) {
		super();
		this.inteligencia = i;
		this.forca = f;
		this.estrategia = e;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(int estrategia) {
		this.estrategia = estrategia;
	}

	@Override
	public String toString() {
		return "Inimigo [inteligencia=" + inteligencia + ", forca=" + forca + ", estrategia=" + estrategia + "]";
	}	
		
}
