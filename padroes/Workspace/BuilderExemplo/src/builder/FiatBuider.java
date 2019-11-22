package builder;

public class FiatBuider extends CarroBuilder{
	
	public FiatBuider() {}

	public void buildPreco() {
        // Operacao complexa. 
        carro.setPreco(25000.00);
    }
 
    public void buildDscMotor() {
        // Operacao complexa.
        carro.setDscMotor("Fire Flex 1.0");
    }
 
    public void buildAnoDeFabricacao() {
        // Operacao complexa.
        carro.setAnoDeFabricacao(2011);
    }
 
    public void buildModelo() {
        // Operacao complexa.
        carro.setModelo("Palio");
    }
 
    public void buildMontadora() {
        // Operacao complexa.
        carro.setMontadora("Fiat");
    }

}
