package visao;
import model.GraficoComposto;
import model.Linha;
import model.Retangulo;
import model.Texto;

public class ProgramaDesenho {

	
	public static void desenhoSimples(){
		Linha l = new Linha();
		l.desenhar();
		
		Retangulo r = new Retangulo();
		r.desenhar();
		
		Texto t = new Texto();
		t.desenhar();
	}
	
	
	public static void desenhoComplexo(){
		GraficoComposto g = new GraficoComposto();
		
		Texto t2 = new Texto();
		Retangulo r2 = new Retangulo();
		g.adicionarF(t2);
		g.adicionarF(r2);
		
		g.desenhar();
	}
	
	
	public static void main(String[] args) {
		desenhoComplexo();
		
		System.out.println("\nDesenho simples:");
		desenhoSimples();

	}

}
