package work;

import model.Jogo2D;
import model.Jogo3D;
import model.JogoDigital;
import model.JogoRA;
import model.JogoRV;
import model.JogoTabuleiro;

public class Aplicacao {

	public static void main(String[] args) {
		
		JogoDigital jogoDigital = new JogoDigital(1995, "Sega", 0, "Megaman", 4, 10, 1);
		JogoTabuleiro jogoTabuleiro = new JogoTabuleiro("Estratégia", 1, "War", 2, 40, 6);
		Jogo2D jogo2D = new Jogo2D(2000, "EA", 2, "NFS", 3, 30, 1, "PSVita", 1);
		Jogo3D jogo3D = new Jogo3D(2015, "EA", 3, "Battlefield 1", 2, 40, 1, "PS4", 1);
		JogoRA jogoRA = new JogoRA(2017, "Nintendo", 4, "Mario", 3, 30, 1, "Wii", "oi?");
		JogoRV jogoRV = new JogoRV(2018, "EA", 5, "Star Wars", 1, 50, 1, "Ultra", "Master");
		
		Cliente cliente = new Cliente(0, "Alguém");
		Funcionario func = new Funcionario();
		Compra compra = new Compra();
		compra.setClientes(cliente);
		compra.setFuncionatio(func);
		compra.setJogo(jogoDigital);
		compra.setJogo(jogo3D);
		compra.setTempo(2);
		
		
		System.out.println(func.solicitarAluguel(jogo2D.getIdJogo()));
		System.out.println(func.finalizarCompra());
		System.out.println(compra.calcularCompra());
		
	}

}
