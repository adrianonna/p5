package br.edu.ifpb.pweb2.pratica2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TreinoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TreinoSpringConfig.class);

//		TreinamentoIntf treinamento = context.getBean(TreinamentoIntf.class);
//		TreinamentoIntf treinamento2 = context.getBean("treinamento", TreinamentoIntf.class); //treinamento é a class Treinamento que contem o @Scope("singleton")
		
		TreinamentoIntf treinamento = context.getBean("treinamentoCrossFit", TreinamentoIntf.class);
		
		System.out.println(treinamento);
//		System.out.println(treinamento2);
		
		treinamento.fazTreinamento();
		
		context.close();
	}

}
