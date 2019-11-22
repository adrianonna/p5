package model;

public class SoftwareTexto extends SoftwareFactory {

	@Override
	public ArquivoPrototype abrirArquivo(String nome, String path) {
		return new ArquivoTexto(nome, path);
	}

	@Override
	public String toString() {
		return "SoftwareTexto [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
