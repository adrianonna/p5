package model;

public class JanelaAviso extends Janela {
	
	public JanelaAviso(JanelaImplementada j) {
        super(j);
    }
 
    public void desenhar() {
        System.out.println(desenharJanela("Janela de Aviso"));
        System.out.println(desenharBotao("Botao Ok \n"));
    }
}
