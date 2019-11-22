package visao;
import model.Janela;
import model.JanelaAviso;
import model.JanelaDialogo;
import model.JanelaLinux;
import model.JanelaWindows;

public class DemoBridge {

	public static void main(String[] args) {
		Janela janela = new JanelaDialogo(new JanelaLinux());
		janela.desenhar();
		System.out.println();
		
		janela = new JanelaAviso(new JanelaLinux());
		janela.desenhar();
		System.out.println();
		
		janela = new JanelaDialogo(new JanelaWindows());
		janela.desenhar();
		System.out.println();

	}

}
