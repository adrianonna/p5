
public class app {

	public static void main(String[] args) {
		Sistema s = new Sistema();
		Arquivos a = new Arquivos();
		
		Arquivo a1 = new Arquivo();
		a1.setNome("Sou o arquivo a1");
		a1.setTamanho(512);
		Arquivo a2 = new Arquivo();
		a2.setNome("Sou o arquivo a2");
		a2.setTamanho(1024);
		Arquivo a3 = new Arquivo();
		a3.setNome("Sou o arquivo a3");
		a3.setTamanho(820);
		Arquivo a4 = new Arquivo();
		a4.setNome("Sou o arquivo a4");
		a4.setTamanho(5000);
		
		Pasta p1 = new Pasta();
		p1.setNome("Pasta 1");
		Pasta p2 = new Pasta();
		p2.setNome("Pasta 2");
		Pasta p3 = new Pasta();
		p3.setNome("Pasta 3");
		
		p1.setArquivo(a1);
		p1.setArquivo(a2);
		
		p2.setSubPasta(p1);
		p2.setArquivo(a3);
		
		p3.setArquivo(a4);
		
		a.setItens(p2);
		a.setItens(p3);
		s.setA(a);
		
		System.out.println(s);
		System.out.println(s.getA());
		System.out.println(s.getA().getListaItens().get(0));
	}

}
