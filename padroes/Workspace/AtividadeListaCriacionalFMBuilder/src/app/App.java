package app;

import model.Arquivo;
import model.ArquivoTextoBuilder;
import model.DiretorArquivo;
import model.Software;
import model.SoftwareFactory;

public class App {

	public static void main(String[] args) {
	    DiretorArquivo diretorArquivo = new DiretorArquivo(new ArquivoTextoBuilder());
	    diretorArquivo.construirArquivo();
	    Arquivo arquivo = diretorArquivo.getArquivo();
	    
	    System.out.println(arquivo);
//	    System.out.println(arquivo.ler());
	    
//	    Arquivo novoArquivo = arquivo.clonar();
//	    System.out.println(novoArquivo);
	    
	    arquivo.setAutoCopia(true);
	    
	    //quando clonar, o valor de copia é false
	    Arquivo novoArquivo = arquivo.clonar();
	    
	    System.out.println(novoArquivo.getAutoCopia());
	    
	    novoArquivo.setNome("NovoArquivoTexto");
//	    System.out.println(novoArquivo);
	    
		SoftwareFactory factory = new SoftwareFactory();
		Software programaEmail = factory.getSoftware("softwareTexto");
		
		programaEmail.setArquivoPrototype(arquivo);
		
//		System.out.println(programaEmail);
	}

}
