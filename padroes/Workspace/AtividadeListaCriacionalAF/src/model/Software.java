package model;

public class Software {

	private ArquivoPrototype arquivo;
	
	public Software() {}
	
	public ArquivoPrototype getArquivo() {
		return arquivo;
	}

	public void setArquivo(ArquivoPrototype arquivo) {
		this.arquivo = arquivo;
	}
	
//	public abstract Software abrir();

	@Override
	public String toString() {
		return "Software genérico!";
	}
	
}
