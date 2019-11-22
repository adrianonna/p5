package aplicacao;

import model.SoftwareEmail;
import model.Software;
import model.SoftwareFactory;
import model.SoftwarePlanilha;
import model.SoftwareTexto;

public class Usuario {

	private static Software abrirPrograma(String tipo, String nome, String path){
		SoftwareFactory sf = null;
		if (tipo.compareTo("editorTexto") == 0)
			sf = new SoftwareTexto();
		
		else if (tipo.compareTo("editorPlanilha") == 0) 
			sf = new SoftwarePlanilha();
		
		else if (tipo.compareTo("gerenciadorEmail") == 0) 
			sf = new SoftwareEmail();
	
		Software s = new Software();
		s.setArquivo(sf.abrirArquivo(nome, path));
		return s;
	}

	
	public static void main(String[] args) {
		Software s1 = abrirPrograma("editorTexto", "Atividade", "C:");
		Software s2 = abrirPrograma("editorPlanilha", "Outra Atividade", "C:Adriano");
		
		System.out.println("editorTexto: "+s1);
		System.out.println("editorPlanilha: "+s2);
		
		
	}

}
