package model;

public class PalioPrototype extends CarroPrototype{

	protected PalioPrototype(PalioPrototype palioPrototype) {
        this.valorCompra = palioPrototype.getValorCompra();
    }
 
    public PalioPrototype() {
        valorCompra = 20000.00;
    }
 
    public String exibirInfo() {
        return "Modelo: Palio\nMontadora: Fiat\n" + "Valor: R$"
                + getValorCompra();
    }
 
    public CarroPrototype clonar() {
        return new PalioPrototype(this);
    }

}
