
public class ComponenteConcreto implements Componente {

	public void executarTarefa() { 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}