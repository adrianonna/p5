
public class DecoradorConcretoUm extends Decorador{
	
	private Object estado;
	public DecoradorConcretoUm(Componente componente, Object estado) {
		super(componente);
		this.estado= estado;
	}
	
	public void operacao(Object arg) {
		// ... comportamento Adicional
		System.out.println("Comportamento Adicional Decorador Concreto Um");
		super.operacao(estado);// ...}
	}
}
