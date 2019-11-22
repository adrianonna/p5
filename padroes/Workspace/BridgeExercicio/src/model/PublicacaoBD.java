package model;

public class PublicacaoBD implements Ponte{

	public PublicacaoBD() {}

	@Override
	public String criandoPublicacaoPonte(String string) {
		return (string + " - BD");
	}

}
