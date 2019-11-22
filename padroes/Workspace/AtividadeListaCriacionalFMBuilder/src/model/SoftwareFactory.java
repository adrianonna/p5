package model;

public class SoftwareFactory {

	public SoftwareFactory() {}

	public Software getSoftware(String tipoSoftware) {
		if (tipoSoftware.equals("softwareTexto")) 
			return new SoftwareTexto(tipoSoftware);
		else if (tipoSoftware.equals("softwarePlanilha")) 
			return new SoftwarePlanilha(tipoSoftware);
		else if (tipoSoftware.equals("softwareEmail"))
			return new SoftwareEmail(tipoSoftware);
		else
			return null;
	}
	
}
