
public class Interceptador implements Componente{
	private Componente componente;
	
	public Interceptador(Componente componente) {
		this.componente = componente;
	}
	
	public void executarTarefa() {
		long antes = System.currentTimeMillis();
		componente.executarTarefa();
		long depois = System.currentTimeMillis();
		System.out.println((depois - antes) + " ms");
	}
}
