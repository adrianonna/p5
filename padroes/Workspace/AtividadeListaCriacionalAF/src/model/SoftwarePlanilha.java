package model;

public class SoftwarePlanilha extends SoftwareFactory {

	@Override
	public ArquivoPlanilha abrirArquivo(String nome, String path) {
		return new ArquivoPlanilha(nome, path);
	}

	@Override
	public String toString() {
		return "SoftwarePlanilha [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
