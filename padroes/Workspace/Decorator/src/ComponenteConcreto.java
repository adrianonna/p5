public class ComponenteConcreto implements Componente{
	private Object dados;

	public Object getDados() {
		return dados;
	}

	public void operacao(Object arg) {
		System.out.println("Operacaoo - Componente Concreto");
	}
}
