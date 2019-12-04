
public abstract class NumeroDecorator extends Numero{

	Numero numero;

	
	public NumeroDecorator(Numero num) {
		this.numero = num;
	}
	
    public String getNum() {
        return simboloE + numero.getNum()  + simboloD;
    }
}
