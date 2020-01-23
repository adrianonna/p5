package app;

import java.util.Scanner;

import controller.CasaController;
import model.Ambiente;


public class app {
	
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	CasaController casaController = new CasaController();
	
	int opcao, opcao2;
	boolean cond = true, auth = false;
	String user, pass;
	
	do {
		System.out.println("Digite o usuario:");
		user = teclado.next();
		System.out.println("Digite a senha:");
		pass = teclado.next();
		if (user.equals("admin") && pass.equals("123")) {
			System.out.println("Logado como Admin!");
			auth = true;
		}else if (user.equals("convidado") && pass.equals("123")) {
			System.out.println("Logado como Convidado!");
			auth = true;
		} else {
			System.out.println("Usuário inválido!!!");
			System.out.println();
		}
	} while (auth != true);
	
	do {
		do {
			System.out.println();
			System.out.println("Escolha uma opcao:\n"
					+ "1 - Cozinha\n"
					+ "2 - Quarto\n"
					+ "3 - Sala\n"
					+ "4 - Sair");
			opcao = teclado.nextInt();
			if (opcao < 1 || opcao > 4) {
				System.out.println("Opcaoo invalida!");
			} else if (opcao == 4) {
				cond = false;
				System.out.println("Saindo...");
			}
		} while (opcao < 1 || opcao > 4);
		
		if (cond == true) {
			do {
				System.out.println();
				System.out.println("Escolha qual modo deseja ativar:\n"
									+ "1 - Modo Familia\n"
									+ "2 - Modo Festa\n"
									+ "3 - Modo Economia\n"
									+ "4 - Sair");
				opcao2 = teclado.nextInt();
				if (opcao2 < 1 || opcao2 > 4) {
					System.out.println("Opcao invalida!");
				} else if (opcao == 1 && opcao2 == 1) {
					Ambiente cozinha = casaController.getAmbiente("cozinha", "familia");
					cozinha = casaController.construir(cozinha, "familia");
					System.out.println(cozinha.getNome());
					System.out.println(cozinha.getDescricao());
					System.out.println(cozinha.getDispositivos());
				} else if (opcao == 1 && opcao2 == 2) {
					Ambiente cozinha = casaController.getAmbiente("cozinha", "festa");
					cozinha = casaController.construir(cozinha, "festa");
					System.out.println(cozinha.getNome());
					System.out.println(cozinha.getDescricao());
					System.out.println(cozinha.getDispositivos());
				} else if (opcao == 1 && opcao2 == 3) {
					Ambiente cozinha = casaController.getAmbiente("cozinha", "economia");
					cozinha = casaController.construir(cozinha, "economia");
					System.out.println(cozinha.getNome());
					System.out.println(cozinha.getDescricao());
					System.out.println(cozinha.getDispositivos());
				} else if (opcao == 2 && opcao2 == 1) {
					Ambiente quarto = casaController.getAmbiente("quarto", "familia");
					quarto = casaController.construir(quarto, "familia");
					System.out.println(quarto.getNome());
					System.out.println(quarto.getDescricao());
					System.out.println(quarto.getDispositivos());
				} else if (opcao == 2 && opcao2 == 2) {
					Ambiente quarto = casaController.getAmbiente("quarto", "festa");
					quarto = casaController.construir(quarto, "festa");
					System.out.println(quarto.getNome());
					System.out.println(quarto.getDescricao());
					System.out.println(quarto.getDispositivos());
				} else if (opcao == 2 && opcao2 == 3) {
					Ambiente quarto = casaController.getAmbiente("quarto", "economia");
					quarto = casaController.construir(quarto, "economia");
					System.out.println(quarto.getNome());
					System.out.println(quarto.getDescricao());
					System.out.println(quarto.getDispositivos());
				} else if (opcao == 3 && opcao2 == 1) {
					Ambiente sala = casaController.getAmbiente("sala", "familia");
					sala = casaController.construir(sala, "familia");
					System.out.println(sala.getNome());
					System.out.println(sala.getDescricao());
					System.out.println(sala.getDispositivos());
				} else if (opcao == 3 && opcao2 == 2) {
					Ambiente sala = casaController.getAmbiente("sala", "festa");
					sala = casaController.construir(sala, "festa");
					System.out.println(sala.getNome());
					System.out.println(sala.getDescricao());
					System.out.println(sala.getDispositivos());
				} else if (opcao == 3 && opcao2 == 3) {
					Ambiente sala = casaController.getAmbiente("sala", "economia");
					sala = casaController.construir(sala, "economia");
					System.out.println(sala.getNome());
					System.out.println(sala.getDescricao());
					System.out.println(sala.getDispositivos());
				} else if (opcao2 == 4){
					cond = false;
					System.out.println("Saindo...");
				}
			} while (opcao2 < 1 || opcao2 > 4);
		}		
	} while(cond == true);
		
	
	
	
////	MODO 1
//	Ambiente cozinha = casaController.getAmbiente("cozinha", "festa");
//	cozinha = casaController.construir(cozinha, "festa");
//	System.out.println(cozinha.getNome());
//	System.out.println(cozinha.getDescricao());
//	System.out.println(cozinha.getDispositivos());
//	
//
//	System.out.println();
//	Ambiente sala = casaController.getAmbiente("sala", "festa");
//	sala = casaController.construir(sala, "festa");
////	System.out.println(sala.getLuz());
//	System.out.println(sala.getNome());
//	System.out.println(sala.getDescricao());
//	System.out.println(sala.getDispositivos());
//	
//	
//	System.out.println();
//	Ambiente quarto = casaController.getAmbiente("quarto", "economia");
//	quarto = casaController.construir(quarto, "economia");
//	System.out.println(quarto.getNome());
//	System.out.println(quarto.getDescricao());
//	System.out.println(quarto.getDispositivos());
//
//	
////	ALTERANDO O MODO DA SALA PARA FESTA!
//	System.out.println();
//	sala = casaController.getAmbiente("sala", "economia");
//	sala = casaController.construir(sala, "economia");
//	System.out.println(sala.getNome());
//	System.out.println(sala.getDescricao());
//	System.out.println(sala.getDispositivos());
	
	

	
	
	
	//MODO 2
//	
//	Ambiente cozinha = casaController.getAmbiente("cozinha");
//	cozinha = casaController.construir(cozinha, "economia");
//	System.out.println(cozinha.getNome());
//	System.out.println(cozinha.getDescricao());
//	
//	
//	System.out.println();
//	Ambiente sala = casaController.getAmbiente("sala");
//	sala = casaController.construir(sala, "festa");
////	System.out.println(sala.getLuz());
//	System.out.println(sala.getNome());
//	System.out.println(sala.getDescricao());
//	System.out.println(sala.getModoEstado()); 
//	System.out.println(sala.estaAtivado());
//
//	
//	System.out.println();
//	Ambiente quarto = casaController.getAmbiente("quarto");
//	quarto = casaController.construir(quarto, "festa");
//	System.out.println(quarto.getNome());
//	System.out.println(quarto.getDescricao());
//	
//	
//	System.out.println();
//	sala = casaController.getAmbiente("sala");
//	sala = casaController.construir(sala, "economia");
//	System.out.println(sala.getNome());
//	System.out.println(sala.getDescricao());
	
	}
}
