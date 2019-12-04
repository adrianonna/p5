import java.util.List;

public abstract class Lista {

	Ponte ponte;


	public Lista(Ponte ponte) {
		super();
		this.ponte = ponte;
	}

	public abstract void adicionar(String s);
//	public abstract void adicionar(Integer i);
	
	public abstract List<String> imprimir();
	
	
}
