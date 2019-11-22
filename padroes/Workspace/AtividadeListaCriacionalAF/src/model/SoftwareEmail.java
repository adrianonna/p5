package model;

public class SoftwareEmail extends SoftwareFactory {

	public ArquivoEmail abrirArquivo(String nome, String path) {
		return new ArquivoEmail(nome, path);
	}

	@Override
	public String toString() {
		return "SoftwareEmail [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
