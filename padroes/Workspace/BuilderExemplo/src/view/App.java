package view;

import builder.FiatBuider;
import builder.VolksBuilder;
import model.Carro;
import model.ConcessionariaDiretor;

public class App {
	public static void main(String[] args) {
	    ConcessionariaDiretor concessionaria = new ConcessionariaDiretor(new FiatBuider());
	    concessionaria.construirCarro();
	
	    Carro carro = concessionaria.getCarro(); 
	    System.out.println(carro);
	    
	    System.out.println();
	 
	    
	    concessionaria = new ConcessionariaDiretor(new VolksBuilder());
	    concessionaria.construirCarro();
	    carro = concessionaria.getCarro();
	    System.out.println(carro);
 
	}
}
