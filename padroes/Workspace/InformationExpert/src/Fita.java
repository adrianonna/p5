public class Fita {
	
    private String titulo;
    private Tipo codigoDePreco;

    public Fita(String titulo, Tipo codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String t) {
    	this.titulo = t;
    }

    public Tipo getCodigoDePreco() {
        return codigoDePreco;
    }
    
    public void setCodigoDePreco(Tipo codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }
}