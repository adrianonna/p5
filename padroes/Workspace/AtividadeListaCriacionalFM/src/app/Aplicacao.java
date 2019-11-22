package app;

import model.ArquivoPrototype;
import model.Software;
import model.SoftwareFactory;

public class Aplicacao {
	public static void main(String[] args) {
		//Escolhendo o software e seu correspondente arquivo a serem fabricados
		SoftwareFactory factory = new SoftwareFactory();
		Software programaEmail = factory.getSoftware("softwareEmail", "Nome do arquivoEmail", "C:email");
		
		//lendo o arquivo que foi criado junto ao software escolhido
		System.out.println(programaEmail.ler());
		
		//pegando apenas o arquivo criado do software
		ArquivoPrototype arquivoPrototipo = programaEmail.getArquivoPrototype();

		//habilita a opção para poder copiar
		arquivoPrototipo.setCopy(true);
		
		//clonando esse arquivo
		ArquivoPrototype novoArquivoEmail = arquivoPrototipo.clonar();

		//alterando valores do arquivo clonado
		novoArquivoEmail.setNome("Outro nome de arquivo do email");
		novoArquivoEmail.setPath("C:ArquivoEmail");
		novoArquivoEmail.setEmail("adriano.amaral147@gmail.com");
		novoArquivoEmail.setProprietário("Adriano Amaral");
		
		//mostra qual arquivo estou lendo
		System.out.println(novoArquivoEmail.ler());
		
		//mostrando o arquivo de email clonado
		System.out.println(novoArquivoEmail);
    
	}
}
