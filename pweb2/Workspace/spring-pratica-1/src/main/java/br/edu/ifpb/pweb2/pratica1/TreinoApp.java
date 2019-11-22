package br.edu.ifpb.pweb2.pratica1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TreinoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TreinamentoIntf treinamento = context.getBean("treinamento", Treinamento.class);
		
		treinamento.fazTreinamento();
		
		context.close();
	}

}
