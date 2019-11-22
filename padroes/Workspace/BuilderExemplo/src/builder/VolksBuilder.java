package builder;

public class VolksBuilder extends CarroBuilder{
	
	public VolksBuilder() {}

	public void buildPreco() {
        // Operacao complexa. 
        carro.setPreco(70000.00);
    }
 
    public void buildDscMotor() {
        // Operacao complexa.
        carro.setDscMotor("Eletrico");
    }
 
    public void buildAnoDeFabricacao() {
        // Operacao complexa.
        carro.setAnoDeFabricacao(2019);
    }
 
    public void buildModelo() {
        // Operacao complexa.
        carro.setModelo("Gol");
    }
 
    public void buildMontadora() {
        // Operacao complexa.
        carro.setMontadora("Volkswagen");
    }

}
