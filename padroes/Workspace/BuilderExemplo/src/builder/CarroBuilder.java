package builder;

import model.Carro;

public abstract class CarroBuilder {
	
	protected Carro carro;
	 
    public CarroBuilder() {
        carro = new Carro();
    }
 
    public abstract void buildPreco();
 
    public abstract void buildDscMotor();
 
    public abstract void buildAnoDeFabricacao();
 
    public abstract void buildModelo();
 
    public abstract void buildMontadora();
    
//    public void construirCarroBuilder() {
//    	buildPreco();
//        buildAnoDeFabricacao();
//        buildDscMotor();
//        buildModelo();
//        buildMontadora();
//    }
 
    public Carro getCarro() {
        return carro;
    }
    
    
	
    

}
