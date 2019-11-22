package model;

public class Carro {
	    private double preco;
	    private String dscMotor;
	    private int anoDeFabricacao;
	    private String modelo;
	    private String montadora;
		
	    public Carro() {}

		public Carro(double preco, String dscMotor, int anoDeFabricacao, String modelo, String montadora) {
			this.preco = preco;
			this.dscMotor = dscMotor;
			this.anoDeFabricacao = anoDeFabricacao;
			this.modelo = modelo;
			this.montadora = montadora;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public String getDscMotor() {
			return dscMotor;
		}

		public void setDscMotor(String dscMotor) {
			this.dscMotor = dscMotor;
		}

		public int getAnoDeFabricacao() {
			return anoDeFabricacao;
		}

		public void setAnoDeFabricacao(int anoDeFabricacao) {
			this.anoDeFabricacao = anoDeFabricacao;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getMontadora() {
			return montadora;
		}

		public void setMontadora(String montadora) {
			this.montadora = montadora;
		}

		public String toString() {
			return "Carro [preco=" + preco + ", dscMotor=" + dscMotor + ", anoDeFabricacao=" + anoDeFabricacao
					+ ", modelo=" + modelo + ", montadora=" + montadora + "]";
		}
		
		
		
}
