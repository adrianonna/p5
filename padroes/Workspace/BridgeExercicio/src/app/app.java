package app;


import model.Livro;
import model.Publicacao;
import model.PublicacaoBD;
import model.PublicacaoXML;
import model.Revista;

public class app {

	public static void main(String[] args) {
		Publicacao publicacao = new Livro(new PublicacaoBD(), "Título do livro", "Autor BD", "ISBN 1234");
		publicacao.criar();
		
		Publicacao publicacao2 = new Livro(new PublicacaoXML(), "Título do livro", "Autor XML", "ISBN 5678");
		publicacao2.criar();
		
		Publicacao publicacao3 = new Revista(new PublicacaoBD(), "Título da revista", "Autor BD", "Artigo 1234");
		publicacao3.criar();
		
		Publicacao publicacao4 = new Revista(new PublicacaoXML(), "Título da revista", "Autor XML", "Artigo 5678");
		publicacao4.criar();
	}

}
