
public class app {

	public static void main(String[] args) {
		AbstracaoTamanho at1 = new TamanhoPequeno(new CocaCola());
		at1.beber();
		
		AbstracaoTamanho at2 = new TamanhoMedio(new Fanta());
		at2.beber();
		
		AbstracaoTamanho at3 = new TamanhoGrande(new Guarana());
		at3.beber();
		
		AbstracaoTamanho at4 = new TamanhoFamilia(new Sprite());
		at4.beber();
	}

}
