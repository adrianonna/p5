public class DecoradorConcretoDois extends Decorador {
	public DecoradorConcretoDois(Componente componente) {
		super(componente);
	}

	public String getDadosComoString() {
		return getDados().toString();
	}

	private Object transformar(Object o) {
		System.out.println("Retorna Objeto");
		return null;
	}

	public Object getDados() {
		return transformar(getDados());
	}

	public void operacao(Object arg) {
		// ... comportamento Adicional
		componente.operacao(arg);
	}
}
