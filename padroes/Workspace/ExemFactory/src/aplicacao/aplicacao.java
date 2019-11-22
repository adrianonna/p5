package aplicacao;

import model.Factory;
import model.Pessoa;

public class aplicacao {

	public static void main(String[] args) {
		Factory fabrica = new Factory();
		Pessoa p = fabrica.getPessoa("homem", "Adriano");
		System.out.println(p.quemEh());
		
		Pessoa p2 = fabrica.getPessoa("mulher", "Taysa");
		System.out.println(p2.quemEh());
		
		Pessoa p3 = fabrica.getPessoa("indefinido", "Alguem");
		System.out.println(p3.quemEh());
	}

}
