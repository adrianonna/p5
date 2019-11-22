package model;
public class JanelaDialogo extends Janela {
	
	public JanelaDialogo(JanelaImplementada j) {
		super(j);
	}

	public void desenhar() {
		System.out.println(desenharJanela("Janela de Dialogo"));
		System.out.println(desenharBotao("Botao Sim"));
		System.out.println(desenharBotao("Botao Nao"));
		System.out.println(desenharBotao("Botao Cancelar \n"));
	}
}
