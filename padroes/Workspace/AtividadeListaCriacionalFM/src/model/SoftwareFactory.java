package model;

public class SoftwareFactory {

	public SoftwareFactory() {}

	public Software getSoftware(String tipoSoftware, String nome, String path) {
		if (tipoSoftware.equals("softwareTexto")) {
			ArquivoTexto arquivoTexto = new ArquivoTexto(nome, path);
			return new SoftwareTexto(tipoSoftware, arquivoTexto);
		}
		else if (tipoSoftware.equals("softwarePlanilha")) {
			ArquivoPlanilha arquivoPlanilha = new ArquivoPlanilha(nome, path);
			return new SoftwarePlanilha(tipoSoftware, arquivoPlanilha);
		}
		else if (tipoSoftware.equals("softwareEmail")) {
			ArquivoEmail arquivoEmail = new ArquivoEmail(nome, path);
			return new SoftwareEmail(tipoSoftware, arquivoEmail);
		}
		else
			return null;
	}
	
}
