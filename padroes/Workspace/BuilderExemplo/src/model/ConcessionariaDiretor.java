package model;

import builder.CarroBuilder;

public class ConcessionariaDiretor {
	protected CarroBuilder montadora;
	 
    public ConcessionariaDiretor(CarroBuilder montadora) {
        this.montadora = montadora;
    }
 
    public void construirCarro() {
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();
        montadora.buildDscMotor();
        montadora.buildModelo();
        montadora.buildMontadora();
        
        //montadora.construirCarroBuilder();
    }
 
    public Carro getCarro() {
        return montadora.getCarro();
    }
}
