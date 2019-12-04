public abstract class Decorador implements Componente {
	protected Componente componente;

	public Decorador(Componente componente) {
		this.componente = componente;
	}

	public Object getDados() {
		return componente.getDados();
	}

	public void operacao(Object arg) {
		componente.operacao(arg);
	}
}
