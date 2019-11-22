
public class Aluguel {
	private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }
    
    public void setFita(Fita f) {
    	this.fita = f;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }
    
    public void setDiasAlugada(int dias) {
    	this.diasAlugada = dias;
    }

}
